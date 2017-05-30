/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ItfConfigWebPagina;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.siteMap.parametrosURL.ParametroURL;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salvio
 */
public class ConfigWPSB_AdminTools implements ItfConfigWebPagina {

    @Override
    public String SITE_HOST() {
        return "http://localhost:8080";
    }

    @Override
    public String pastaImagens() {
        return "/img";
    }

    @Override
    public String nomePacoteProjeto() {
        return "SB_AdminTools";
    }

    @Override
    public String TituloAppWeb() {
        return "Super Bits Admin Tools";
    }

    @Override
    public String URLBASE() {
        return SITE_HOST() + "/" + nomePacoteProjeto();
    }

    @Override
    public Class mapaSite() {
        return SiteMap.class;
    }

    @Override
    public List<ParametroURL> parametrosDeAplicacao() {
        return new ArrayList<>();
    }

    @Override
    public boolean parametroDeAplicacaoEmSubDominio() {
        return false;
    }

    @Override
    public ItfAcaoFormulario getAcaoPaginaInicial() {
        return null;
    }

}
