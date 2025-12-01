/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.MODULOS.adminSistema;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoFabricaMenu;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoMenuSB;

import org.coletivojava.fw.api.objetoNativo.view.menu.SessaoMenuSB;
import java.util.ArrayList;
import java.util.List;
import org.coletivojava.fw.api.objetoNativo.view.menu.MenuSBFW;

/**
 * *
 * FAbricas de menu, devem ser usadas para construção de menus do sistema.
 *
 * Voce pode adicionar sessoes e ações no menu
 *
 *
 * @author desenvolvedor
 */
public enum FabMenuAdmin implements ComoFabricaMenu {
    MENU_INICIAL, MENU_RESTRITO, MENU_ROOT;

    @Override
    public List<ComoMenuSB> getTodosMenus() {
        List<ComoMenuSB> menus = new ArrayList<>();
        for (ComoFabricaMenu menu : this.getClass().getEnumConstants()) {
            menus.add((MenuSBFW) menu.getRegistro());
        }
        return menus;
    }

    @Override
    public MenuSBFW getRegistro() {
        MenuSBFW menu = new MenuSBFW();
        AcaoDoSistema acao = new AcaoDoSistema();
        acao.setNomeAcao("Exemplos do Framework");
        SessaoMenuSB sessaoVisaoGeral = new SessaoMenuSB(acao);
        sessaoVisaoGeral.addAcao(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE.getRegistro());
        sessaoVisaoGeral.addAcao(FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_VALIDACAO.getRegistro());
        menu.addSessao(sessaoVisaoGeral);
        switch (this) {
            case MENU_INICIAL:

                return menu;
            case MENU_RESTRITO:
                AcaoDoSistema acaosessao = new AcaoDoSistema();
                acaosessao.setNome("Permissões ");
                SessaoMenuSB adminUsuario = new SessaoMenuSB(acaosessao);
                //    adminUsuario.addAcao(FabAcaoSeguranca.GRUPO_MB_GERENCIAR.getRegistro());
                //  adminUsuario.addAcao(FabAcaoSeguranca.USUARIO_MB_GERENCIAR.getRegistro());
                menu.addSessao(adminUsuario);
                return menu;
            case MENU_ROOT:

                AcaoDoSistema acaoFerramentas
                        = FabAcaoProjetoSB.PROJETO_FRM_VISAO_GERAL.getRegistro();

                SessaoMenuSB ferramentasDeAcao = new SessaoMenuSB(acaoFerramentas);

                ferramentasDeAcao.addAcao(acaoFerramentas);
                SessaoMenuSB sessaoFerramentas = new SessaoMenuSB(FabAcaoProjetoSB.PROJETO_FRM_VISAO_GERAL.getRegistro());

                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB.getRegistro());
                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB_ADMIN_PROJ.getRegistro());
                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR.getRegistro());
                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB.getRegistro());
                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_LOGS_MB.getRegistro());
                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_MB.getRegistro());
                ferramentasDeAcao.addAcao(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_MB.getRegistro());

                return menu;

            default:
                throw new AssertionError(this.name());

        }
    }

    @Override
    public MenuSBFW getMenuPrincipal() {
        return getRegistro();
    }

    @Override
    public MenuSBFW getMenuSecundario() {
        return null;
    }

}
