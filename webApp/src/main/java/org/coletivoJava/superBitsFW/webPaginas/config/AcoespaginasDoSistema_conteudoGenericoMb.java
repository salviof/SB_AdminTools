package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoespaginasDoSistema_conteudoGenericoMb implements Serializable {

	public ItfAcaoFormulario getConteudo_generico_mb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_MB");
	}

	public ItfAcaoFormularioEntidade getConteudo_generico_frm_listar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getConteudo_generico_frm_editar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getConteudo_generico_frm_visualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_FRM_VISUALIZAR");
	}

	public ComoAcaoControllerEntidade getConteudo_generico_ctr_salvar_merge() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_CTR_SALVAR_MERGE");
	}
}