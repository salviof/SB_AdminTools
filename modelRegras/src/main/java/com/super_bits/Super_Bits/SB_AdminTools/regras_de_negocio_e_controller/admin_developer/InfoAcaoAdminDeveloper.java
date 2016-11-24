/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author desenvolvedor
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface InfoAcaoAdminDeveloper {

    FabAcaoAdminDeveloper acao();

    public boolean padraoBloqueado() default false;
}
