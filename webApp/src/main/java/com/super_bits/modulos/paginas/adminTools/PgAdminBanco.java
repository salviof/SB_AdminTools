/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.DevOpsPersistencia;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreOutputs;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreStringValidador;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaCampo;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;

import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.coletivojava.fw.api.tratamentoErros.FabErro;
import org.primefaces.event.FileUploadEvent;
import org.superBits.utilitario.editorArquivos.importacao.ImportacaoExcel;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB)
@SessionScoped
@Named
@InfoPagina(nomeCurto = "ADM_BANCO", tags = {"Administração de Banco"})
public class PgAdminBanco extends MB_PaginaConversation {

    private List<EstruturaDeEntidade> entidadesDisponiveis;
    private EstruturaDeEntidade entidadeSelecionada;
    private EstruturaCampo campoSelecionado;
    private Map<EstruturaCampo, Integer> mapaCampos;
    private int numeroDaColunaCampoSelecionado;
    private AcaoDoSistema acaoFormImportador;
    private AcaoDoSistema acaoFormEnviarArquivo;
    private AcaoDoSistema acaoFromMapearColunas;
    private AcaoDoSistema acaoCtrProcessar;
    private AcaoDoSistema acaoCtrGravarDados;
    private AcaoDoSistema acaoPersistirBanco;
    private String nomeArquivoEnviado;
    private String tamanhoArquivoEnviado;
    private String caminhoArquhivoImportacao;
    private ImportacaoExcel<ItfBeanSimples> importador;
    private DevOpsPersistencia devOps;

    private ConexaoBancoRelacional_Dados dadosTesteConexao = new ConexaoBancoRelacional_Dados();

    public PgAdminBanco() {
        super();

    }

    @Override
    public void executarAcaoSelecionada() {
        super.executarAcaoSelecionada(); //To change body of generated methods, choose Tools | Templates.
        if (isAcaoSelecionadaIgualA(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP)) {
            Class classe = MapaObjetosProjetoAtual.getClasseDoObjetoByNome(entidadeSelecionada.getNomeEntidade());
            Map<String, Integer> mapaDeCamposImp = new HashMap<>();
            for (EstruturaCampo cp : mapaCampos.keySet()) {
                mapaDeCamposImp.put(cp.getNomeDeclarado(), numeroDaColunaCampoSelecionado);
            }

            importador
                    = new ImportacaoExcel<>(caminhoArquhivoImportacao,
                            mapaDeCamposImp, classe);
            importador.processar();
            executaAcaoSelecionadaPorEnum(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_ENVIAR_ARQUIVO_IMPORTACAO);
        }
        if (isAcaoSelecionadaIgualA(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PERSISTIR)) {

            if (importador.isPlanilhaCarregada()) {
                String mensagem = "Relatório de falhas:";
                if (importador.getRegistrosSucesso().size() > 0) {

                    for (ItfBeanSimples registro : importador.getRegistrosSucesso()) {
                        if (UtilSBPersistencia.mergeRegistro(registro) == null) {
                            mensagem += "Falha cadastrando " + registro.getNome();
                        }
                    }
                    SBCore.enviarAvisoAoUsuario(mensagem);
                }

            }
        }

    }

    public boolean isUmArquivoEnviado() {
        if (nomeArquivoEnviado == null) {
            return false;
        }
        return new File(caminhoArquhivoImportacao).exists();
    }

    public void enviarArquivo(FileUploadEvent eventoEnvio) {

        try {
            if (UtilSBCoreOutputs.salvarArquivoInput(eventoEnvio.getFile().getInputstream(), caminhoArquhivoImportacao)) {
                nomeArquivoEnviado = eventoEnvio.getFile().getFileName();
                tamanhoArquivoEnviado = String.valueOf(eventoEnvio.getFile().getSize());
            }

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro enviando arquivo por categoria", t);
            SBCore.enviarMensagemUsuario("Erro não esperado enviando:" + eventoEnvio.getFile().getFileName(), FabMensagens.ERRO);
        }
    }

