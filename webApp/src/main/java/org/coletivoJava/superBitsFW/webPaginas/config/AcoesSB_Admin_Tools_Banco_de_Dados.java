package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.acoes.ComoAcaoControllerEntidade;

@Named
@ApplicationScoped
public class AcoesSB_Admin_Tools_Banco_de_Dados implements Serializable {

	public ItfAcaoFormularioEntidade getFerramentas_banco_mb() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_importador() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_enviar_arquivo_importacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_mapear_colunas() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_relatorio_importacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_RELATORIO_IMPORTACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_listar_dados() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_LISTAR_DADOS");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_editar_sql() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_SQL");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_editar_hql() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_HQL");
	}

	public ComoAcaoControllerEntidade getFerramentas_banco_ctr_listar_sql() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_SQL");
	}

	public ComoAcaoControllerEntidade getFerramentas_banco_ctr_persistir() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PERSISTIR");
	}

	public ComoAcaoControllerEntidade getFerramentas_banco_ctr_processar_dados_imp() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP");
	}

	public ComoAcaoControllerEntidade getFerramentas_banco_ctr_gravar_dados_imp() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP");
	}

	public ComoAcaoControllerEntidade getFerramentas_banco_ctr_listar_hql() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_HQL");
	}

	public ItfAcaoFormularioEntidade getFerramentas_banco_frm_criar_consulta() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA");
	}
}