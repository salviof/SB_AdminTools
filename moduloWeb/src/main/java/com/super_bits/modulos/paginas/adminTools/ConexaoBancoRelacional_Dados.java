/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.Persistencia.dao.UtilSBPersistencia;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.ItemSimples;

/**
 *
 * @author desenvolvedor
 */
@InfoObjetoSB(tags = {"Info Con. Banco Relacional"}, plural = "Conexões Banco Relacional")
public class ConexaoBancoRelacional_Dados extends ItemSimples {

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID)
    private int id;
    @InfoCampo(tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String protocolo = "jdbc:mysql://";
    @InfoCampo(tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String host;
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME)
    private String nomeEntityManagerPadrao = SBPersistencia.getNomeBancoPadrao();

    @InfoCampo(tipo = FabTipoAtributoObjeto.QUANTIDADE)
    private String porta;
    @InfoCampo(tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String usuario;
    @InfoCampo(tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String senha;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public int getId() {
        return id;
    }

    public String getNomeEntityManagerPadrao() {
        return nomeEntityManagerPadrao;
    }

    public void setNomeEntityManagerPadrao(String nomeEntityManagerPadrao) {
        this.nomeEntityManagerPadrao = nomeEntityManagerPadrao;
    }

}
