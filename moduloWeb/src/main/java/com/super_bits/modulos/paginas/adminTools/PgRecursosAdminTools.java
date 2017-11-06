/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.model.exemplo.ConteudoGenerico;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

/**
 *
 * @author SalvioF
 */
@Named
@ViewScoped
public class PgRecursosAdminTools implements Serializable {

    @Inject
    private EntityManager em;

    private List<ConteudoGenerico> conteudos;

    @PostConstruct
    public void inicio() {
        conteudos = UtilSBPersistencia.getListaTodos(ConteudoGenerico.class, em);
    }

    public ItfBeanSimples getBeanSelecionado() {
        return conteudos.get(0);
    }

    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<ConteudoGenerico> getConteudos() {
        return conteudos;
    }

}
