/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.SBAdminTools.webpaginas;

import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class PgAdminBancoTest extends TestesUnitariosAdminToolsWebApp {

    @Test
    public void testInicio() {
        try {
            PgAdminBanco paginateste = new PgAdminBanco();

            paginateste.inicio();
        } catch (Throwable t) {
            lancarErroJUnit(t);
        }
    }

}
