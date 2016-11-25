/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer;

import com.super_bits.modulos.SBAcessosModel.controller.FabModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.controller.InfoModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.ProjetoAtual;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoConfigModulo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoLog;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoProjeto;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;

/**
 *
 * @author desenvolvedor
 */
@InfoModulosSistemaSB(modulo = FabModulosSistemaSB.ADMIN_TOOLS)
public enum FabAcaoAdminDeveloper implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-tachometer",
            nomeAcao = "Manutenção", descricao = "Manutenção e Desenvolvimento do Projeto"
    )
    DEV_PROJETO_MB,
    @InfoTipoAcaoFormulario(nomeAcao = "Ferramentas", descricao = "Ferramentas Disponíveis para Gestão do Sistema",
            icone = "fa fa-suitcase")
    DEV_PROJETO_FRM_FERRAMENTAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Objeto", xhtmlDaAcao = "selecaoObjeto.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    DEV_PROJETO_FRM_SELECAO_OBJETOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Ações", xhtmlDaAcao = "selecionarAcoes.xhtml",
            icone = "fa fa-cubes"
    )
    DEV_PROJETO_FRM_SELECAO_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Campo", xhtmlDaAcao = "selecionarCampo.xhtml", icone = "fa fa-pencil-square-o")
    DEV_PROJETO_FRM_SELECAO_CAMPO,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Criar Ação",
            xhtmlDaAcao = "criarAcao.xhtml", icone = "fa fa-sitemap")
    FERRAMENTAS_ACAO_MB_CRIAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Slug Ação", xhtmlDaAcao = "nvAcaoDefSlug.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR)
    FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Icone ação", xhtmlDaAcao = "nvAcaoDefIcone.xhtml",
            icone = "fa fa-font-awesome")
    FERRAMENTAS_ACAO_FRM_ICONE_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Icone ação", xhtmlDaAcao = "nvAcaoDefXHTML.xhtml",
            icone = "fa fa-file-code-o")
    FERRAMENTAS_ACAO_FRM_XHTML_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Objeto ação", xhtmlDaAcao = "nvAcaoDefObj.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS
    )
    FERRAMENTAS_ACAO_FRM_OBJETO_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Nome e Descrição da ação", xhtmlDaAcao = "nvAcaoDefNomeDescri.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR)
    FERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO,
    @InfoTipoAcaoController(nomeAcao = "Instanciar no pacote",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_NOVO)
    FERRAMENTAS_ACAO_CTR_CRIAR,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Variaveis de Ambiente", xhtmlDaAcao = "gestaoConfiguracoesSistema.xhtml",
            icone = "fa fa-cogs")
    FERRAMENTAS_CONFIG_MB,
    @InfoTipoAcaoFormulario(nomeAcao = "SBProjeto", xhtmlDaAcao = "editarSBProjeto.xhtml",
            icone = "fa fa-sliders")
    FERRAMENTAS_CONFIG_FRM_SBPROJETO,
    @InfoTipoAcaoFormulario(nomeAcao = "Cofigurações gerais", xhtmlDaAcao = "congigGeral.xhtml",
            icone = "fa fa-sliders")
    FERRAMENTAS_CONFIG_FRM_CONFIGURACOES_GERAIS,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Logs", xhtmlDaAcao = "logs.xhtml",
            icone = "fa fa-file-text-o")
    FERRAMENTAS_LOGS_MB,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Banco de Dados", xhtmlDaAcao = "bancoDEDadosGestao.xhtml")
    FERRAMENTAS_BANCO_MB,
    @InfoTipoAcaoFormulario(nomeAcao = "Listar Dados", xhtmlDaAcao = "listarDadosBanco.xhtml")
    FERRAMENTAS_BANCO_FRM_LISTAR_DADOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar SQL", xhtmlDaAcao = "editarSQL.xhtml")
    FERRAMENTAS_BANCO_FRM_EDITAR_SQL,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar HQL", xhtmlDaAcao = "editarHQL.xhtml")
    FERRAMENTAS_BANCO_FRM_EDITAR_HQL,
    @InfoTipoAcaoController(nomeAcao = "Listar via SQL")
    FERRAMENTAS_BANCO_CTR_LISTAR_SQL,
    @InfoTipoAcaoController(nomeAcao = "Listar via HQL")
    FERRAMENTAS_BANCO_CTR_LISTAR_HQL,
    @InfoTipoAcaoFormulario(nomeAcao = "Criar Bean de Consulta", xhtmlDaAcao = "beanDeConsulta.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_NOVO)
    FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA;

    @Override
    public AcaoDoSistema getAcaoDoSistema() {

        AcaoDoSistema acao = (AcaoDoSistema) UtilFabricaDeAcoesAcessosModel.getNovaAcao(this);

        return acao;

    }

    @Override
    public Class getEntidadeDominio() {

        switch (this) {
            case DEV_PROJETO_MB:
            case DEV_PROJETO_FRM_FERRAMENTAS:
            case DEV_PROJETO_FRM_SELECAO_OBJETOS:
            case DEV_PROJETO_FRM_SELECAO_ACAO:
            case DEV_PROJETO_FRM_SELECAO_CAMPO:
                return SBInfoProjetoAtual.class;
            case FERRAMENTAS_ACAO_MB_CRIAR:
            case FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO:
            case FERRAMENTAS_ACAO_FRM_ICONE_ACAO:
            case FERRAMENTAS_ACAO_FRM_XHTML_ACAO:
            case FERRAMENTAS_ACAO_FRM_OBJETO_ACAO:
            case FERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO:
            case FERRAMENTAS_ACAO_CTR_CRIAR:
                return AcaoDoSistema.class;
            case FERRAMENTAS_CONFIG_MB:
            case FERRAMENTAS_CONFIG_FRM_SBPROJETO:
            case FERRAMENTAS_CONFIG_FRM_CONFIGURACOES_GERAIS:
                return SBInfoConfigModulo.class;
            case FERRAMENTAS_LOGS_MB:
                return SBInfoLog.class;
            case FERRAMENTAS_BANCO_MB:
            case FERRAMENTAS_BANCO_FRM_LISTAR_DADOS:
            case FERRAMENTAS_BANCO_FRM_EDITAR_SQL:
            case FERRAMENTAS_BANCO_FRM_EDITAR_HQL:
            case FERRAMENTAS_BANCO_CTR_LISTAR_SQL:
            case FERRAMENTAS_BANCO_CTR_LISTAR_HQL:
            case FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA:
                return SBInfoPersistencia.class;
            default:
                throw new AssertionError(this.name());

        }

    }

    @Override
    public String getNomeModulo() {
        return UtilFabricaDeAcoesAcessosModel.getModuloByFabrica(this).getNome();
    }

    @Override
    public AcaoDoSistema getRegistro() {
        return getAcaoDoSistema();
    }

}
