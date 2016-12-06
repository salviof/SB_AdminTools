/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer;

import com.super_bits.modulos.SBAcessosModel.controller.FabModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.controller.InfoModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;
import com.super_bits.modulos.SBAcessosModel.model.acoes.UtilFabricaDeAcoesAcessosModel;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoConfigModulo;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoLog;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.fabrica.ItfFabricaAcoes;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;

/**
 *
 * @author desenvolvedor
 */
@InfoModulosSistemaSB(modulo = FabModulosSistemaSB.ADMIN_TOOLS)
public enum FabAcaoAdminDeveloper implements ItfFabricaAcoes {

    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-tachometer",
            nomeAcao = "Manutenção",
            descricao = "Manutenção e Desenvolvimento do Projeto"
    )
    DEV_PROJETO_ADMIN_MB,
    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-tachometer",
            nomeAcao = "Gestão de Objetos do Sistema",
            descricao = "Administração e Debug de Objetos do Sistema",
            xhtmlDaAcao = "objetosLab.xhtml"
    )
    DEV_OBJ_PROJETO_MB_LAB,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver campo",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/verCampo.xhtml",
            icone = "fa fa-eye")
    DEV_OBJ_PROJETO_FRM_VER_CAMPO,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver Campo em todos formatos",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/verCampoTodosFormatos.xhtml",
            icone = "fa fa-eye")
    DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar onChange",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/inspecionarOnChange.xhtml",
            icone = "fa fa-retweet")
    DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE,
    @InfoTipoAcaoFormulario(nomeAcao = "Laboratório de criação ",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/laboratorio.xhtml",
            icone = "fa fa-flask")
    DEV_OBJ_PROJETO_FRM_LABORARATORIO,
    @InfoTipoAcaoFormulario(nomeAcao = "VER INSTRUÇÕES",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/instrucoes.xhtml",
            icone = "fa fa-map-marker")
    DEV_OBJ_PROJETO_FRM_INSTRUCOES,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar ids",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/inspecionarIds.xhtml",
            icone = "fa fa-info")
    DEV_OBJ_PROJETO_FRM_CAMPO_IDS,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar posição",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/inspecionarPosicao.xhtml",
            icone = "fa fa-question-circle")
    DEV_OBJ_PROJETO_FRM_INSP_POSICOES,
    @InfoTipoAcaoFormulario(nomeAcao = "VER CAMPOS DA AÇÃO",
            xhtmlDaAcao = "/resources/SBComp/debug/camposDaAcao.xhtml",
            icone = "fa fa-question-circle")
    DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO,
    @InfoTipoAcaoFormulario(nomeAcao = "CAMPOS DO AGRUPO",
            xhtmlDaAcao = "/resources/SBComp/debug/camposDoGrupo.xhtml",
            icone = "fa fa-question-circle")
    DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DO_GRUPO_FORMULARIO,
    @InfoTipoAcaoFormulario(nomeAcao = "Visualizacao Do Item",
            xhtmlDaAcao = "/resources/SBComp/debug/visualizadorDeItem.xhtml", icone = "fa fa-eye"
    )
    DEV_OBJ_PROJETO_CAMPO_FRM_VISUALIZACAO_ITEM,
    @InfoTipoAcaoFormulario(nomeAcao = "Visualizacao Do Item",
            xhtmlDaAcao = "/resources/SBComp/debug/inspecionarCampo.xhml", icone = "fa fa-gears"
    )
    DEV_OBJ_PROJETO_FRM_INSPECIONAR,
    @InfoTipoAcaoFormulario(nomeAcao
            = "Ficha técnica",
            xhtmlDaAcao = "/resources/SBComp/debug/campo/inspecionarPropriedades.xhtml",
            icone = "fa fa-cogs")
    DEV_OBJ_PROJETO_FRM_FICHATECNICA,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar Input",
            xhtmlDaAcao = "inspecaoInput.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_PESQUISAR)
    DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecao Tipo Laboratorio", xhtmlDaAcao = "selecaoTipoLab.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar Componente Visual",
            xhtmlDaAcao = "inspecaoComponenteVisual.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar Objeto de Entidade",
<<<<<<< HEAD
            xhtmlDaAcao = "inspecaoObjeto.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
=======
            xhtmlDaAcao = "inspecionarObjeto.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
