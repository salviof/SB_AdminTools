/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.SB_AdminTools.paginas;

import com.super_bits.Super_Bits.SB_AdminTools.model.exemplo.ConteudoGenerico;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.FabAcaoDemonstracaoSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.acoesDemonstracao.InfoAcaoDemonstracaoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.webPaginas.JSFBeans.SBBeanModel.ItfMB_Recursos;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_PaginaConversation;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author desenvolvedor
 */
@ApplicationScoped
@Named
@InfoPagina(nomeCurto = "RC", tags = {"recursos"})
@InfoAcaoDemonstracaoSB(acao = FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_RECURSOS)
public class PgRecursosAtools extends MB_PaginaConversation implements ItfMB_Recursos {

    private ConteudoGenerico conteudoGenerico;

    @Override
    public void setId(int id) {
        System.out.println("");
    }

    public ConteudoGenerico getConteudoGenerico() {
        return conteudoGenerico;
    }

    public void setConteudoGenerico(ConteudoGenerico conteudoGenerico) {
        this.conteudoGenerico = conteudoGenerico;
    }

    @Override
    public ItfBeanSimples getBeanSelecionado() {
        return conteudoGenerico;
    }

    @Override
    public void setBeanSelecionado(ItfBeanSimples pBeanSimples) {
        setConteudoGenerico(conteudoGenerico);
    }

}
