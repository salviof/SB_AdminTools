package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesAdminTools_DevObjProjetoMbLab implements Serializable {

	public ItfAcaoFormulario getDevObjProjetoMbLab() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmVerCampo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmVerCampoEmTodosFormatos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmTestarOnchange() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmLaboraratorio() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_LABORARATORIO");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmInstrucoes() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSTRUCOES");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmCampoIds() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_CAMPO_IDS");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmInspPosicoes() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSP_POSICOES");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmVerCamposDaAcaoFormulario() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmInspecionar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmFichatecnica() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FICHATECNICA");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmInspecionarinput() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmSelecaoTipoLaboratorio() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmInspecionarComponenteVisual() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmInspecionarObjetos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmSelecaoObjetos() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_OBJETOS");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmFerramentas() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmSelecaoAcao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_ACAO");
	}

	public ItfAcaoFormularioEntidade getDevObjProjetoFrmSelecaoCampo() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_CAMPO");
	}
}