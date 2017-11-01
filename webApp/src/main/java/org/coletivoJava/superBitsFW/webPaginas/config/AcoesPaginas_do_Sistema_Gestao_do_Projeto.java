package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormularioEntidade;

@Named
@ApplicationScoped
public class AcoesPaginas_do_Sistema_Gestao_do_Projeto implements Serializable {

	public ItfAcaoFormularioEntidade getProjeto_mb_gerenciar() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_MB_GERENCIAR");
	}

	public ItfAcaoFormularioEntidade getProjeto_frm_visualizar_acoes() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_ACOES");
	}

	public ItfAcaoFormularioEntidade getProjeto_frm_visualizar_banco_de_dados() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_BANCO_DE_DADOS");
	}

	public ItfAcaoFormularioEntidade getProjeto_frm_visualizar_tabela() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_TABELA");
	}

	public ItfAcaoFormularioEntidade getProjeto_frm_visao_geral() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoProjetoSB.PROJETO_FRM_VISAO_GERAL");
	}
}