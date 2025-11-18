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
public class AcoesPaginasDoSistema_ConteudoGenericoMb implements Serializable {

	public ItfAcaoFormulario getConteudoGenericoMb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_MB");
	}

	public ItfAcaoFormularioEntidade getConteudoGenericoFrmListar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getConteudoGenericoFrmEditar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_FRM_EDITAR");
	}

	public ItfAcaoFormularioEntidade getConteudoGenericoFrmVisualizar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_FRM_VISUALIZAR");
	}

	public ComoAcaoControllerEntidade getConteudoGenericoCtrSalvarMerge() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoExemplos.CONTEUDO_GENERICO_CTR_SALVAR_MERGE");
	}
}