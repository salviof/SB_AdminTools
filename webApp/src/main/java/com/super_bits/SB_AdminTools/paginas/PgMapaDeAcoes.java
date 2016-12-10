/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_AdminTools.paginas;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author salvioF
 */
@ApplicationScoped
@Named
public class PgMapaDeAcoes {

    public AcaoDoSistema getAcaoSelecaoDeAcao() {
        return FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_ACAO.getAcaoDoSistema();
    }

    public AcaoDoSistema getAcaoSelecaoDeObjeto() {
        return FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_OBJETOS.getAcaoDoSistema();
    }

    public AcaoDoSistema getAcaoSelecaoDeCampo() {
        return FabAcaoAdminDeveloper.DEV_PROJETO_FRM_SELECAO_CAMPO.getAcaoDoSistema();
    }

}
