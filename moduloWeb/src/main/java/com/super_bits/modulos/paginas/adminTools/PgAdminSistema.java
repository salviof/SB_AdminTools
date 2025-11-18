/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ComoEntidadeSimples;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@InfoPagina(nomeCurto = "SYS_ADM", tags = "Administração do Sistema")
@ViewScoped
@InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB_ADMIN_PROJ)
@Named
public class PgAdminSistema extends MB_PaginaConversation {

    private List<ComoAcaoDoSistema> ferramentasDisponiveis;

    @PostConstruct
    public void ferramentas() {

        ferramentasDisponiveis = new ArrayList<>();
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB_ADMIN_PROJ.getRegistro());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR.getRegistro());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB.getRegistro());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_MB.getRegistro());
        ferramentasDisponiveis.add(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE.getRegistro());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB.getRegistro());

        setAcaoSelecionada(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS.getRegistro());
        xhtmlAcaoAtual = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS.getRegistro().getComoFormulario().getXhtml();
    }

    public List<ComoAcaoDoSistema> getFerramentasDisponiveis() {

        return ferramentasDisponiveis;
    }

    public void setFerramentasDisponiveis(List<ComoAcaoDoSistema> ferramentasDisponiveis) {
        this.ferramentasDisponiveis = ferramentasDisponiveis;
    }

    @Override
    public ComoEntidadeSimples getBeanSelecionado() {
        return null;
    }

    @Override
    public void setBeanSelecionado(ComoEntidadeSimples pBeanSimples) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
