/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.SBAdminTools.webpaginas;

import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.ItfMB_Recursos;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SB.siteMap.anotacoes.InfoPagina;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@ApplicationScoped
@Named
@InfoPagina(nomeCurto = "RC", tags = {"Recursos"})
public class PgRecursos extends MB_PaginaConversation implements ItfMB_Recursos {

    @Override
    public void setId(int id) {
        System.out.println("");
    }

}
