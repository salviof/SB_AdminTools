/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.config.webPaginas;

import com.google.common.collect.Lists;
import com.super_bits.configSBFW.acessos.ConfigAcessosAdminSistemaModelo;
import com.super_bits.configSBFW.acessos.UtilSB_AdminToolsGlobalVar;
import com.super_bits.modulos.SBAcessosModel.view.FabAcaoPaginasDoSistema;
import com.super_bits.modulosSB.SBCore.ConfigGeral.ItfConfiguracaoCoreCustomizavel;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ComoFabricaAcoes;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.ConfiguradorCoreDeProjetoWebWarAbstrato;

import java.util.List;
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

        pConfig.setClasseConfigPermissao(ConfigAcessosAdminSistemaModelo.class);
        List<Class<? extends ComoFabricaAcoes>> lista = Lists.newArrayList(UtilSB_AdminToolsGlobalVar.pAcoesDoSistema());
        Class<? extends ComoFabricaAcoes> acoes[] = new Class[lista.size() + 1];
        int i = 0;
        for (Class fab : lista) {
            acoes[i] = fab;
            i++;
        }
        acoes[i] = FabAcaoPaginasDoSistema.class;

        pConfig.setFabricaDeAcoes(acoes);

    }

}
