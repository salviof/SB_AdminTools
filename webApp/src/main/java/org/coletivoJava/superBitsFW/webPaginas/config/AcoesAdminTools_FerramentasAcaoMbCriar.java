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
public class AcoesAdminTools_FerramentasAcaoMbCriar implements Serializable {

	public ItfAcaoFormulario getFerramentasAcaoMbCriar() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR");
	}

	public ItfAcaoFormularioEntidade getFerramentasAcaoFrmDefNomeSlugAcao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasAcaoFrmIconeAcao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_ICONE_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasAcaoFrmXhtmlAcao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_XHTML_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasAcaoFrmObjetoAcao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_OBJETO_ACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasAcaoFrmNomeEDescricao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO");
	}

	public ComoAcaoControllerEntidade getFerramentasAcaoCtrCriar() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_CTR_CRIAR");
	}
}