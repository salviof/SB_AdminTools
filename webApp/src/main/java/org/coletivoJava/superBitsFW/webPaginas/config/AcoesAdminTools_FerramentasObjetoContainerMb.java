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
public class AcoesAdminTools_FerramentasObjetoContainerMb
		implements
			Serializable {

	public ItfAcaoFormulario getFerramentasObjetoContainerMb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_MB");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmNovavisualizacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_NOVAVISUALIZACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmEditarContainer() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_EDITAR_CONTAINER");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmListar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmVisualizacaoItemDesktop() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_DESKTOP");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmVisualizacaoItemMobile() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_MOBILE");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmVisualizacaoItensMobile() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_MOBILE");
	}

	public ItfAcaoFormularioEntidade getFerramentasObjetoContainerFrmVisualizacaoItensDesktop() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_DESKTOP");
	}

	public ComoAcaoControllerEntidade getFerramentasObjetoContainerCtrCriarVisualizacao() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_CTR_CRIAR_VISUALIZACAO");
	}
}