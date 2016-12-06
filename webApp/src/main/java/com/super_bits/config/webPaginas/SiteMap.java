/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.SB_AdminTools.paginas.Pg_paginaInicial;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.MODULOS.adminSistema.FabMenuAdmin;
import com.super_bits.modulos.paginas.adminTools.PgAdminBanco;
import com.super_bits.modulos.paginas.adminTools.PgAdminSistema;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_SiteMapa;

import com.super_bits.modulosSB.SBCore.modulos.view.menu.ItfFabricaMenu;
import com.super_bits.modulos.paginas.adminTools.PgLabProjetoAtual;
import javax.faces.bean.ApplicationScoped;
import javax.inject.Inject;

/**
 *
 *
 * Todas as paginas do seu sistema precisam ser Injetadas no SiteMAP
 *
 * O site Map, ajuda o bean paginaAtual a identificar qual pagina está sendo
 * referenciada, e serve de parametro para montar o site Map da pagina
 *
 *
 * @author Salvio
 */
@ApplicationScoped
public class SiteMap extends MB_SiteMapa {

    @Inject
    private Pg_paginaInicial paginaInicial;

    @Inject
    private PgAdminSistema paginaHomeAdmin;

    @Inject
    private PgLabProjetoAtual paginaTesteCampos;

    @Inject
    private PgAdminBanco paginaAdminBanco;

    /// Injete aqui todas as Paginas que extendem o objeto MB_pagina
    @Override
    public Class<? extends ItfFabricaMenu> getFabricaMenu() {
        return FabMenuAdmin.class;
    }

}
