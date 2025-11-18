/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.MODULOS.adminSistema.FabMenuAdmin;
import com.super_bits.modulos.SBAcessosModel.model.ModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfModuloAcaoSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.modulo.ComoFabricaModulo;
import com.super_bits.modulosSB.SBCore.modulos.view.menu.ComoFabricaMenu;

/**
 *
 *
 * ARQUIVO DE EXEMPLO, PARA INICIO DE APLICAÇÃO.
 *
 * REFATORE ESTA CLASSE COM OS MODULOS DO SEU SISTEMA
 *
 *
 * @author Salvio Furbino
 */
public enum FabModulosIProjetoTesteI implements ComoFabricaModulo {

    DEMONSTRACAO_BASICA, DEMONSTRACAO_ACESSO_RESTRITO;

    @Override
    public ItfModuloAcaoSistema getModulo() {
        ModuloAcaoSistema modulo = new ModuloAcaoSistema();
        switch (this) {
            case DEMONSTRACAO_BASICA:
                modulo.setId(1l);
                modulo.setNome("Modulo demonstração");
                modulo.setDescricao("Modulo demonstração Teste");
                break;
            case DEMONSTRACAO_ACESSO_RESTRITO:
                modulo.setId(2l);
                modulo.setNome("Modulo Acesso Restrito");
                modulo.setDescricao("");
                break;
            default:
                throw new AssertionError(this.name());

        }
        return modulo;
    }

    @Override
    public ItfModuloAcaoSistema getRegistro() {
        return getModulo();
    }

    @Override
    public ComoFabricaMenu getMenuPadrao() {
        return FabMenuAdmin.MENU_INICIAL;
    }
}
