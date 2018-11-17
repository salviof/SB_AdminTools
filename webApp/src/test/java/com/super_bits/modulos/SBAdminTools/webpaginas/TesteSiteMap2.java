/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.SBAdminTools.webpaginas;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreReflexao;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import java.util.List;
import org.coletivojava.fw.api.tratamentoErros.FabErro;
import org.junit.Test;

/**
 *
 * @author SalvioF
 */
public class TesteSiteMap2 extends TestesUnitariosAdminToolsWebApp {

    @Test
    public void teste() {
        try {
            List<Class> listaTeste = UtilSBCoreReflexao.getClassesComEstaAnotacao(InfoPagina.class, "com.super_bits");

            for (Class classe : listaTeste) {
                System.out.println(classe.getSimpleName());

            }
        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Teste", t);
        }

    }

}
