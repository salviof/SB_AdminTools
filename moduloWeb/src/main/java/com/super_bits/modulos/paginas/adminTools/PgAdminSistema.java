/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoDoSistema;
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
@InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB)
@Named
public class PgAdminSistema extends MB_PaginaConversation {

    private List<ItfAcaoDoSistema> ferramentasDisponiveis;

    @PostConstruct
    public void ferramentas() {

        ferramentasDisponiveis = new ArrayList<>();
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB.getAcaoDoSistema());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR.getAcaoDoSistema());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB.getAcaoDoSistema());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_MB.getAcaoDoSistema());
        ferramentasDisponiveis.add(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE.getAcaoDoSistema());
        ferramentasDisponiveis.add(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB.getAcaoDoSistema());

        setAcaoSelecionada(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS.getAcaoDoSistema());
        xhtmlAcaoAtual = FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS.getAcaoDoSistema().getComoFormulario().getXhtml();
    }

    public List<ItfAcaoDoSistema> getFerramentasDisponiveis() {

        return ferramentasDisponiveis;
    }

    public void setFerramentasDisponiveis(List<ItfAcaoDoSistema> ferramentasDisponiveis) {
        this.ferramentasDisponiveis = ferramentasDisponiveis;
    }

}
