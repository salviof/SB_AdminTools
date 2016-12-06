/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreOutputs;
import com.super_bits.modulosSB.SBCore.modulos.Mensagens.FabMensagens;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaCampo;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.importacao.ImportacaoExcel;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.FileUploadEvent;

/**
 *
 * @author desenvolvedor
 */
@InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB)
@ViewScoped
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
    private String nomeArquivoEnviado;
    private String tamanhoArquivoEnviado;
    private String caminhoArquhivoImportacao;
    private ImportacaoExcel<ItfBeanSimples> importador;

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
            executaAcaoSelecionadaPorEnum(FabAcaoAdminDeveloper.FERRMANTAS_BANCO_FRM_RELATORIO_IMPORTACAO);
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
            acaoFormImportador = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR.getAcaoDoSistema();
            acaoFormEnviarArquivo = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO.getAcaoDoSistema();
            acaoFromMapearColunas = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS.getAcaoDoSistema();
            acaoCtrProcessar = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP.getAcaoDoSistema();
            acaoCtrGravarDados = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP.getAcaoDoSistema();
            caminhoArquhivoImportacao = SBCore.getControleDeSessao().getSessaoAtual().getPastaTempDeSessao() + "/importacaoExel.xls";
            for (Class entidade : UtilSBPersistencia.getTodasEntidades()) {
                entidadesDisponiveis.add(MapaObjetosProjetoAtual.getEstruturaObjeto(entidade));
            }
            mapaCampos = new HashMap<>();

            executaAcaoSelecionadaPorEnum(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO);
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

}
