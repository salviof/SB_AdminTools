-- MySQL dump 10.13  Distrib 5.7.19, for Linux (x86_64)
--
-- Host: localhost    Database: SB_AdminToolsModelRegras
-- ------------------------------------------------------
-- Server version	5.7.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `AcaoDoSistema`
--

DROP TABLE IF EXISTS `AcaoDoSistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AcaoDoSistema` (
  `tipoAcaoDB` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `cor` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `diretorioBaseArquivos` varchar(255) DEFAULT NULL,
  `iconeAcao` varchar(255) DEFAULT NULL,
  `idDescritivoJira` varchar(255) DEFAULT NULL,
  `nomeAcao` varchar(255) DEFAULT NULL,
  `nomeSlugDominio` varchar(255) DEFAULT NULL,
  `nomeUnico` varchar(255) DEFAULT NULL,
  `precisaPermissao` bit(1) NOT NULL,
  `tipoAcao` varchar(255) DEFAULT NULL,
  `tipoAcaoGenerica` varchar(255) DEFAULT NULL,
  `nomeDominio` varchar(255) DEFAULT NULL,
  `estadoFormulario` int(11) DEFAULT NULL,
  `xhtml` varchar(255) DEFAULT NULL,
  `nomeUnicoAcoesDisponiveis` tinyblob,
  `acaoTemModal` bit(1) DEFAULT NULL,
  `campoJustificativa` varchar(255) DEFAULT NULL,
  `idMetodo` int(11) DEFAULT NULL,
  `precisaComunicacao` bit(1) DEFAULT NULL,
  `precisaJustificativa` bit(1) DEFAULT NULL,
  `temLogExecucao` bit(1) DEFAULT NULL,
  `textoComunicacaoPersonalizado` varchar(255) DEFAULT NULL,
  `xhtmlModalVinculado` varchar(255) DEFAULT NULL,
  `temVisualizar` bit(1) DEFAULT NULL,
  `modulo_id` int(11) DEFAULT NULL,
  `acaoPrincipal_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnff94k77k0bke2qf07y84ips5` (`modulo_id`),
  KEY `FK9lr8dl4k551tauvs4k699ct2j` (`acaoPrincipal_id`),
  CONSTRAINT `FK9lr8dl4k551tauvs4k699ct2j` FOREIGN KEY (`acaoPrincipal_id`) REFERENCES `AcaoDoSistema` (`id`),
  CONSTRAINT `FKnff94k77k0bke2qf07y84ips5` FOREIGN KEY (`modulo_id`) REFERENCES `ModuloAcaoSistema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AcaoDoSistema`
--

LOCK TABLES `AcaoDoSistema` WRITE;
/*!40000 ALTER TABLE `AcaoDoSistema` DISABLE KEYS */;
INSERT INTO `AcaoDoSistema` VALUES ('AcaoFormularioEntidade',-2105300470,NULL,'','/site/modulos/paginas_do_sistema/conteudo_generico','fa fa-edit',NULL,'Editar Conteúdo Generico','CONTEUDO_GENERICO','FabAcaoExemplos.CONTEUDO_GENERICO_FRM_EDITAR','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_EDITAR',NULL,1,'/site/modulos/paginas_do_sistema/conteudo_generico/conteudo_generico_editar.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1432875122,-1234139162),('AcaoFormularioEntidade',-2027064541,NULL,'Testar onChange','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-retweet',NULL,'Testar onChange',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_TESTAR_ONCHANGE','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarOnChange.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-1971812554,NULL,'Importar dados','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-refresh',NULL,'Importar dados','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_IMPORTADOR','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/importar.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoFormularioEntidade',-1918340614,NULL,'Ficha técnica','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-cogs',NULL,'Ficha técnica',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FICHATECNICA','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarPropriedades.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-1899980898,NULL,'','/site/modulos/paginas_do_sistema/conteudo_generico','fa fa-list-alt',NULL,'Listar Conteúdo Generico','CONTEUDO_GENERICO','FabAcaoExemplos.CONTEUDO_GENERICO_FRM_LISTAR','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_LISTAR',NULL,1,'/site/modulos/paginas_do_sistema/conteudo_generico/conteudo_generico_listar.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1432875122,-1234139162),('AcaoDeEntidadeController',-1840790681,NULL,'Instanciar no pacote','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-plus',NULL,'FERRAMENTAS_ACAO_CTR_CRIAR','FERRAMENTAS_ACAO','FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_CTR_CRIAR','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_PERSONALIZADO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoFormularioEntidade',-1839700535,NULL,'Selecionar Objeto','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-th-large',NULL,'Selecionar Objeto','DEV_OBJ_PROJETO','FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_OBJETOS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/selecaoObjeto.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-1758401878,NULL,'Editar HQL','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-edit',NULL,'Editar HQL','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_HQL','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_EDITAR',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/editarHQL.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoFormularioEntidade',-1758391307,NULL,'Editar SQL','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-edit',NULL,'Editar SQL','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_EDITAR_SQL','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_EDITAR',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/editarSQL.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoDeEntidadeController',-1757816514,NULL,'Listar via HQL','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-list-ol',NULL,'FERRAMENTAS_BANCO_CTR_LISTAR_HQL','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_HQL','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_PERSONALIZADO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoDeEntidadeController',-1757805943,NULL,'Listar via SQL','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-gear',NULL,'FERRAMENTAS_BANCO_CTR_LISTAR_SQL','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_LISTAR_SQL','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_PERSONALIZADO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoFormularioEntidade',-1689919350,NULL,'Ver campo','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-eye',NULL,'Ver campo',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/verCampo.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoGestaoEntidade',-1648083097,NULL,'Manutenção e Desenvolvimento do Projeto','/site/modulos/sb_admin_tools/dev_projeto_admin','fa fa-tachometer',NULL,'Manutenção','DEV_PROJETO_ADMIN','FabAcaoAdminDeveloper.DEV_PROJETO_ADMIN_MB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/sb_admin_tools/dev_projeto_admin/dev_projeto_admin_gerenciar.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoGestaoEntidade',-1548927618,NULL,'','/site/modulos/paginas_do_sistema/pagina_nativa_erro_critico','fa fa-key',NULL,'PAGINA_NATIVA_ERRO_CRITICO_MB_PADRAO','PAGINA_NATIVA_ERRO_CRITICO','FabAcaoPaginasDoSistema.PAGINA_NATIVA_ERRO_CRITICO_MB_PADRAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/SBSystemPages/erroGenerico.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,NULL),('AcaoFormularioEntidade',-1443762430,NULL,'Definir Objeto ação','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-th-large',NULL,'Definir Objeto ação','FERRAMENTAS_ACAO','FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_OBJETO_ACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_acao/nvAcaoDefObj.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,-199247545),('AcaoGestaoEntidade',-1295285142,NULL,'','/site/modulos/paginas_do_sistema/pagina_nativa_view_expirou','fa fa-refresh',NULL,'PAGINA_NATIVA_VIEW_EXPIROU_MB_PADRAO','PAGINA_NATIVA_VIEW_EXPIROU','FabAcaoPaginasDoSistema.PAGINA_NATIVA_VIEW_EXPIROU_MB_PADRAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/SBSystemPages/viewExpirou.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,NULL),('AcaoGestaoEntidade',-1234139162,NULL,'','/site/modulos/paginas_do_sistema/conteudo_generico','fa fa-table',NULL,'CONTEUDO_GENERICO_MB',NULL,'FabAcaoExemplos.CONTEUDO_GENERICO_MB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/paginas_do_sistema/conteudo_generico/conteudo_generico_gerenciar.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1432875122,NULL),('AcaoFormularioEntidade',-1166566319,NULL,'','/site/modulos/paginas_do_sistema/pagina_nativa_acesso_negado','fa fa-lock',NULL,'Form Ação do Sistema',NULL,'FabAcaoPaginasDoSistema.PAGINA_NATIVA_ACESSO_NEGADO_FRM_SUB_FORM','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/resources/SBComp/SBSystemPages/acessoNegadoSubForm.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,1214834503),('AcaoDeEntidadeController',-1128723762,NULL,'Processar dados','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-gear',NULL,'FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PROCESSAR_DADOS_IMP','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_PERSONALIZADO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoFormularioEntidade',-887125491,NULL,'Definir Nome e Descrição da ação','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-edit',NULL,'Definir Nome e Descrição da ação','FERRAMENTAS_ACAO','FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_NOME_E_DESCRICAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_acao/nvAcaoDefNomeDescri.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,-199247545),('AcaoFormularioEntidade',-749210607,NULL,'Visualizacao Do Item','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-gears',NULL,'Visualizacao Do Item',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/inspecionarCampo.xhml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoGestaoEntidade',-666411053,NULL,'','/site/modulos/paginas_do_sistema/pagina_pesquisa_avancada','fa fa-search-plus',NULL,'PAGINA_PESQUISA_AVANCADA_MB_PADRAO','PAGINA_PESQUISA_AVANCADA','FabAcaoPaginasDoSistema.PAGINA_PESQUISA_AVANCADA_MB_PADRAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/modal/pesquisaItemAvancada',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,NULL),('AcaoFormularioEntidade',-657591989,NULL,'VER INSTRUÇÕES','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-map-marker',NULL,'VER INSTRUÇÕES',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSTRUCOES','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/instrucoes.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-649346273,NULL,'Inspecionar ids','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-info',NULL,'Inspecionar ids',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_CAMPO_IDS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarIds.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-423687957,NULL,'Ver Ações','/site/modulos/paginas_do_sistema/projeto','fa fa-bars',NULL,'Ver Ações',NULL,'FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_ACOES','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_VISUALIZAR',NULL,1,'/resources/SBComp/projeto/pontosDeFuncao.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1384659227,-310671879),('AcaoFormularioEntidade',-411590206,NULL,'Selecao Tipo Laboratorio','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-th-large',NULL,'Selecao Tipo Laboratorio',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_TIPO_LABORATORIO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/selecaoTipoLab.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-400349238,NULL,'Relatório de Importacao','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-list-ol',NULL,'Relatório de Importacao','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_RELATORIO_IMPORTACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/relatorio.xml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoFormularioEntidade',-321857593,NULL,'Definir Icone ação','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-font-awesome',NULL,'Definir Icone ação','FERRAMENTAS_ACAO','FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_ICONE_ACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_acao/nvAcaoDefIcone.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,-199247545),('AcaoGestaoEntidade',-310671879,NULL,'Gestão do Projeto','/site/modulos/paginas_do_sistema/projeto','fa fa-codepen','SK-94','Gestão do Projeto','PROJETO','FabAcaoProjetoSB.PROJETO_MB_GERENCIAR','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/projeto/gerenciarProjeto.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1384659227,NULL),('AcaoFormularioEntidade',-216102404,NULL,'Inspecionar Objeto de Entidade','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-eye',NULL,'Inspecionar Objeto de Entidade',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_OBJETOS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/inspecionarObjeto.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoGestaoEntidade',-199247545,NULL,'Criar Ação','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-sitemap',NULL,'Criar Ação',NULL,'FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_MB_CRIAR','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/sb_admin_tools/ferramentas_acao/criarAcao.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoGestaoEntidade',-166499173,NULL,'Descrição não documentada','/site/modulos/sb_admin_tools/demonstracao','fa fa-heart-o',NULL,'DEMONSTRACAO_MB_COMPONENTE','DEMONSTRACAO','FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/SBSystemPages/exemplos/demoSuperBitsFrameWork.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1189894204,NULL),('AcaoFormularioEntidade',-159320092,NULL,'Inspecionar posição','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-question-circle',NULL,'Inspecionar posição',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSP_POSICOES','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/inspecionarPosicao.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',-154035766,NULL,'Ferramentas Disponíveis para Gestão do Sistema','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-suitcase',NULL,'Ferramentas',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_FERRAMENTAS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/dev_obj_projeto_ferramentas.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',15086864,NULL,'Definir Icone ação','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-file-code-o',NULL,'Definir Icone ação','FERRAMENTAS_ACAO','FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_XHTML_ACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_acao/nvAcaoDefXHTML.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,-199247545),('AcaoFormularioEntidade',18017193,NULL,'Inspecionar Componente Visual','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-eye',NULL,'Inspecionar Componente Visual',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONAR_COMPONENTE_VISUAL','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/inspecaoComponenteVisual.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',158142412,NULL,'Cofigurações gerais','/site/modulos/sb_admin_tools/ferramentas_config','fa fa-sliders',NULL,'Cofigurações gerais','FERRAMENTAS_CONFIG','FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_FRM_CONFIGURACOES_GERAIS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_config/congigGeral.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1857587369),('AcaoFormularioEntidade',171997422,NULL,'Selecionar Arquivo Importacao','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-upload',NULL,'Selecionar Arquivo Importacao','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_ENVIAR_ARQUIVO_IMPORTACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/enviarArquivo.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoFormularioEntidade',291103068,NULL,'Definir Slug Ação','/site/modulos/sb_admin_tools/ferramentas_acao','fa fa-edit',NULL,'Definir Slug Ação','FERRAMENTAS_ACAO','FabAcaoAdminDeveloper.FERRAMENTAS_ACAO_FRM_DEF_NOME_SLUG_ACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_acao/nvAcaoDefSlug.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,-199247545),('AcaoFormularioEntidade',292294613,NULL,'Visualizar Tabela','/site/modulos/paginas_do_sistema/projeto','fa fa-bars',NULL,'Visualizar Tabela',NULL,'FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_TABELA','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_VISUALIZAR',NULL,1,'/resources/SBComp/projeto/infoTabela.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1384659227,-310671879),('AcaoDeEntidadeController',433641713,NULL,'','/site/modulos/paginas_do_sistema/conteudo_generico','fa fa-save',NULL,'CONTEUDO_GENERICO_CTR_SALVAR_MERGE','CONTEUDO_GENERICO','FabAcaoExemplos.CONTEUDO_GENERICO_CTR_SALVAR_MERGE','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_SALVAR_MODO_MERGE',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1432875122,NULL),('AcaoFormularioEntidade',505463409,NULL,'Mapear Colunas','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-th-large',NULL,'Mapear Colunas','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_MAPEAR_COLUNAS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/mapearColunas.xml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoFormularioEntidade',711170293,NULL,'VER CAMPOS DA AÇÃO','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-question-circle',NULL,'VER CAMPOS DA AÇÃO',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DA_ACAO_FORMULARIO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/camposDaAcao.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',715935289,NULL,'Inspecionar Input','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-search',NULL,'Inspecionar Input',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_INSPECIONARINPUT','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/inspecaoInput.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',790822054,NULL,'CAMPOS DO AGRUPO','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-question-circle',NULL,'CAMPOS DO AGRUPO',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPOS_DO_GRUPO_FORMULARIO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/camposDoGrupo.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoGestaoEntidade',852602850,NULL,'Banco de Dados','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-table',NULL,'Banco de Dados',NULL,'FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_MB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/sb_admin_tools/ferramentas_banco/bancoDEDadosGestao.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoDeEntidadeController',905002162,NULL,'Persistir dados','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-download',NULL,'FERRAMENTAS_BANCO_CTR_PERSISTIR','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_PERSISTIR','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_PERSONALIZADO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoFormularioEntidade',929992525,NULL,'Selecionar Campo','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-pencil-square-o',NULL,'Selecionar Campo',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_CAMPO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/selecionarCampo.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',932355750,NULL,'Listar Dados','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-list-ol',NULL,'Listar Dados','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_LISTAR_DADOS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_LISTAR',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/listarDadosBanco.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoGestaoEntidade',1097115037,NULL,'','/site/modulos/sb_admin_tools/demonstracao','fa fa-sitemap',NULL,'DEMONSTRACAO_MB_RECURSOS','DEMONSTRACAO','FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_RECURSOS','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/projeto/gerenciarRecursos.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1189894204,NULL),('AcaoFormularioEntidade',1102278479,NULL,'Ver Campo em todos formatos','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-eye',NULL,'Ver Campo em todos formatos',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_VER_CAMPO_EM_TODOS_FORMATOS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/verCampoTodosFormatos.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoGestaoEntidade',1123082460,NULL,'Logs','/site/modulos/sb_admin_tools/ferramentas_logs','fa fa-file-text-o',NULL,'Logs','FERRAMENTAS_LOGS','FabAcaoAdminDeveloper.FERRAMENTAS_LOGS_MB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/sb_admin_tools/ferramentas_logs/logs.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoGestaoEntidade',1148019799,NULL,'','/site/modulos/paginas_do_sistema/pagina_nativa_home','fa fa-heart-o',NULL,'PAGINA_NATIVA_HOME_MB_PADRAO','PAGINA_NATIVA_HOME','FabAcaoPaginasDoSistema.PAGINA_NATIVA_HOME_MB_PADRAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/home.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,NULL),('AcaoFormularioEntidade',1173000984,NULL,'Visualizacao Do Item','/site/modulos/sb_admin_tools/dev_obj_projeto_campo','fa fa-eye',NULL,'Visualizacao Do Item','DEV_OBJ_PROJETO_CAMPO','FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_CAMPO_FRM_VISUALIZACAO_ITEM','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/visualizadorDeItem.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',1189231409,NULL,'','/site/modulos/paginas_do_sistema/conteudo_generico','fa fa-eye',NULL,'Visualizar Conteúdo Generico',NULL,'FabAcaoExemplos.CONTEUDO_GENERICO_FRM_VISUALIZAR','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_VISUALIZAR',NULL,1,'/site/modulos/paginas_do_sistema/conteudo_generico/conteudo_generico_editar.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1432875122,-1234139162),('AcaoGestaoEntidade',1214834503,NULL,'','/site/modulos/paginas_do_sistema/pagina_nativa_acesso_negado','fa fa-lock',NULL,'PAGINA_NATIVA_ACESSO_NEGADO_MB_PADRAO','PAGINA_NATIVA_ACESSO_NEGADO','FabAcaoPaginasDoSistema.PAGINA_NATIVA_ACESSO_NEGADO_MB_PADRAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/SBSystemPages/acessoNegado.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,NULL),('AcaoGestaoEntidade',1336920065,NULL,'','/site/modulos/paginas_do_sistema/pagina_nativa_login','fa fa-key',NULL,'PAGINA_NATIVA_LOGIN_MB_PADRAO','PAGINA_NATIVA_LOGIN','FabAcaoPaginasDoSistema.PAGINA_NATIVA_LOGIN_MB_PADRAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/SBSystemPages/login.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-477325983,NULL),('AcaoDeEntidadeController',1375148117,NULL,'Gravar dados','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-refresh',NULL,'FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_CTR_GRAVAR_DADOS_IMP','\0','ACAO_ENTIDADE_CONTROLLER','CONTROLLER_PERSONALIZADO',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoFormularioEntidade',1384646753,NULL,'Visualizar Banco de Dados','/site/modulos/paginas_do_sistema/projeto','fa fa-bars',NULL,'Visualizar Banco de Dados',NULL,'FabAcaoProjetoSB.PROJETO_FRM_VISUALIZAR_BANCO_DE_DADOS','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_VISUALIZAR',NULL,1,'/resources/SBComp/projeto/umlBancoDeDados.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1384659227,-310671879),('AcaoGestaoEntidade',1670208953,NULL,'Descrição não documentada','/site/modulos/sb_admin_tools/demonstracao','fa fa-heart-o',NULL,'DEMONSTRACAO_MB_VALIDACAO','DEMONSTRACAO','FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_VALIDACAO','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/SBSystemPages/exemplosAdamantium/validacao.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1189894204,NULL),('AcaoFormularioEntidade',1769736917,NULL,'Laboratório de criação ','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-flask',NULL,'Laboratório de criação ',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_LABORARATORIO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/debug/campo/laboratorio.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoFormularioEntidade',1831057041,NULL,'Selecionar Ações','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-cubes',NULL,'Selecionar Ações',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_FRM_SELECAO_ACAO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/dev_obj_projeto/selecionarAcoes.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1947898989),('AcaoGestaoEntidade',1857587369,NULL,'Variaveis de Ambiente','/site/modulos/sb_admin_tools/ferramentas_config','fa fa-cogs',NULL,'Variaveis de Ambiente','FERRAMENTAS_CONFIG','FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_MB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/sb_admin_tools/ferramentas_config/gestaoConfiguracoesSistema.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoGestaoEntidade',1947898989,NULL,'Administração e Debug de Objetos do Sistema','/site/modulos/sb_admin_tools/dev_obj_projeto','fa fa-tachometer',NULL,'Gestão de Objetos do Sistema',NULL,'FabAcaoAdminDeveloper.DEV_OBJ_PROJETO_MB_LAB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/site/modulos/sb_admin_tools/dev_obj_projeto/objetosLab.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,NULL),('AcaoFormularioEntidade',1978518420,NULL,'Criar Bean de Consulta','/site/modulos/sb_admin_tools/ferramentas_banco','fa fa-plus',NULL,'Criar Bean de Consulta','FERRAMENTAS_BANCO','FabAcaoAdminDeveloper.FERRAMENTAS_BANCO_FRM_CRIAR_CONSULTA','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_banco/beanDeConsulta.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,852602850),('AcaoFormularioEntidade',2020097473,NULL,'Visão geral','/site/modulos/paginas_do_sistema/projeto','fa fa-bars',NULL,'Visão geral',NULL,'FabAcaoProjetoSB.PROJETO_FRM_VISAO_GERAL','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/resources/SBComp/projeto/visaoGeral.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1384659227,-310671879),('AcaoFormularioEntidade',2056385154,NULL,'SBProjeto','/site/modulos/sb_admin_tools/ferramentas_config','fa fa-sliders',NULL,'SBProjeto','FERRAMENTAS_CONFIG','FabAcaoAdminDeveloper.FERRAMENTAS_CONFIG_FRM_SBPROJETO','\0','ACAO_ENTIDADE_FORMULARIO','FORMULARIO_PERSONALIZADO',NULL,1,'/site/modulos/sb_admin_tools/ferramentas_config/editarSBProjeto.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,-1046263694,1857587369),('AcaoGestaoEntidade',2080145523,NULL,'','/site/modulos/sb_admin_tools/testes_campo','fa fa-pencil-square-o',NULL,'TESTES_CAMPO_MB','TESTES_CAMPO','FabAcaoDemonstracaoSB.TESTES_CAMPO_MB','\0','ACAO_ENTIDADE_FORMULARIO','GERENCIAR_DOMINIO',NULL,2,'/resources/SBComp/debug/conformidadeInputCampo.xhtml',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,1189894204,NULL);
/*!40000 ALTER TABLE `AcaoDoSistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Bairro`
--

DROP TABLE IF EXISTS `Bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bairro` (
  `id` int(11) NOT NULL,
  `coordenadas` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cidade_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKc6grs1jdy5u4dhdfsyd61jgk5` (`cidade_id`),
  CONSTRAINT `FKc6grs1jdy5u4dhdfsyd61jgk5` FOREIGN KEY (`cidade_id`) REFERENCES `Cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Bairro`
--

LOCK TABLES `Bairro` WRITE;
/*!40000 ALTER TABLE `Bairro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Bairro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Cidade`
--

DROP TABLE IF EXISTS `Cidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cidade` (
  `id` int(11) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dataCriacao` date DEFAULT NULL,
  `nome` varchar(255) NOT NULL,
  `id_Localidade` int(11) DEFAULT NULL,
  `unidadeFederativa_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKgj6br5dxt0ht6uje8hy4n2wgw` (`id_Localidade`),
  KEY `FK8fbd6ik5ht9qwwaik1mi6jgf0` (`unidadeFederativa_id`),
  CONSTRAINT `FK8fbd6ik5ht9qwwaik1mi6jgf0` FOREIGN KEY (`unidadeFederativa_id`) REFERENCES `UnidadeFederativa` (`id`),
  CONSTRAINT `FKgj6br5dxt0ht6uje8hy4n2wgw` FOREIGN KEY (`id_Localidade`) REFERENCES `Localidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cidade`
--

LOCK TABLES `Cidade` WRITE;
/*!40000 ALTER TABLE `Cidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `Cidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ConfiguracaoDePermissao`
--

DROP TABLE IF EXISTS `ConfiguracaoDePermissao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ConfiguracaoDePermissao` (
  `id` int(11) NOT NULL,
  `nomeConfig` varchar(255) DEFAULT NULL,
  `permitirCriacaoDeGrupos` bit(1) NOT NULL,
  `permitirPermissaoDeUsuario` bit(1) NOT NULL,
  `ultimaVersaoBanco` varchar(255) DEFAULT NULL,
  `grupoUsuarioPadrao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKah1otecpdqxj49533o8geb7c0` (`grupoUsuarioPadrao_id`),
  CONSTRAINT `FKah1otecpdqxj49533o8geb7c0` FOREIGN KEY (`grupoUsuarioPadrao_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConfiguracaoDePermissao`
--

LOCK TABLES `ConfiguracaoDePermissao` WRITE;
/*!40000 ALTER TABLE `ConfiguracaoDePermissao` DISABLE KEYS */;
INSERT INTO `ConfiguracaoDePermissao` VALUES (0,NULL,'\0','\0','712857828',NULL);
/*!40000 ALTER TABLE `ConfiguracaoDePermissao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ConteudoGenerico`
--

DROP TABLE IF EXISTS `ConteudoGenerico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ConteudoGenerico` (
  `id` int(11) NOT NULL,
  `dataAlteracao` datetime DEFAULT NULL,
  `dataInsercao` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKavy7i0exbj1cjxqra6vbjf28x` (`localizacao_id`),
  KEY `FKaiubrt7j0mx89ji26fnlvmu1t` (`usuarioAlteracao_id`),
  KEY `FKisc6ukpucc28wml662a2g4tvb` (`usuarioInsercao_id`),
  CONSTRAINT `FKaiubrt7j0mx89ji26fnlvmu1t` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKavy7i0exbj1cjxqra6vbjf28x` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKisc6ukpucc28wml662a2g4tvb` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ConteudoGenerico`
--

LOCK TABLES `ConteudoGenerico` WRITE;
/*!40000 ALTER TABLE `ConteudoGenerico` DISABLE KEYS */;
INSERT INTO `ConteudoGenerico` VALUES (1,NULL,NULL,'Lorem ipsum dolor sit amet,','Conteúdo Teste ',NULL,NULL,NULL);
/*!40000 ALTER TABLE `ConteudoGenerico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `GrupoUsuarioSB`
--

DROP TABLE IF EXISTS `GrupoUsuarioSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `GrupoUsuarioSB` (
  `tipoGrupoUsuario` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `XhtmlPaginaInicial` varchar(255) DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `dataHoraAlteracao` datetime DEFAULT NULL,
  `dataHoraInsersao` datetime DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `tipoGrupoNativo` bit(1) NOT NULL,
  `moduloPrincipal_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_3wv40cn2xjarnckhmw50xibgh` (`nome`),
  KEY `FKrcx4qo1ruqe8koyfg2vb238jg` (`moduloPrincipal_id`),
  KEY `FKn20xy684qdisrx1r0wyeffosn` (`usuarioAlteracao_id`),
  KEY `FK7s5bl86yjv1r1rfn9i964cq7g` (`usuarioInsercao_id`),
  CONSTRAINT `FK7s5bl86yjv1r1rfn9i964cq7g` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKn20xy684qdisrx1r0wyeffosn` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKrcx4qo1ruqe8koyfg2vb238jg` FOREIGN KEY (`moduloPrincipal_id`) REFERENCES `ModuloAcaoSistema` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `GrupoUsuarioSB`
--

LOCK TABLES `GrupoUsuarioSB` WRITE;
/*!40000 ALTER TABLE `GrupoUsuarioSB` DISABLE KEYS */;
INSERT INTO `GrupoUsuarioSB` VALUES ('GrupoUsuarioSB',1,'/site/exemplo/inicialAnonimo.xhtml','',NULL,NULL,'Usuário não cadastrado','Grupo Anonimo','\0',NULL,NULL,NULL),('GrupoUsuarioSB',2,'/site/exemplo/inicialAdministrado.xhtml','',NULL,NULL,'Grupo com acesso ao menu Administrador','Grupo Administrador','\0',NULL,NULL,NULL);
/*!40000 ALTER TABLE `GrupoUsuarioSB` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Ips`
--

DROP TABLE IF EXISTS `Ips`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ips` (
  `id` int(11) NOT NULL,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `dns` varchar(255) DEFAULT NULL,
  `finalFaixa` varchar(15) NOT NULL,
  `inicialFaixa` varchar(15) NOT NULL,
  `tipo_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKg91qw90kdtcwkq94o48c8sfah` (`tipo_id`),
  KEY `FK332ut8y08mn06rtgbpyqei73p` (`usuarioAlteracao_id`),
  KEY `FK92k8tn1tlblje3ees74kebihi` (`usuarioInsercao_id`),
  CONSTRAINT `FK332ut8y08mn06rtgbpyqei73p` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FK92k8tn1tlblje3ees74kebihi` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKg91qw90kdtcwkq94o48c8sfah` FOREIGN KEY (`tipo_id`) REFERENCES `TipoIp` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Ips`
--

LOCK TABLES `Ips` WRITE;
/*!40000 ALTER TABLE `Ips` DISABLE KEYS */;
/*!40000 ALTER TABLE `Ips` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Localidade`
--

DROP TABLE IF EXISTS `Localidade`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Localidade` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ativo` bit(1) NOT NULL,
  `dataAlteracao` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Localidade`
--

LOCK TABLES `Localidade` WRITE;
/*!40000 ALTER TABLE `Localidade` DISABLE KEYS */;
/*!40000 ALTER TABLE `Localidade` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Localizacao`
--

DROP TABLE IF EXISTS `Localizacao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Localizacao` (
  `tipoLocalizacao` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `complemento` varchar(255) DEFAULT NULL,
  `latitude` bigint(20) NOT NULL,
  `longitude` bigint(20) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cep` varchar(255) DEFAULT NULL,
  `logradouro` varchar(255) DEFAULT NULL,
  `bairro_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1x27cqle98ktlx448eo2lticm` (`bairro_id`),
  CONSTRAINT `FK1x27cqle98ktlx448eo2lticm` FOREIGN KEY (`bairro_id`) REFERENCES `Bairro` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Localizacao`
--

LOCK TABLES `Localizacao` WRITE;
/*!40000 ALTER TABLE `Localizacao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Localizacao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ModuloAcaoSistema`
--

DROP TABLE IF EXISTS `ModuloAcaoSistema`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ModuloAcaoSistema` (
  `tipoModulo` varchar(31) NOT NULL,
  `id` int(11) NOT NULL,
  `dataHoraCriacao` date DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `iconeDaClasse` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `umModuloNativo` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ModuloAcaoSistema`
--

LOCK TABLES `ModuloAcaoSistema` WRITE;
/*!40000 ALTER TABLE `ModuloAcaoSistema` DISABLE KEYS */;
INSERT INTO `ModuloAcaoSistema` VALUES ('ModuloAcaoSistema',-1046263694,'2017-10-29','Ferramentas de administração do projeto','fa fa-suitcase','SB Admin Tools',''),('ModuloAcaoSistema',-477325983,'2017-10-29','Paginas Genericas do sistema, como Login, acesso negado, e outros','fa fa-cogs','Paginas do Sistema',''),('ModuloAcaoSistema',1189894204,'2017-10-29','Ferramentas de administração do projeto','fa fa-suitcase','SB Admin Tools',''),('ModuloAcaoSistema',1384659227,'2017-10-29','Paginas Genericas do sistema, como Login, acesso negado, e outros','fa fa-cogs','Paginas do Sistema',''),('ModuloAcaoSistema',1432875122,'2017-10-29','Paginas Genericas do sistema, como Login, acesso negado, e outros','fa fa-cogs','Paginas do Sistema','');
/*!40000 ALTER TABLE `ModuloAcaoSistema` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Negado_Grupos`
--

DROP TABLE IF EXISTS `Negado_Grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Negado_Grupos` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `grupo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKhd45weeoe1avo5qunwppgnfhm` (`acesso_id`),
  KEY `FK7m9qmg1btyx5cwglbveiugmbm` (`grupo_id`),
  CONSTRAINT `FK7m9qmg1btyx5cwglbveiugmbm` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`),
  CONSTRAINT `FKhd45weeoe1avo5qunwppgnfhm` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Negado_Grupos`
--

LOCK TABLES `Negado_Grupos` WRITE;
/*!40000 ALTER TABLE `Negado_Grupos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Negado_Grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Negado_Usuarios`
--

DROP TABLE IF EXISTS `Negado_Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Negado_Usuarios` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK39gufe3ixex80jpg9lshm4y1v` (`usuario_id`,`acesso_id`),
  KEY `FKgm8m18ifbnjd04dyl9drki4va` (`acesso_id`),
  CONSTRAINT `FK8wgk7y8p69ttbgf7if2k5n1pt` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKgm8m18ifbnjd04dyl9drki4va` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Negado_Usuarios`
--

LOCK TABLES `Negado_Usuarios` WRITE;
/*!40000 ALTER TABLE `Negado_Usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `Negado_Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PermissaoSB`
--

DROP TABLE IF EXISTS `PermissaoSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PermissaoSB` (
  `id` int(11) NOT NULL,
  `idAcaoGestao` int(11) NOT NULL,
  `nomeAcesso` varchar(255) DEFAULT NULL,
  `tipoAutenticacao` int(11) DEFAULT NULL,
  `acaoDoSistema_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKby0hrhpplmoepfebwlw0nrarh` (`acaoDoSistema_id`),
  CONSTRAINT `FKby0hrhpplmoepfebwlw0nrarh` FOREIGN KEY (`acaoDoSistema_id`) REFERENCES `AcaoDoSistema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PermissaoSB`
--

LOCK TABLES `PermissaoSB` WRITE;
/*!40000 ALTER TABLE `PermissaoSB` DISABLE KEYS */;
/*!40000 ALTER TABLE `PermissaoSB` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Permitido_Grupos`
--

DROP TABLE IF EXISTS `Permitido_Grupos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Permitido_Grupos` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `grupo_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKonpllqmu9mxhrobrxvvdvqgw3` (`acesso_id`),
  KEY `FKqy7db3uujsot9o8hi9tr16ifw` (`grupo_id`),
  CONSTRAINT `FKonpllqmu9mxhrobrxvvdvqgw3` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`),
  CONSTRAINT `FKqy7db3uujsot9o8hi9tr16ifw` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Permitido_Grupos`
--

LOCK TABLES `Permitido_Grupos` WRITE;
/*!40000 ALTER TABLE `Permitido_Grupos` DISABLE KEYS */;
/*!40000 ALTER TABLE `Permitido_Grupos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Permitido_Usuarios`
--

DROP TABLE IF EXISTS `Permitido_Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Permitido_Usuarios` (
  `id` int(11) NOT NULL,
  `acesso_id` int(11) DEFAULT NULL,
  `usuario_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK9j92iu9201tx0dm010v5fq4wo` (`usuario_id`,`acesso_id`),
  KEY `FKeb1qf23eyq6brt5o1sbbka3oq` (`acesso_id`),
  CONSTRAINT `FKeb1qf23eyq6brt5o1sbbka3oq` FOREIGN KEY (`acesso_id`) REFERENCES `PermissaoSB` (`id`),
  CONSTRAINT `FKkk1bvscvwf4sxlf15t8pk4e10` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Permitido_Usuarios`
--

LOCK TABLES `Permitido_Usuarios` WRITE;
/*!40000 ALTER TABLE `Permitido_Usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `Permitido_Usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Regiao`
--

DROP TABLE IF EXISTS `Regiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Regiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `alteradoEm` date DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `criadoEm` date DEFAULT NULL,
  `nomeRegiao` varchar(255) DEFAULT NULL,
  `quantidadeCidades` int(11) NOT NULL,
  `sigla` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Regiao`
--

LOCK TABLES `Regiao` WRITE;
/*!40000 ALTER TABLE `Regiao` DISABLE KEYS */;
/*!40000 ALTER TABLE `Regiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Regiao_Bairro`
--

DROP TABLE IF EXISTS `Regiao_Bairro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Regiao_Bairro` (
  `Regiao_id` int(11) NOT NULL,
  `bairros_id` int(11) NOT NULL,
  KEY `FKew8f3d6bl78s7v7htp3thaj1d` (`bairros_id`),
  KEY `FKewbhodadapv1i3pyarhm5vpsa` (`Regiao_id`),
  CONSTRAINT `FKew8f3d6bl78s7v7htp3thaj1d` FOREIGN KEY (`bairros_id`) REFERENCES `Bairro` (`id`),
  CONSTRAINT `FKewbhodadapv1i3pyarhm5vpsa` FOREIGN KEY (`Regiao_id`) REFERENCES `Regiao` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Regiao_Bairro`
--

LOCK TABLES `Regiao_Bairro` WRITE;
/*!40000 ALTER TABLE `Regiao_Bairro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Regiao_Bairro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoIp`
--

DROP TABLE IF EXISTS `TipoIp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoIp` (
  `id` int(11) NOT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoIp`
--

LOCK TABLES `TipoIp` WRITE;
/*!40000 ALTER TABLE `TipoIp` DISABLE KEYS */;
/*!40000 ALTER TABLE `TipoIp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UnidadeFederativa`
--

DROP TABLE IF EXISTS `UnidadeFederativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UnidadeFederativa` (
  `id` int(11) NOT NULL,
  `UF` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UnidadeFederativa`
--

LOCK TABLES `UnidadeFederativa` WRITE;
/*!40000 ALTER TABLE `UnidadeFederativa` DISABLE KEYS */;
/*!40000 ALTER TABLE `UnidadeFederativa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UsuarioSB`
--

DROP TABLE IF EXISTS `UsuarioSB`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UsuarioSB` (
  `tipoUsuario` varchar(31) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `apelido` varchar(255) DEFAULT NULL,
  `ativo` bit(1) NOT NULL,
  `complemento` varchar(255) DEFAULT NULL,
  `dataCadastro` date DEFAULT NULL,
  `dataHoraAlteracao` datetime DEFAULT NULL,
  `dataHoraInsersao` datetime DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(10) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL,
  `grupo_id` int(11) DEFAULT NULL,
  `localizacao_id` int(11) DEFAULT NULL,
  `usuarioAlteracao_id` int(11) DEFAULT NULL,
  `usuarioInsercao_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_d8hre5rs465kuoya4b9epuot7` (`apelido`),
  UNIQUE KEY `UK_m1rxw56li2lkr3guust77ltso` (`email`),
  KEY `FKpu9xpcabqjpw3jjdb6mu4w3a9` (`grupo_id`),
  KEY `FKddt81m657meu8v89qakv0792x` (`localizacao_id`),
  KEY `FKa0hk7be13ip4xg104xlxghvba` (`usuarioAlteracao_id`),
  KEY `FKg5805u50psplpao25esj3i4om` (`usuarioInsercao_id`),
  CONSTRAINT `FKa0hk7be13ip4xg104xlxghvba` FOREIGN KEY (`usuarioAlteracao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKddt81m657meu8v89qakv0792x` FOREIGN KEY (`localizacao_id`) REFERENCES `Localizacao` (`id`),
  CONSTRAINT `FKg5805u50psplpao25esj3i4om` FOREIGN KEY (`usuarioInsercao_id`) REFERENCES `UsuarioSB` (`id`),
  CONSTRAINT `FKpu9xpcabqjpw3jjdb6mu4w3a9` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UsuarioSB`
--

LOCK TABLES `UsuarioSB` WRITE;
/*!40000 ALTER TABLE `UsuarioSB` DISABLE KEYS */;
INSERT INTO `UsuarioSB` VALUES ('UsuarioSB',1,'teste','',NULL,'2017-10-29',NULL,NULL,'teste@teste.org','Usuário para testes','123',NULL,2,NULL,NULL,NULL);
/*!40000 ALTER TABLE `UsuarioSB` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (1),(1),(1),(1),(1);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modulos_grupo`
--

DROP TABLE IF EXISTS `modulos_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `modulos_grupo` (
  `grupo_id` int(11) NOT NULL,
  `modulo_id` int(11) NOT NULL,
  UNIQUE KEY `UKngph303pxo2b2mrtpfkoacmwq` (`grupo_id`,`modulo_id`),
  KEY `FK1616eg4vq1ubds5aof20ci82b` (`modulo_id`),
  CONSTRAINT `FK1616eg4vq1ubds5aof20ci82b` FOREIGN KEY (`modulo_id`) REFERENCES `ModuloAcaoSistema` (`id`),
  CONSTRAINT `FKf5g7yb014obr43smkvslw1hmu` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modulos_grupo`
--

LOCK TABLES `modulos_grupo` WRITE;
/*!40000 ALTER TABLE `modulos_grupo` DISABLE KEYS */;
/*!40000 ALTER TABLE `modulos_grupo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `regiao_cidades`
--

DROP TABLE IF EXISTS `regiao_cidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `regiao_cidades` (
  `regiao_id` int(11) NOT NULL,
  `cidade_id` int(11) NOT NULL,
  KEY `FKl4njys9fksqduv028a4j3mera` (`cidade_id`),
  KEY `FKgcjw6nyiocwydbhjayj1q0qe2` (`regiao_id`),
  CONSTRAINT `FKgcjw6nyiocwydbhjayj1q0qe2` FOREIGN KEY (`regiao_id`) REFERENCES `Regiao` (`id`),
  CONSTRAINT `FKl4njys9fksqduv028a4j3mera` FOREIGN KEY (`cidade_id`) REFERENCES `Cidade` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `regiao_cidades`
--

LOCK TABLES `regiao_cidades` WRITE;
/*!40000 ALTER TABLE `regiao_cidades` DISABLE KEYS */;
/*!40000 ALTER TABLE `regiao_cidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_grupo`
--

DROP TABLE IF EXISTS `usuario_grupo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario_grupo` (
  `grupo_id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  UNIQUE KEY `usuarioDuplicado` (`usuario_id`,`grupo_id`),
  KEY `FKeq1sxhjeq2ml8suqspdgh1esk` (`grupo_id`),
  CONSTRAINT `FKeq1sxhjeq2ml8suqspdgh1esk` FOREIGN KEY (`grupo_id`) REFERENCES `GrupoUsuarioSB` (`id`),
  CONSTRAINT `FKr399r2larmugqgxwl0rbtywfi` FOREIGN KEY (`usuario_id`) REFERENCES `UsuarioSB` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_grupo`
--

LOCK TABLES `usuario_grupo` WRITE;
/*!40000 ALTER TABLE `usuario_grupo` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_grupo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-29 15:14:49
