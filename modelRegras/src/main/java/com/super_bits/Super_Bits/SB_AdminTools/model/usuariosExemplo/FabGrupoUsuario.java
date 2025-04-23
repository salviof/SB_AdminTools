/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_AdminTools.model.usuariosExemplo;

import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.modulos.SBAcessosModel.model.GrupoUsuarioSB;
import com.super_bits.modulosSB.Persistencia.fabrica.ItfFabricaComPersistencia;

/**
 *
 * @author desenvolvedor
 */
public enum FabGrupoUsuario implements ItfFabricaComPersistencia {
    USUARIO_ANONIMO, USUARIO_ADMINISTRADOR;

    @Override
    public GrupoUsuarioSB getRegistro() {
        GrupoUsuarioSB novoGrupo = new GrupoUsuarioSB();
        novoGrupo.setId(this.ordinal() + 1l);
        switch (this) {
            case USUARIO_ANONIMO:
                novoGrupo.setId(1l);
                novoGrupo.setNome("Grupo Anonimo");
                novoGrupo.setAtivo(true);
                novoGrupo.setDescricao("Usuário não cadastrado");
                novoGrupo.setPaginaInicial(FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB_ADMIN_PROJ);
                break;
            case USUARIO_ADMINISTRADOR:
                novoGrupo.setId(2l);
                novoGrupo.setNome("Grupo Administrador");
                novoGrupo.setDescricao("Usuário administrador");
                novoGrupo.setDescricao("Grupo com acesso ao menu Administrador");
                novoGrupo.setPaginaInicial(FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB_ADMIN_PROJ);
                novoGrupo.setAtivo(true);
                break;
            default:
                throw new AssertionError(this.name());

        }
        return novoGrupo;
    }
}
