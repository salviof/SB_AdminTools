/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer;

import com.super_bits.modulos.SBAcessosModel.controller.FabModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.controller.InfoModulosSistemaSB;
import com.super_bits.modulos.SBAcessosModel.fabricas.ItfFabricaDeAcoesPersistencia;
import com.super_bits.modulos.SBAcessosModel.model.acoes.AcaoDoSistema;

import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoLog;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SbInfoPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SBInfoProjetoAtual;
import com.super_bits.modulosSB.SBCore.ConfigGeral.model.SbInfoConfigModulo;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoController;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.Controller.anotacoes.InfoTipoAcaoGestaoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;

/**
 *
 * @author desenvolvedor
 */
@InfoModulosSistemaSB(modulo = FabModulosSistemaSB.ADMIN_TOOLS)
public enum FabAcaoAdminDeveloper implements ItfFabricaDeAcoesPersistencia {

    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-tachometer",
            nomeAcao = "Manutenção",
            descricao = "Manutenção e Desenvolvimento do Projeto",
            entidade = SBInfoProjetoAtual.class
    )
    DEV_PROJETO_ADMIN_MB,
    @InfoTipoAcaoGestaoEntidade(icone = "fa fa-tachometer",
            nomeAcao = "Gestão de Objetos do Sistema",
            descricao = "Administração e Debug de Objetos do Sistema",
            xhtmlDaAcao = "objetosLab.xhtml", entidade = EstruturaDeEntidade.class
    )
    DEV_OBJ_PROJETO_MB_LAB,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver campo",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/verCampo.xhtml",
            icone = "fa fa-eye", entidade = EstruturaDeEntidade.class)
    DEV_OBJ_PROJETO_FRM_VER_CAMPO,
    @InfoTipoAcaoFormulario(nomeAcao = "Ver Campo em todos formatos",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/verCampoTodosFormatos.xhtml",
            icone = "fa fa-eye")
    DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Testar onChange",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarOnChange.xhtml",
            icone = "fa fa-retweet")
    DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE,
    @InfoTipoAcaoFormulario(nomeAcao = "Laboratório de criação ",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/laboratorio.xhtml",
            icone = "fa fa-flask")
    DEV_OBJ_PROJETO_FRM_LABORARATORIO,
    @InfoTipoAcaoFormulario(nomeAcao = "VER INSTRUÇÕES",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/instrucoes.xhtml",
            icone = "fa fa-map-marker")
    DEV_OBJ_PROJETO_FRM_INSTRUCOES,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar ids",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarIds.xhtml",
            icone = "fa fa-info")
    DEV_OBJ_PROJETO_FRM_CAMPO_IDS,
    @InfoTipoAcaoFormulario(nomeAcao = "Inspecionar posição",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarPosicao.xhtml",
            icone = "fa fa-question-circle")
    DEV_OBJ_PROJETO_FRM_INSP_POSICOES,
    @InfoTipoAcaoFormulario(nomeAcao = "VER CAMPOS DA AÇÃO",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/camposDaAcao.xhtml",
            icone = "fa fa-question-circle")
    DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO,
    @InfoTipoAcaoFormulario(nomeAcao = "CAMPOS DO AGRUPO",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/camposDoGrupo.xhtml",
            icone = "fa fa-question-circle")

    DEV_OBJ_PROJETO_FRM_INSPECIONAR,
    @InfoTipoAcaoFormulario(nomeAcao
            = "Ficha técnica",
            xhtmlDaAcao = "/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarPropriedades.xhtml",
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
            xhtmlDaAcao = "inspecionarObjeto.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_VISUALIZAR)
    DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Objeto",
            xhtmlDaAcao = "selecaoObjeto.xhtml",
            iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    DEV_OBJ_PROJETO_FRM_SELECAO_OBJETOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Ferramentas",
            descricao = "Ferramentas Disponíveis para Gestão do Sistema",
            icone = "fa fa-suitcase")
    DEV_OBJ_PROJETO_FRM_FERRAMENTAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Ações",
            xhtmlDaAcao = "selecionarAcoes.xhtml",
            icone = "fa fa-cubes"
    )
    DEV_OBJ_PROJETO_FRM_SELECAO_ACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Campo",
            xhtmlDaAcao = "selecionarCampo.xhtml",
            icone = "fa fa-pencil-square-o")
    DEV_OBJ_PROJETO_FRM_SELECAO_CAMPO,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Containers de Objeto", icone = "fa fa-paint-brush", entidade = EstruturaDeEntidade.class, utilizarMesmoFormEdicao = false)
    FERRAMENTAS_OBJETO_CONTAINER_MB,
    @InfoTipoAcaoFormulario(nomeAcao = "Criar nova visualização", icone = "fa fa-paint-brush")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_NOVAVISUALIZACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Informações Do Item", icone = "fa fa-search")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_EDITAR_CONTAINER,
    @InfoTipoAcaoFormulario(nomeAcao = "Listar Objetos de container")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_LISTAR,
    @InfoTipoAcaoFormulario(icone = "fa fa-desktop")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_DESKTOP,
    @InfoTipoAcaoFormulario(icone = "fa fa-mobile")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_MOBILE,
    @InfoTipoAcaoFormulario(icone = "fa fa-object-group")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_MOBILE,
    @InfoTipoAcaoFormulario(icone = "fa fa-object-group fa fa-desktop")
    FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_DESKTOP,
    @InfoTipoAcaoController(nomeAcao = "Criar Visualizacao", icone = "fa fa-gears"
    )
    FERRAMENTAS_OBJETO_CONTAINER_CTR_CRIAR_VISUALIZACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Criar visualização especial", icone = "fa fa-gears"
    )

    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Criar Ação",
            xhtmlDaAcao = "criarAcao.xhtml", icone = "fa fa-sitemap", entidade = AcaoDoSistema.class)
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
            icone = "fa fa-cogs", entidade = SbInfoConfigModulo.class)
    FERRAMENTAS_CONFIG_MB,
    @InfoTipoAcaoFormulario(nomeAcao = "SBProjeto", xhtmlDaAcao = "editarSBProjeto.xhtml",
            icone = "fa fa-sliders")
    FERRAMENTAS_CONFIG_FRM_SBPROJETO,
    @InfoTipoAcaoFormulario(nomeAcao = "Cofigurações gerais", xhtmlDaAcao = "congigGeral.xhtml",
            icone = "fa fa-sliders")
    FERRAMENTAS_CONFIG_FRM_CONFIGURACOES_GERAIS,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Logs", xhtmlDaAcao = "logs.xhtml",
            icone = "fa fa-file-text-o", entidade = SBInfoLog.class)
    FERRAMENTAS_LOGS_MB,
    @InfoTipoAcaoGestaoEntidade(nomeAcao = "Banco de Dados", xhtmlDaAcao = "bancoDEDadosGestao.xhtml", entidade = SbInfoPersistencia.class)
    FERRAMENTAS_BANCO_MB,
    @InfoTipoAcaoFormulario(nomeAcao = "Importar dados", xhtmlDaAcao = "importar.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_ATUALIZAR)
    FERRAMENTAS_BANCO_FRM_IMPORTADOR,
    @InfoTipoAcaoFormulario(nomeAcao = "Selecionar Arquivo Importacao", xhtmlDaAcao = "enviarArquivo.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_ENVIAR)
    FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Mapear Colunas", xhtmlDaAcao = "mapearColunas.xml", iconeFonteAnsowame = FabIconeFontAwesome.REG_AGRUPAR_REGISTROS)
    FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS,
    @InfoTipoAcaoFormulario(nomeAcao = "Relatório de Importacao", xhtmlDaAcao = "relatorio.xml", iconeFonteAnsowame = FabIconeFontAwesome.REG_LISTAR)
    FERRAMENTAS_BANCO_FRM_RELATORIO_IMPORTACAO,
    @InfoTipoAcaoFormulario(nomeAcao = "Listar Dados", xhtmlDaAcao = "listarDadosBanco.xhtml", iconeFonteAnsowame = FabIconeFontAwesome.REG_LISTAR)
    FERRAMENTAS_BANCO_FRM_LISTAR_DADOS,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar SQL", xhtmlDaAcao = "editarSQL.xhtml")
    FERRAMENTAS_BANCO_FRM_EDITAR_SQL,
    @InfoTipoAcaoFormulario(nomeAcao = "Editar HQL", xhtmlDaAcao = "editarHQL.xhtml")
    FERRAMENTAS_BANCO_FRM_EDITAR_HQL,
    @InfoTipoAcaoController(nomeAcao = "Listar via SQL")
    FERRAMENTAS_BANCO_CTR_LISTAR_SQL,
    @InfoTipoAcaoController(nomeAcao = "Persistir dados", iconeFonteAnsowame = FabIconeFontAwesome.REG_BAIXAR)
    FERRAMENTAS_BANCO_CTR_PERSISTIR,
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
    public AcaoDoSistema getRegistro() {
        return (AcaoDoSistema) ItfFabricaDeAcoesPersistencia.super.getRegistro(); //To change body of generated methods, choose Tools | Templates.
    }

}
