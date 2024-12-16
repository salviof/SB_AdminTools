/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.configSBFW.acessos;

import com.super_bits.Super_Bits.SB_AdminTools.model.usuariosExemplo.FabGrupoUsuario;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.MODULOS.adminSistema.FabMenuAdmin;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.MODULOS.adminSistema.ModuloAdminSistema;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token.ItfTokenAcessoDinamico;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.token.ItfTokenRecuperacaoEmail;
import com.super_bits.modulosSB.SBCore.modulos.Controller.permissaoPadrao.ConfigPermissaoPadraoEmMemoria;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.ItensGenericos.basico.UsuarioSistemaRoot;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimplesSomenteLeitura;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfGrupoUsuario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfUsuario;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.MenusDaSessao;

/**
 *
 *
 * A classe COnfigAcesos, define a configuração de acessos do sistema.
 *
 * os acessos pode estar tanto em um banco como ser criados de maneira estática,
 * é nessa classe que tudo será definido
 *
 * Além disso os menus do sistema podem ser definidos de acordo com o grupo de
 * usuários
 *
 * @author Salvio
 */
public class ConfigAcessosAdminSistemaModelo extends ConfigPermissaoPadraoEmMemoria {

    private static Class[] getClasses() {
        Class[] classes = {ModuloAdminSistema.class};
        return classes;
    }

    /**
     * No contructor do acessso as classes da camada controller (que geram
     * alteração no banco devem ser especificadas)
     */
    public ConfigAcessosAdminSistemaModelo() {
        super(getClasses());
    }

    /**
     *
     * Define o Menu de acorod com o grupo de usuario
     *
     * @param pGrupo
     * @return
     */
    @Override
    public MenusDaSessao definirMenu(ItfGrupoUsuario pGrupo) {
        if (SBCore.getUsuarioLogado().equals(new UsuarioSistemaRoot())) {

        }
        if (pGrupo.equals(FabGrupoUsuario.USUARIO_ADMINISTRADOR.getRegistro())) {
            return new MenusDaSessao(FabMenuAdmin.MENU_RESTRITO.getRegistro());
        } else {
            return new MenusDaSessao(FabMenuAdmin.MENU_INICIAL.getRegistro());
        }
    }

    @Override
    public ItfTokenRecuperacaoEmail gerarTokenRecuperacaoDeSenha(ItfUsuario pUsuario, int pMinutosValidade) {

        throw new UnsupportedOperationException("O METODO AINDA não FOI IMPLEMENTADO.");

    }

    @Override
    public ItfTokenAcessoDinamico gerarTokenDinamico(ItfFabricaAcoes pAcao, ItfBeanSimplesSomenteLeitura pItem, String pEmail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isTokenDinamicoExiste(ItfFabricaAcoes pAcao, ItfBeanSimplesSomenteLeitura pItem, String pEmail) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void persitirMergePermissoes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
