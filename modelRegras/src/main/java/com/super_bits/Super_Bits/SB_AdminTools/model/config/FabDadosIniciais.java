/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_AdminTools.model.config;

import com.super_bits.Super_Bits.SB_AdminTools.model.exemplo.ConteudoGenerico;
import com.super_bits.Super_Bits.SB_AdminTools.model.usuariosExemplo.FabGrupoUsuario;
import com.super_bits.modulos.SBAcessosModel.model.UsuarioSB;
import com.super_bits.modulosSB.SBCore.UtilGeral.UtilSBCoreStrings;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabrica;

/**
 *
 * @author desenvolvedor
 */
public enum FabDadosIniciais implements ItfFabrica {

    USUARIO_TESTE,
    CONTEUDOGENERICO1,
    CONTEUDOGENERICO2,
    CONTEUDOGENERICO3,
    CONTEUDOGENERICO4,
    CONTEUDOGENERICO5,
    CONTEUDOGENERICO6;

    @Override
    public Object getRegistro() {

        switch (this) {
            case USUARIO_TESTE:
                UsuarioSB us1 = new UsuarioSB();
                us1.setNome("Usuário para testes");
                us1.setSenha("123");
                us1.setGrupo(FabGrupoUsuario.USUARIO_ADMINISTRADOR.getRegistro());
                us1.setEmail("teste@teste.org");
                us1.setApelido("teste");
                return us1;
            case CONTEUDOGENERICO1:
                ConteudoGenerico contTeste = new ConteudoGenerico();
                contTeste.setId(1);
                contTeste.setNome("Conteúdo Teste ");
                contTeste.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(5, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste;
            case CONTEUDOGENERICO2:
                ConteudoGenerico contTeste2 = new ConteudoGenerico();
                contTeste2.setId(2);
                contTeste2.setNome("Conteúdo Teste 222");
                contTeste2.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(3, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste2;
            case CONTEUDOGENERICO3:
                ConteudoGenerico contTeste3 = new ConteudoGenerico();
                contTeste3.setId(3);
                contTeste3.setNome("Conteúdo Teste 33");
                contTeste3.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(2, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste3;

            case CONTEUDOGENERICO4:
                ConteudoGenerico contTeste4 = new ConteudoGenerico();
                contTeste4.setId(4);
                contTeste4.setNome("Conteúdo Teste 444");
                contTeste4.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(7, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste4;

            case CONTEUDOGENERICO5:
                ConteudoGenerico contTeste5 = new ConteudoGenerico();
                contTeste5.setId(2);
                contTeste5.setNome("Conteúdo Teste 555");
                contTeste5.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(2, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste5;

            case CONTEUDOGENERICO6:
                ConteudoGenerico contTeste6 = new ConteudoGenerico();
                contTeste6.setId(2);
                contTeste6.setNome("Conteúdo Teste 666");
                contTeste6.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(5, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste6;

            default:
                throw new AssertionError(this.name());

        }

    }

}
