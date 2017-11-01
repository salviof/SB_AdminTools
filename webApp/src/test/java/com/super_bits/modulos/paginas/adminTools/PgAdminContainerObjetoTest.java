/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.modulos.SBAdminTools.webpaginas.TestesUnitariosAdminToolsWebApp;
import com.super_bits.modulosSB.SBCore.modulos.view.ContainerVisualizacaoObjeto;
import org.junit.Test;

/**
 *
 * @author SalvioF
 */
public class PgAdminContainerObjetoTest extends TestesUnitariosAdminToolsWebApp {

    public PgAdminContainerObjetoTest() {
    }

    /**
     * Test of getEntidadeSelecionada method, of class PgAdminContainerObjeto.
     */
    @Test
    public void testGetEntidadeSelecionada() {
        System.out.println("getEntidadeSelecionada");
        PgAdminContainerObjeto pagina = new PgAdminContainerObjeto();
        pagina.inicio();

        pagina.setAcaoSelecionada(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_NOVAVISUALIZACAO.getRegistro());
        pagina.executarAcao(pagina.getEntidadesListadas().get(0));
        pagina.getNovoContainer().setNomeTipoVisualizacao("visualizacaoTeste");
        pagina.getNovoContainer().setColunas(pagina.getColunasDisponiveisCriacao().get(2));
        pagina.getNovoContainer().setTemVersaoMobile(false);
        pagina.gerarNovaVisualizacao();
        for (ContainerVisualizacaoObjeto container : pagina.getContainersExistentes().getContainersEncontrados()) {
            System.out.println(container.getCaminhoRelativo());
        }

        for (BeanInfoContainerVisualizacao cont : pagina.getContainersComUrl()) {
            System.out.println(cont.getUrlVisualizacaoDeskTopUnico());
        }

    }

}
