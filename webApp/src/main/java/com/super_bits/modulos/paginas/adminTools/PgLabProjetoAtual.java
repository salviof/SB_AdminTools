/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoFormulario;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoSelecionarAcao;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoGerenciarEntidade;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.Persistencia.registro.persistidos.EntidadeSimples;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.UtilSBCoreReflexaoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.GrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.ItfCampoInstanciado;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.TratamentoDeErros.FabErro;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreStrings;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.ItfMB_Recursos;
import javax.inject.Inject;

/**
 *
 * @author salvioF
 */
@InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB)
@InfoPagina(nomeCurto = "LabProjAtual", tags = "Laboratório do projeto")
@ViewScoped
@Named
public class PgLabProjetoAtual extends MB_PaginaConversation {

    @Inject
    private ItfMB_Recursos pagRecursos;
    private int idDaEntidade;
    private String strNomeDaEntidade;
    private List<String> strEntidadesPossiveis;
    private List<Class> entidadesPossiveis;
    private CaminhoCampoReflexao campoSelecionado;
    private GrupoCampos grupoSelecionado;
    private String strNomeCampo;
    private List<ItfAcaoGerenciarEntidade> acoesDeGestaoDoSistema;
    private List<ItfAcaoFormulario> acoesFormularioDaGestao;
    private ItfAcaoGerenciarEntidade acaoGestaoSelecionada;
    private ItfAcaoFormulario acaoFormularioSelecionada;
    private ItfAcaoFormulario acaoFichaTecnica;
    private ItfAcaoFormulario acaoPadraoDeExibicao;
    private ItfAcaoFormulario acaoEditarVisualizacaoItem;
    private int idGrupoSelecionado;
    private int idCampoAcaoSelecionado;
    private List<ItfAcaoFormulario> acoesParaCampo;
    private ItfBeanSimples entidadeCarregada;
    private Class classeDaEntidade;
    private ItfAcaoFormulario acaoFormLocalizarEntidade;

    private int numerodeManagedBeans;
    private int numeroDeFormularios;
    private int numeroDeAcoesController;
    private List<AcaoDoSistema> tiposLabObjeto;
    private AcaoDoSistema acaoTipoInspencao;

    private AcaoDoSistema acaoSelecaoTipoLab;
    private AcaoDoSistema acaoAssitenteLocalizacao;
    private AcaoDoSistema acaoDepurarCampo;

    private ItfAcaoFormulario acaoLaboratorioComponenteVisual;

    private List<AcaoDoSistema> acoesLocalizadoresDeObjetos;

    private boolean isUmaAcaoDosModulosPrincipais(ItfAcaoDoSistema pAcao) {

        return !pAcao.getModulo().isUmModuloNativo();

    }

    public void iniciarBancoDeDados() {
        entidadesPossiveis = UtilSBPersistencia.getTodasEntidades();
        strEntidadesPossiveis = new ArrayList<>();
    }

    public void testeConformidade() {

    }

    public void alterarLocalizadorObjeto() {
        System.out.println("Ação Assitente Localizazação alterada para:" + acaoAssitenteLocalizacao);
    }