>>>>>>> 5f7706ef6b98c89ec4b8cede368cb6974ff58550
    DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Objeto",
            xhtmlDaAcao = "selecaoObjeto.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    DEV_PROJETO_FRM_SELECAO_OBJETOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Ferramentas",
            descricao = "Ferramentas Disponíveis para Gestão do Sistema",
            icone = "fa fa-suitcase")
    DEV_PROJETO_FRM_FERRAMENTAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Ações",
            xhtmlDaAcao = "selecionarAcoes.xhtml",
            icone = "fa fa-cubes"
    )
    DEV_PROJETO_FRM_SELECAO_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Campo",
            xhtmlDaAcao = "selecionarCampo.xhtml",
            icone = "fa fa-pencil-square-o")
    DEV_PROJETO_FRM_SELECAO_CAMPO,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Criar Ação",
            xhtmlDaAcao = "criarAcao.xhtml", icone = "fa fa-sitemap")
    FERRAMENTAS_ACAO_MB_CRIAR,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Slug Ação",
            xhtmlDaAcao = "nvAcaoDefSlug.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_EDITAR)
    FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Icone ação",
            xhtmlDaAcao = "nvAcaoDefIcone.xhtml",
            icone = "fa fa-font-awesome")
    FERRAMENTAS_ACAO_FRM_ICONE_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Icone ação",
            xhtmlDaAcao = "nvAcaoDefXHTML.xhtml",
            icone = "fa fa-file-code-o")
    FERRAMENTAS_ACAO_FRM_XHTML_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Objeto ação",
            xhtmlDaAcao = "nvAcaoDefObj.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS
    )
    FERRAMENTAS_ACAO_FRM_OBJETO_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Definir Nome e Descrição da ação",
            xhtmlDaAcao = "nvAcaoDefNomeDescri.xhtml",
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
    @InfoTipoAcaoFormulario(nomeAcao = "Importar dados", xhtmlDaAcao = "importar.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_ATUALIZAR)
    FERRAMENTAS_BANCO_FRM_IMPORTADOR,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Arquivo Importacao", xhtmlDaAcao = "enviarArquivo.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_ENVIAR)
    FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Mapear Colunas", xhtmlDaAcao = "mapearColunas.xml", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Relatório de Importacao", xhtmlDaAcao = "relatorio.xml", iconeFonteAnsowame = FabIconeFontAwesome.REG_LISTAR)
    FERRMANTAS_BANCO_FRM_RELATORIO_IMPORTACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Listar Dados", xhtmlDaAcao = "listarDadosBanco.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_LISTAR)
    FERRAMENTAS_BANCO_FRM_LISTAR_DADOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar SQL", xhtmlDaAcao = "editarSQL.xhtml")
    FERRAMENTAS_BANCO_FRM_EDITAR_SQL,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar HQL", xhtmlDaAcao = "editarHQL.xhtml")
    FERRAMENTAS_BANCO_FRM_EDITAR_HQL,
    @InfoTipoAcaoController(nomeAcao = "Listar via SQL")
    FERRAMENTAS_BANCO_CTR_LISTAR_SQL,
    @InfoTipoAcaoController(nomeAcao = "Processar dados")
    FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP,
    @InfoTipoAcaoController(nomeAcao = "Gravar dados",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_ATUALIZAR)
    FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP,
    @InfoTipoAcaoController(nomeAcao = "Listar via HQL",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_LISTAR)
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
    public Class
            getEntidadeDominio() {

        switch (this) {
            case DEV_PROJETO_ADMIN_MB:
            case DEV_PROJETO_FRM_FERRAMENTAS:
                return SBInfoProjetoAtual.class;
            case DEV_PROJETO_FRM_SELECAO_OBJETOS:
            case DEV_PROJETO_FRM_SELECAO_ACAO:
            case DEV_PROJETO_FRM_SELECAO_CAMPO:

            case DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT:
            case DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL:
            case DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS:

            case DEV_OBJ_PROJETO_FRM_VER_CAMPO:
            case DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS:
            case DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE:
            case DEV_OBJ_PROJETO_FRM_LABORARATORIO:
            case DEV_OBJ_PROJETO_FRM_INSTRUCOES:
            case DEV_OBJ_PROJETO_FRM_CAMPO_IDS:
            case DEV_OBJ_PROJETO_FRM_INSP_POSICOES:
            case DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO:
            case DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DO_GRUPO_FORMULARIO:

            case DEV_OBJ_PROJETO_MB_LAB:
            case DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO:
            case DEV_OBJ_PROJETO_CAMPO_FRM_VISUALIZACAO_ITEM:
            case DEV_OBJ_PROJETO_FRM_INSPECIONAR:
            case DEV_OBJ_PROJETO_FRM_FICHATECNICA:
                return EstruturaDeEntidade.class;

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
            case FERRAMENTAS_BANCO_FRM_IMPORTADOR:
            case FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO:
            case FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS:
            case FERRMANTAS_BANCO_FRM_RELATORIO_IMPORTACAO:
            case FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP:
            case FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP:
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
