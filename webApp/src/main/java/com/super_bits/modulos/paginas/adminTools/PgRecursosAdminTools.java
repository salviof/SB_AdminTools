/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.model.BeanExemplo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author SalvioF
 */
@Named
@ViewScoped
public class PgRecursosAdminTools implements Serializable {

    //@Inject
    // private EntityManager em;
    private List<BeanExemplo> conteudos = new ArrayList();
    private final BeanExemplo conteudoExemplo = new BeanExemplo();

    @PostConstruct
    public void inicio() {
        //conteudos = UtilSBPersistencia.getListaTodos(ConteudoGenerico.class, em);

        for (int i = 0; i < 10; i++) {
            BeanExemplo teste = new BeanExemplo(true);
            teste.setId((long) i);
            teste.setNome("BeanExemplo " + i);
            conteudos.add(conteudoExemplo);
        }
    }

    public ItfBeanSimples getBeanSelecionado() {
        return conteudoExemplo;
    }

    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {

    }

    public List<BeanExemplo> getConteudos() {

        return conteudos;
    }

}