    @PostConstruct
    public void init() {
        try {

            acoesParaCampo = new ArrayList<>();
            acaoFichaTecnica = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FICHATECNICA.getAcaoDoSistema().getComoFormulario();
            acaoDepurarCampo = (AcaoDoSistema) acaoFichaTecnica;
            acaoEditarVisualizacaoItem = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_CAMPO_FRM_VISUALIZACAO_ITEM.getAcaoDoSistema().getComoFormulario();
            acoesParaCampo.add(acaoFichaTecnica);
            acaoFormLocalizarEntidade = FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_OBJETOS.getAcaoDoSistema().getComoFormulario();
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO.getAcaoDoSistema().getComoFormulario());
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE.getAcaoDoSistema().getComoFormulario());
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSTRUCOES.getAcaoDoSistema().getComoFormulario());
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO.getAcaoDoSistema().getComoFormulario());
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS.getAcaoDoSistema().getComoFormulario());
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DO_GRUPO_FORMULARIO.getAcaoDoSistema().getComoFormulario());
            acoesParaCampo.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSTRUCOES.getAcaoDoSistema().getComoFormulario());
            xhtmlAcaoAtual = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO.getAcaoDoSistema().getComoFormulario().getXhtml();
            acaoPadraoDeExibicao = acaoFichaTecnica;
            acaoSelecaoTipoLab = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO.getAcaoDoSistema();
            acoesLocalizadoresDeObjetos = new ArrayList();

            acoesLocalizadoresDeObjetos.add(FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_OBJETOS.getAcaoDoSistema());

            acoesLocalizadoresDeObjetos.add(FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_ACAO.getAcaoDoSistema());
            acoesLocalizadoresDeObjetos.add(FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_CAMPO.getAcaoDoSistema());

            tiposLabObjeto = new ArrayList<>();
            tiposLabObjeto.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS.getAcaoDoSistema());
            tiposLabObjeto.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL.getAcaoDoSistema());
            tiposLabObjeto.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT.getAcaoDoSistema());
            for (ItfAcaoDoSistema acaoDoSistema : MapaAcoesSistema.getListaTodasAcoes()) {

                if (isUmaAcaoDosModulosPrincipais(acaoDoSistema)) {
                    if (acaoDoSistema.isUmaAcaoGestaoDominio()) {

                        numerodeManagedBeans++;
                    }
                    if (acaoDoSistema.isUmaAcaoFormulario()) {
                        numeroDeFormularios++;
                    }
                    if (acaoDoSistema.isUmaAcaoController()) {
                        numeroDeAcoesController++;
                    }
                }
            }

            for (Class classe : entidadesPossiveis) {
                strEntidadesPossiveis.add(classe.getSimpleName());
            }
        } catch (Throwable t) {

            String tituloErro = "Erro carregando Init da pagina";
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);
        }

    }

    public int getNumerodeManagedBeans() {
        return numerodeManagedBeans;
    }

    public int getNumeroDeFormularios() {
        return numeroDeFormularios;
    }

    public ItfCampoInstanciado getCampoInstanciado() {
        if (getEntidadeCarregada() == null) {
            SBCore.enviarAvisoAoUsuario("Entidade instanciada está nula");
            return null;
        }
        if (getStrNomeCampo() == null) {
            SBCore.enviarAvisoAoUsuario("O campo não foi selecionado");
            return null;
        }
        return getEntidadeCarregada().getCampoByNomeOuAnotacao(getStrNomeCampo());

    }

    public boolean isCampoValido() {
        if (entidadeCarregada == null) {
            return false;
        } else {
            if (strNomeCampo == null) {
                return false;
            }

            return true;
        }
    }

    public void exibirFichaTecnica() {
        try {
            verificarAcaoSelecionada();
            setAcaoDepurarCampo((AcaoDoSistema) acaoPadraoDeExibicao);

            paginaUtil.atualizaTelaPorID("laboratorio");
        } catch (Throwable t) {

            String tituloErro = "Erro carregando ficha tecnica";
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);
        }
    }

    public void carregaEntidade() {
        try {
            if (strNomeDaEntidade == null) {
                throw new UnsupportedOperationException("O nome da entidade não foi definido");
            }
            if (idDaEntidade == 0) {
                throw new UnsupportedOperationException("O id da entidade (Código do registro) não foi definido ");
            }
            classeDaEntidade = UtilSBCoreReflexaoCampos.getClasseByNome(strNomeDaEntidade);
            if (classeDaEntidade == null) {
                throw new UnsupportedOperationException("A classe da entidade não foi encontrada ");
            }

            entidadeCarregada = (ItfBeanSimples) classeDaEntidade.newInstance();
            ((EntidadeSimples) entidadeCarregada).loadByID(idDaEntidade, getEMPagina());

            acoesDeGestaoDoSistema = MapaAcoesSistema.getAcoesDeGestaoByEntidade(classeDaEntidade);
            acoesFormularioDaGestao = new ArrayList<>();
            if (acoesDeGestaoDoSistema.size() > 0) {
                setAcaoGestaoSelecionada(acoesDeGestaoDoSistema.get(0));

            }
        } catch (Throwable t) {
            String tituloErro = "Erro carregando entidade" + getAcaoFormularioSelecionada();
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);

        }

    }

    private void verificarAcaoSelecionada() {

        if (getAcaoFormularioSelecionada() == null) {
            throw new UnsupportedOperationException("Nenhum formulário de ação foi selecionado");

        }
        if (getAcaoFormularioSelecionada().getGruposDeCampos().isEmpty()) {
            throw new UnsupportedOperationException("Nenhum campo foi encontrado na ação");
        }

    }

    public void verProximoCampo() {
        try {
            verificarAcaoSelecionada();
            if (idCampoAcaoSelecionado >= getAcaoFormularioSelecionada().getGruposDeCampos().get(idGrupoSelecionado).getCampos().size()) {
                idCampoAcaoSelecionado = 0;
            } else {
                idCampoAcaoSelecionado++;
            }
            campoSelecionado = getAcaoFormularioSelecionada().getGruposDeCampos().get(idGrupoSelecionado).getCampos().get(idCampoAcaoSelecionado);
            strNomeCampo = getCampoSelecionado().getCaminhoSemNomeClasse();
            exibirFichaTecnica();
        } catch (Throwable t) {
            String tituloErro = "Erro tentando obter Proximo campo anterior de" + getAcaoFormularioSelecionada();
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);
        }
    }

    public void verCampoAnterior() {
        try {
            verificarAcaoSelecionada();
            if (idCampoAcaoSelecionado == 0) {
                return;
            } else {
                idCampoAcaoSelecionado--;
            }
            grupoSelecionado = getAcaoFormularioSelecionada().getGruposDeCampos().get(idGrupoSelecionado);
            campoSelecionado = grupoSelecionado.getCampos().get(idCampoAcaoSelecionado);
            strNomeCampo = getCampoSelecionado().getCaminhoSemNomeClasse();
            exibirFichaTecnica();
        } catch (Throwable t) {
            String tituloErro = "Erro tentando obter Campo anterior de" + getAcaoFormularioSelecionada();
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);
        }

    }

    public void verProximoGrupo() {

        try {
            verificarAcaoSelecionada();
            idCampoAcaoSelecionado = 0;
            if (idGrupoSelecionado >= getAcaoFormularioSelecionada().getGruposDeCampos().size()) {
                idGrupoSelecionado = 0;
            } else {
                idGrupoSelecionado++;
            }
            grupoSelecionado = getAcaoFormularioSelecionada().getGruposDeCampos().get(idGrupoSelecionado);
            campoSelecionado = grupoSelecionado.getCampos().get(idCampoAcaoSelecionado);
            strNomeCampo = getCampoSelecionado().getCaminhoSemNomeClasse();
            exibirFichaTecnica();
        } catch (Throwable t) {
            String tituloErro = "Erro tentando obter proximo Grupo anterior de" + getAcaoFormularioSelecionada();
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);
        }

    }

    public AcaoDoSistema getAcaoSelecaoTipoLab() {
        return acaoSelecaoTipoLab;
    }

    public void verGrupoAnterior() {

        try {
            verificarAcaoSelecionada();
            idCampoAcaoSelecionado = 0;
            if (idGrupoSelecionado >= getAcaoFormularioSelecionada().getGruposDeCampos().size()) {
                idGrupoSelecionado = 0;
            } else {
                idGrupoSelecionado++;
            }
            grupoSelecionado = getAcaoFormularioSelecionada().getGruposDeCampos().get(idGrupoSelecionado);
            campoSelecionado = grupoSelecionado.getCampos().get(idCampoAcaoSelecionado);
            strNomeCampo = getCampoSelecionado().getCaminhoSemNomeClasse();
            exibirFichaTecnica();
        } catch (Throwable t) {
            String tituloErro = "Erro tentando obter Grupo anterior de" + getAcaoFormularioSelecionada();
            SBCore.RelatarErroAoUsuario(FabErro.SOLICITAR_REPARO, tituloErro, t);
            SBCore.enviarAvisoAoUsuario(tituloErro);
        }

    }

    public CaminhoCampoReflexao getCampoSelecionado() {
        return campoSelecionado;
    }

    public void setCampoSelecionado(CaminhoCampoReflexao campoSelecionado) {
        this.campoSelecionado = campoSelecionado;
    }

    public String getStrNomeCampo() {
        return strNomeCampo;
    }

    public void setStrNomeCampo(String pStrNomeCampo) {
        if (pStrNomeCampo != null) {
            if (!pStrNomeCampo.equals(strNomeCampo)) {
                if (getEntidadeCarregada() == null) {
                    carregaEntidade();
                }
                getCampoInstanciado();
            }
        }

        this.strNomeCampo = pStrNomeCampo;
    }

    public ItfAcaoGerenciarEntidade getAcaoGestaoSelecionada() {
        return acaoGestaoSelecionada;
    }

    public void setAcaoGestaoSelecionada(ItfAcaoGerenciarEntidade acaoGestaoSelecionada) {
        this.acaoGestaoSelecionada = acaoGestaoSelecionada;
        acoesFormularioDaGestao = new ArrayList<>();
        for (ItfAcaoDoSistema acao : acaoGestaoSelecionada.getAcoesVinculadas()) {
            if (acao.isUmaAcaoFormulario()) {
                acoesFormularioDaGestao.add((ItfAcaoFormulario) acao);
            }
        }
        if (acoesFormularioDaGestao.size() > 0) {
            setAcaoFormularioSelecionada(acoesDeGestaoDoSistema.get(0));
        }
    }

    public ItfAcaoFormulario getAcaoFormularioSelecionada() {

        return acaoFormularioSelecionada;
    }

    public void setAcaoFormularioSelecionada(ItfAcaoFormulario acaoFormularioSelecionada) {

        if (!acaoFormularioSelecionada.getGruposDeCampos().isEmpty()) {
            grupoSelecionado = acaoFormularioSelecionada.getGruposDeCampos().get(0);
        }

        this.acaoFormularioSelecionada = acaoFormularioSelecionada;
    }

    public List<String> getStrEntidadesPossiveis() {
        return strEntidadesPossiveis;
    }

    public List<ItfAcaoFormulario> getAcoesFormularioDaGestao() {
        return acoesFormularioDaGestao;
    }

    public ItfBeanSimples getEntidadeCarregada() {
        return entidadeCarregada;
    }

    public int getIdDaEntidade() {
        return idDaEntidade;
    }

    public void setIdDaEntidade(int idDaEntidade) {
        this.idDaEntidade = idDaEntidade;
    }

    public String getStrNomeDaEntidade() {
        return strNomeDaEntidade;
    }

    public void setStrNomeDaEntidade(String strNomeDaEntidade) {
        this.strNomeDaEntidade = strNomeDaEntidade;
    }

    public List<ItfAcaoGerenciarEntidade> getAcoesDeGestaoDoSistema() {
        return acoesDeGestaoDoSistema;
    }

    public GrupoCampos getGrupoSelecionado() {
        return grupoSelecionado;
    }

    public void setGrupoSelecionado(GrupoCampos grupoSelecionado) {
        this.grupoSelecionado = grupoSelecionado;
    }

    public void setAcaoSelecionada(ItfAcaoDoSistema acaoSelecionada) {
        this.acaoSelecionada = acaoSelecionada;
    }

    public List<ItfAcaoFormulario> getAcoesParaCampo() {
        return acoesParaCampo;
    }

    public ItfAcaoFormulario getAcaoPadraoDeExibicao() {
        return acaoPadraoDeExibicao;
    }

    public void setAcaoPadraoDeExibicao(ItfAcaoFormulario acaoPadraoDeExibicao) {
        this.acaoPadraoDeExibicao = acaoPadraoDeExibicao;
    }

    public int getNumeroDeAcoesController() {

        return numeroDeAcoesController;
    }

    public boolean isModoInspecionarCampo() {

        return !acaoSelecionada.equals(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_CAMPO_FRM_VISUALIZACAO_ITEM.getRegistro());
    }

    public ItfAcaoFormulario getAcaoEditarVisualizacaoItem() {
        return acaoEditarVisualizacaoItem;
    }

    public BeanDeclarado getBeanExemploEmResource() {

        return pagRecursos.getBeanDeclarado(UtilSBCoreStrings.getPrimeiraLetraMinuscula(strNomeDaEntidade));
    }

    public List<AcaoDoSistema> getTiposLabObjeto() {
        return tiposLabObjeto;
    }

    public AcaoDoSistema getAcaoTipoInspencao() {
        return acaoTipoInspencao;
    }

    public List<AcaoDoSistema> getAcoesLocalizadoresDeObjetos() {
        return acoesLocalizadoresDeObjetos;
    }

    public AcaoDoSistema getAcaoAssitenteLocalizacao() {
        return acaoAssitenteLocalizacao;
    }

    public void setAcaoAssitenteLocalizacao(AcaoDoSistema acaoAssitenteLocalizacao) {
        this.acaoAssitenteLocalizacao = acaoAssitenteLocalizacao;
    }

    public AcaoDoSistema getAcaoDepurarCampo() {
        return acaoDepurarCampo;
    }

    public void setAcaoDepurarCampo(AcaoDoSistema acaoDepurarCampo) {
        this.acaoDepurarCampo = acaoDepurarCampo;

    }

    public ItfAcaoFormulario getAcaoFormLocalizarEntidade() {
        return acaoFormLocalizarEntidade;
    }

    public boolean isEntidadeFoiCarregada() {
        if (entidadeCarregada != null) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isLaboratorioComponenteVisualLiberado() {
        if (!isEntidadeFoiCarregada()) {
            return false;
        }
        if (acaoLaboratorioComponenteVisual == null) {
            return false;
        }
        return true;
    }

    public void alterarAcaoLaboratorioComponenteVisual() {
        pagRecursos.setId(idDaEntidade);
        pagRecursos.getBeanDeclarado(UtilSBCoreStrings.getPrimeiraLetraMinuscula(strNomeDaEntidade)).setValor(entidadeCarregada);
        System.out.println("Ação alterada para" + acaoLaboratorioComponenteVisual);
    }

    public ItfAcaoFormulario getAcaoLaboratorioComponenteVisual() {
        return acaoLaboratorioComponenteVisual;
    }

    public void setAcaoLaboratorioComponenteVisual(ItfAcaoFormulario acaoLaboratorioComponenteVisual) {
        this.acaoLaboratorioComponenteVisual = acaoLaboratorioComponenteVisual;
    }

}
