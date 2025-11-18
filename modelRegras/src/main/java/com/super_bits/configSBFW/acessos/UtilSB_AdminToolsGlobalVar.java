/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.configSBFW.acessos;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.exemplo.FabAcaoExemplos;
import com.super_bits.modulos.SBAcessosModel.fabricas.FabAcaoProjetoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;

/**
 *
 * @author salvioF
 */
public abstract class UtilSB_AdminToolsGlobalVar {

    public static Class<? extends ComoFabricaAcoes>[] pAcoesDoSistema() {
        return new Class[]{FabAcaoDemonstracaoSB.class, FabAcaoProjetoSB.class, FabAcaoExemplos.class,
            FabAcaoAdminDeveloper.class
        };
    }

}
