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
public class AcoesAdminTools_FerramentasBancoMb implements Serializable {

	public ItfAcaoFormulario getFerramentasBancoMb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmImportador() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmImportadorEnviarArquivoImportacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_ENVIAR_ARQUIVO_IMPORTACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmImportadorMapearColunas() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_MAPEAR_COLUNAS");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmImportadorRelatorioImportacao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR_RELATORIO_IMPORTACAO");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmListarDados() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_LISTAR_DADOS");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmEditarSql() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_SQL");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmEditarHql() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_HQL");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmTestesDeCoexao() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_TESTES_DE_COEXAO");
	}

	public ComoAcaoControllerEntidade getFerramentasBancoCtrListarSql() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_SQL");
	}

	public ComoAcaoControllerEntidade getFerramentasBancoCtrPersistir() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PERSISTIR");
	}

	public ComoAcaoControllerEntidade getFerramentasBancoCtrProcessarDadosImp() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP");
	}

	public ComoAcaoControllerEntidade getFerramentasBancoCtrGravarDadosImp() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP");
	}

	public ComoAcaoControllerEntidade getFerramentasBancoCtrListarHql() {
		return (ComoAcaoControllerEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_HQL");
	}

	public ItfAcaoFormularioEntidade getFerramentasBancoFrmCriarConsulta() {
		return (ItfAcaoFormularioEntidade) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA");
	}
}