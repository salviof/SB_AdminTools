package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ItfAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoessbAdminTools_containersDeObjeto implements Serializable {

	public ItfAcaoFormulario getFerramentas_objeto_container_mb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_MB");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_novavisualizacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_NOVAVISUALIZACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_editar_container() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_EDITAR_CONTAINER");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_listar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_LISTAR");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_visualizacao_item_desktop() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_DESKTOP");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_visualizacao_item_mobile() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_MOBILE");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_visualizacao_itens_mobile() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_MOBILE");
	}

	public ItfAcaoFormularioEntidade getFerramentas_objeto_container_frm_visualizacao_itens_desktop() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_DESKTOP");
	}

	public ItfAcaoControllerEntidade getFerramentas_objeto_container_ctr_criar_visualizacao() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_CTR_CRIAR_VISUALIZACAO");
	}
}