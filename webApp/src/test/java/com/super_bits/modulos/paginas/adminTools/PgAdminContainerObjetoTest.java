/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.modulos.SBAdminTools.webpaginas.TestesUnitariosAdminToolsWebApp;
import com.super_bits.modulosSB.SBCore.modulos.view.componenteObjeto.ContainerVisualizacaoObjeto;
import java.math.BigDecimal;
import java.util.Scanner;
import org.apache.commons.math3.util.Precision;
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

        PgRecursosAdminTools teste = new PgRecursosAdminTools();
        teste.inicio();
        System.out.println(teste.getConteudos());
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

    public static void main(String[] paramentros) {

        // Ask for user input
        System.out.print("Enter 1st value:");

        // use scanner to read the console input
        Scanner scan = new Scanner(System.in);
        String valor = scan.next();
        double valorAtualizado = Double.parseDouble(valor) * 8.333;
        double calculoMultiplo = 10 * (Math.ceil(Math.abs(valorAtualizado / 10)));

        System.out.println(calculoMultiplo);

        double teste = (double) Math.round(Double.parseDouble(valor) * 8.3d) * 10 / 10d;
        System.out.println("TEste:" + teste);

        System.out.println("Result of the operation is " + valor);

        System.out.println(Precision.round(0.912385, 0, BigDecimal.ROUND_HALF_UP));
        int yourScale = 10;
        System.out.println(BigDecimal.valueOf(0.42344534534553453453 - 0.42324534524553453453).setScale(yourScale, BigDecimal.ROUND_HALF_UP));
    }
}
