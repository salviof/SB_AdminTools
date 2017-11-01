package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Gestao_de_Objetos_do_Sistema
		implements
			Serializable {

	public ItfAcaoFormularioEntidade getDev_obj_projeto_mb_lab() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_ver_campo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_ver_campo_em_todos_formatos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_testar_onchange() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_laboraratorio() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_LABORARATORIO");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_instrucoes() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSTRUCOES");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_campo_ids() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_CAMPO_IDS");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_insp_posicoes() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSP_POSICOES");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_ver_campos_da_acao_formulario() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_inspecionar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_fichatecnica() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FICHATECNICA");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_inspecionarinput() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_selecao_tipo_laboratorio() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_inspecionar_componente_visual() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_inspecionar_objetos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_selecao_objetos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_OBJETOS");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_ferramentas() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_selecao_acao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_ACAO");
	}

	public ItfAcaoFormularioEntidade getDev_obj_projeto_frm_selecao_campo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_CAMPO");
	}
}