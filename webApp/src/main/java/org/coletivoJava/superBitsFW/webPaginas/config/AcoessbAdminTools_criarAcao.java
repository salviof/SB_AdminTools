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
public class AcoessbAdminTools_criarAcao implements Serializable {

	public ItfAcaoFormulario getFerramentas_acao_mb_criar() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR");
	}

	public ItfAcaoFormularioEntidade getFerramentas_acao_frm_def_nome_slug_acao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_acao_frm_icone_acao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_ICONE_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_acao_frm_xhtml_acao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_XHTML_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_acao_frm_objeto_acao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_OBJETO_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentas_acao_frm_nome_e_descricao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO");
	}

	public ItfAcaoControllerEntidade getFerramentas_acao_ctr_criar() {
		return (ItfAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_CTR_CRIAR");
	}
}