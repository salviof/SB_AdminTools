/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.super_bits.configSBFW.acessos.ConfigAcessos;
import com.super_bits.configSBFW.acessos.UtilSB_AdminToolsGlobalVar;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;
import javax.servlet.ServletContext;

/**
 *
 * @author salvioF
 */
public class ConfiguradorCoreWebAppSB_AdminTools extends ConfiguradorCoreDeProjetoWebWarAbstrato {

    public ConfiguradorCoreWebAppSB_AdminTools(ServletContext contexto) {
        super(contexto);
    }

    public ConfiguradorCoreWebAppSB_AdminTools() {
        super(true);
    }

    @Override
    public void defineFabricasDeACao(ItfConfiguracaoCoreCustomizavel pConfig) {
        pConfig.setClasseConfigPermissao(ConfigAcessos.class);
        pConfig.setFabricaDeAcoes(UtilSB_AdminToolsGlobalVar.pAcoesDoSistema());
    }

}
