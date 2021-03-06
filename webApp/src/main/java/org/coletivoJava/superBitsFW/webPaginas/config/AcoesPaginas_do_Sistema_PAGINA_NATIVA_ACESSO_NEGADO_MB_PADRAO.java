package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_PAGINA_NATIVA_ACESSO_NEGADO_MB_PADRAO
		implements
			Serializable {

	public ItfAcaoFormularioEntidade getPagina_nativa_acesso_negado_mb_padrao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_NATIVA_ACESSO_NEGADO_MB_PADRAO");
	}

	public ItfAcaoFormularioEntidade getPagina_nativa_acesso_negado_frm_sub_form() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_NATIVA_ACESSO_NEGADO_FRM_SUB_FORM");
	}
}