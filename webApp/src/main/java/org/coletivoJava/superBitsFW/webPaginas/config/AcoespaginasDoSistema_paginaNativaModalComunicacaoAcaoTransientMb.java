package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;

@Named
@ApplicationScoped
public class AcoespaginasDoSistema_paginaNativaModalComunicacaoAcaoTransientMb
		implements
			Serializable {

	public ItfAcaoFormulario getPagina_nativa_modal_comunicacao_acao_transient_mb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoPaginasDoSistema.PAGINA_NATIVA_MODAL_COMUNICACAO_ACAO_TRANSIENT_MB");
	}
}