    @PostConstruct
    public void inicio() {
        try {
            entidadesDisponiveis = new ArrayList<>();
            acaoFormImportador = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR.getRegistro();
            acaoFormEnviarArquivo = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_ENVIAR_ARQUIVO_IMPORTACAO.getRegistro();
            acaoFromMapearColunas = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_MAPEAR_COLUNAS.getRegistro();
            acaoCtrProcessar = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP.getRegistro();
            acaoCtrGravarDados = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP.getRegistro();
            acaoPersistirBanco = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PERSISTIR.getRegistro();
            caminhoArquhivoImportacao = SBCore.getControleDeSessao().getSessaoAtual().getPastaTempDeSessao() + "/importacaoExel.xls";

            getAcoesDaPagina().clear();
            getAcoesDaPagina().add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_ENVIAR_ARQUIVO_IMPORTACAO.getRegistro());
            getAcoesDaPagina().add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA.getRegistro());
            getAcoesDaPagina().add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_SQL.getRegistro());
            getAcoesDaPagina().add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_HQL.getRegistro());
            getAcoesDaPagina().add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_TESTES_DE_COEXAO.getRegistro());
            devOps = SBPersistencia.getDevOps();
            for (Class entidade : UtilSBPersistencia.getTodasEntidades()) {
                entidadesDisponiveis.add(MapaObjetosProjetoAtual.getEstruturaObjeto(entidade));
            }
            mapaCampos = new HashMap<>();

            executaAcaoSelecionadaPorEnum(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_ENVIAR_ARQUIVO_IMPORTACAO);
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro inicializando admin banco", t);
        }
    }

    public void zerarMapa() {
        mapaCampos.clear();
    }

    public void adicionarCampo() {
        if (numeroDaColunaCampoSelecionado == 0) {
            SBCore.enviarAvisoAoUsuario("A identificação para coluna 'A' é igual a 1, 0 não é permitido");
            return;
        }
        if (campoSelecionado == null) {
            SBCore.enviarAvisoAoUsuario("Selecione um campo para proceguir");
            return;
        }
        mapaCampos.put(campoSelecionado, numeroDaColunaCampoSelecionado);
    }

    public List<EstruturaDeEntidade> getEntidadesDisponiveis() {
        return entidadesDisponiveis;
    }

    public EstruturaDeEntidade getEntidadeSelecionada() {
        return entidadeSelecionada;
    }

    public AcaoDoSistema getAcaoFormImportador() {
        return acaoFormImportador;
    }

    public AcaoDoSistema getAcaoFormEnviarArquivo() {
        return acaoFormEnviarArquivo;
    }

    public AcaoDoSistema getAcaoFromMapearColunas() {
        return acaoFromMapearColunas;
    }

    public AcaoDoSistema getAcaoCtrProcessar() {
        return acaoCtrProcessar;
    }

    public AcaoDoSistema getAcaoCtrGravarDados() {
        return acaoCtrGravarDados;
    }

    public EstruturaCampo getCampoSelecionado() {
        return campoSelecionado;
    }

    public void setCampoSelecionado(EstruturaCampo campoSelecionado) {
        this.campoSelecionado = campoSelecionado;
    }

    public int getNumeroDaColunaCampoSelecionado() {
        return numeroDaColunaCampoSelecionado;
    }

    public void setNumeroDaColunaCampoSelecionado(int numeroDaColunaCampoSelecionado) {
        this.numeroDaColunaCampoSelecionado = numeroDaColunaCampoSelecionado;
    }

    public void setEntidadeSelecionada(EstruturaDeEntidade entidadeSelecionada) {
        this.entidadeSelecionada = entidadeSelecionada;
        if (!entidadeSelecionada.equals(this.entidadeSelecionada)) {
            mapaCampos.clear();
        }
    }

    public Map<EstruturaCampo, Integer> getMapaCampos() {
        return mapaCampos;
    }

    public ImportacaoExcel<ItfBeanSimples> getImportador() {
        return importador;
    }

    public AcaoDoSistema getAcaoPersistirBanco() {
        return acaoPersistirBanco;
    }

    @Override
    public ItfBeanSimples getBeanSelecionado() {
        return campoSelecionado;
    }

    @Override
    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {
        campoSelecionado = (EstruturaCampo) pBeanSimples;
    }

    public ConexaoBancoRelacional_Dados getDadosTesteConexao() {
        return dadosTesteConexao;
    }

    public void testarPingBanco() {
        try {

            String ipAddress = dadosTesteConexao.getHost();
            if (UtilSBCoreStringValidador.isNuloOuEmbranco(ipAddress)) {
                throw new UnsupportedOperationException("Informe o dominio");
            }

            Process p1 = java.lang.Runtime.getRuntime().exec("ping -c 1 " + ipAddress);
            int returnVal = p1.waitFor();
            boolean inetIsOn = (returnVal == 0);

            if (!inetIsOn) {
                SBCore.enviarMensagemUsuario("Não respondeu", FabMensagens.ALERTA);
            } else {
                SBCore.enviarAvisoAoUsuario("Pong em " + ipAddress);
            }

        } catch (Throwable t) {
            SBCore.enviarMensagemUsuario("Não respondeu", FabMensagens.ALERTA);
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro Executando ping", t);

        }
    }

    public void testarConexao() {

        DevOpsPersistencia devops = new DevOpsPersistencia();
        Map<String, Object> propriedades = new HashMap<>();
        propriedades.put("javax.persistence.jdbc.url", dadosTesteConexao.getProtocolo() + dadosTesteConexao.getHost() + "/" + dadosTesteConexao.getNomeEntityManagerPadrao() + "?createDatabaseIfNotExist=true&useSSL=false");
        propriedades.put("javax.persistence.jdbc.password", dadosTesteConexao.getSenha());
        propriedades.put("javax.persistence.jdbc.user", dadosTesteConexao.getUsuario());

        propriedades.put("hibernate.c3p0.timeout", 300);
        propriedades.put("hibernate.c3p0.idle_test_period", 300);
        propriedades.put("hibernate.connection.is-connection-validation-required", true);
        try {
            Connection conn = DriverManager.getConnection(dadosTesteConexao.getProtocolo() + dadosTesteConexao.getHost() + "/" + dadosTesteConexao.getNomeEntityManagerPadrao() + "?createDatabaseIfNotExist=true&useSSL=false",
                    dadosTesteConexao.getUsuario(), dadosTesteConexao.getSenha());

            EntityManagerFactory emFacturePadrao = Persistence.createEntityManagerFactory(dadosTesteConexao.getNomeEntityManagerPadrao(), propriedades);

            EntityManager em = emFacturePadrao.createEntityManager();
            SBCore.enviarAvisoAoUsuario("Conectado com sucesso");
        } catch (SQLException t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro conectando", t);

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro conectando com o banco de dados", t);
            SBCore.enviarMensagemUsuario("Erro conectando com o banco de dados", FabMensagens.ERRO);
        }

    }

    public void limparECarregarNovoBanco() {
        SBPersistencia.limparBanco();
    }

}
