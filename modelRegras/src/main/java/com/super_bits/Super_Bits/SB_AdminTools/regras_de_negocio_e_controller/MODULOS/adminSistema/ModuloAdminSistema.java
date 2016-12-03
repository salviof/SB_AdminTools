/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.MODULOS.adminSistema;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulosSB.Persistencia.dao.ControllerAbstratoSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.ItfResposta;

/**
 *
 * @author salvioF
 */
public class ModuloAdminSistema extends ControllerAbstratoSBPersistencia {

    @InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_HQL)
    public ItfResposta resp() {
        return getNovaRespostaNaoImplementado();
    }

}
