/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.SBAdminTools.webpaginas;

import com.super_bits.Super_Bits.SB_AdminTools.model.config.ConfigPersistenciaSB_AdminTools;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.config.webPaginas.ConfigWPSB_AdminTools;
import com.super_bits.config.webPaginas.ConfiguradorCoreWebAppSB_AdminTools;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import com.super_bits.modulosSB.webPaginas.TratamentoDeErros.RelatorioTesteWebPaginas;
import org.junit.Test;

/**
 *
 * @author salvioF
 */
public class TesteConformidadeWebApp extends RelatorioTesteWebPaginas {

    @Test
    public void teste() {
        exibirRelatorioCompleto();

    }

    @Override
    protected void configAmbienteDesevolvimento() {
        Object teste = FabAcaoAdminDeveloper.class;
        SBCore.configurar(new ConfiguradorCoreWebAppSB_AdminTools(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(new ConfigPersistenciaSB_AdminTools());
        SBWebPaginas.configurar(new ConfigWPSB_AdminTools());

    }

}
