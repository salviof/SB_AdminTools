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
    CONTEUDOGENERICO2;

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
                contTeste2.setId(1);
                contTeste2.setNome("Conteúdo Teste 222");
                contTeste2.setDescricao(UtilSBCoreStrings.GetLorenIpsilum(5, UtilSBCoreStrings.TIPO_LOREN.PALAVRAS));
                return contTeste2;

            default:
                throw new AssertionError(this.name());

        }

    }

}
