package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_TESTES_CAMPO_MB implements Serializable {

	public ItfAcaoFormularioEntidade getTestes_campo_mb() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoDemonstracaoSB.TESTES_CAMPO_MB");
	}
}