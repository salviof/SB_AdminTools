/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.Super_Bits.SB_AdminTools.model.BeanExemplo;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.FabAcaoAdminDeveloper;
import com.super_bits.Super_Bits.SB_AdminTools.regras_de_negocio_e_controller.admin_developer.InfoAcaoAdminDeveloper;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.TIPO_PARTE_URL;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.basico.ItfBeanSimples;
import com.super_bits.modulosSB.SBCore.modulos.view.ServicoVisualizacaoAbstrato;
import com.super_bits.modulosSB.SBCore.modulos.view.componenteObjeto.ContainerVisualizacaoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.view.componenteObjeto.ContainersVisualizacaoDoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.view.componenteObjeto.NovoContainerVisualizacaoObjeto;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.MB_paginaCadastroEntidades;
import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.formularios.reflexao.anotacoes.InfoPagina;

import com.super_bits.modulosSB.webPaginas.JSFManagedBeans.siteMap.MapaDeFormularios;
import com.super_bits.modulosSB.webPaginas.controller.servletes.urls.parametrosURL.InfoParametroURL;
import com.super_bits.modulosSB.webPaginas.controller.servletes.urls.parametrosURL.ParametroURL;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 *
 * @author SalvioF
 */
@InfoAcaoAdminDeveloper(acao = FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_MB)
@InfoPagina(nomeCurto = "OBJCont", tags = {"Containers De Objetos"})
@Named
@ViewScoped
public class PgAdminContainerObjeto extends MB_paginaCadastroEntidades<EstruturaDeEntidade> {

    private String pesquisa;
    private ItfBeanSimples itemDoContainer;
    private ContainersVisualizacaoDoObjeto containersExistentes;
    private List<BeanInfoContainerVisualizacao> containersComUrl;
    private ContainerVisualizacaoObjeto containerSelecionado;

    private List<Integer> colunasDisponiveisCriacao;
    private List<String> visualizacoesExistentes;

    private NovoContainerVisualizacaoObjeto novoContainer;

    @InfoParametroURL(nome = "nomeVisualizacao", tipoParametro = TIPO_PARTE_URL.TEXTO, valorPadrao = ServicoVisualizacaoAbstrato.TIPO_VISUALIZACAO_PADRAO, obrigatorio = false)
    private ParametroURL parametroNomeVisualizacao;

    @InfoParametroURL(nome = "Quantidade de Colunas ocupadas pelo container", tipoParametro = TIPO_PARTE_URL.TEXTO, valorPadrao = "3", obrigatorio = false)
    private ParametroURL parametroQtdColuna;

    @InfoParametroURL(nome = "Mostrar mobile", tipoParametro = TIPO_PARTE_URL.TEXTO, valorPadrao = "nao")
    private ParametroURL parametroMostrarMobile;

    @InfoParametroURL(nome = "Estrutura de Entidade", tipoParametro = TIPO_PARTE_URL.TEXTO, obrigatorio = false)
    private ParametroURL parametroNomeEntidade;

    private final BeanExemplo conteudoExemplo = new BeanExemplo();

    @Override
    public EstruturaDeEntidade getEntidadeSelecionada() {
        return super.getEntidadeSelecionada(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setEntidadeSelecionada(EstruturaDeEntidade entidadeSelecionada) {

        super.setEntidadeSelecionada(entidadeSelecionada); //To change body of generated methods, choose Tools | Templates.
        if (entidadeSelecionada == null) {
            return;
        }
        try {

            containersExistentes = new ContainersVisualizacaoDoObjeto(MapaObjetosProjetoAtual.getClasseDoObjetoByNome(entidadeSelecionada.getNomeEntidade()), ServicoVisualizacaoAbstrato.TIPO_VISUALIZACAO_ITEM.LABORATORIO);
            visualizacoesExistentes = containersExistentes.getListaVisualizacoesPossiveis();
            containersComUrl = new ArrayList();
            for (ContainerVisualizacaoObjeto c : containersExistentes.getContainersEncontrados()) {
                String urldesktopUnico = MapaDeFormularios.getUrlFormulario(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_DESKTOP.getRegistro(),
                        c.getNomeTipoVisualizacao(), String.valueOf(c.getColunas()), "nao", c.getNomeEntidade());
                String urlMobileUnico = null;
                if (c.isTemVersaoMobile()) {
                    urlMobileUnico = MapaDeFormularios.getUrlFormulario(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITEM_MOBILE.getRegistro(),
                            c.getNomeTipoVisualizacao(), String.valueOf(c.getColunas()), "nao", c.getNomeEntidade());
                }
                String urldesktopGrupo = MapaDeFormularios.getUrlFormulario(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_DESKTOP.getRegistro(), c.getNomeTipoVisualizacao(),
                        String.valueOf(c.getColunas()), "nao", c.getNomeEntidade());
                String urlMobileGrupo = null;
                if (c.isTemVersaoMobile()) {
                    urlMobileGrupo = MapaDeFormularios.getUrlFormulario(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_VISUALIZACAO_ITENS_MOBILE.getRegistro(), c.getNomeTipoVisualizacao(), String.valueOf(c.getColunas()), c.getNomeEntidade());
                }
                containersComUrl.add(new BeanInfoContainerVisualizacao(c,
                        urldesktopUnico,
                        urlMobileUnico,
                        urldesktopGrupo,
                        urlMobileGrupo
                ));
            }

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro obtendo containers do objeto", t);
        }

    }

    private void selecionarContainerViaParametros() {

        if (parametroQtdColuna != null) {
            if (getParametroInstanciado(parametroQtdColuna).isValorDoParametroFoiConfigurado()
                    && getParametroInstanciado(parametroNomeVisualizacao).isValorDoParametroFoiConfigurado()
                    && getParametroInstanciado(parametroNomeEntidade).isValorDoParametroFoiConfigurado()
                    && getParametroInstanciado(parametroQtdColuna).isValorDoParametroFoiConfigurado()
                    && getParametroInstanciado(parametroMostrarMobile).isParametroObrigatorio()) {
                boolean versaoMobile = false;
                if (getParametroInstanciado(parametroMostrarMobile).getValor().toString().toUpperCase().equals("SIM")) {
                    versaoMobile = true;
                }
                containersExistentes = new ContainersVisualizacaoDoObjeto(MapaObjetosProjetoAtual.getClasseDoObjetoByNome(getParametroInstanciado(parametroNomeEntidade).getValor().toString()), ServicoVisualizacaoAbstrato.TIPO_VISUALIZACAO_ITEM.LABORATORIO);
                containerSelecionado = containersExistentes.getContainerAdequado(getParametroInstanciado(parametroNomeVisualizacao).getValor().toString(), Integer.valueOf(getParametroInstanciado(parametroQtdColuna).getValor().toString()), versaoMobile);

            }
        }

    }

    @PostConstruct
    public void inicio() {
        listarDados();
        colunasDisponiveisCriacao = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            colunasDisponiveisCriacao.add(i);
        }
        selecionarContainerViaParametros();

    }

    @Override
    public void listarDados(boolean mostrarInativos) {

        setEntidadesListadas(MapaObjetosProjetoAtual.getListaTodosEstruturaObjeto());
    }

    @Override
    public void executarAcao(EstruturaDeEntidade pEntidadeSelecionada) {
        super.executarAcao(pEntidadeSelecionada); //To change body of generated methods, choose Tools | Templates.

        if (isAcaoSelecionadaIgualA(FabAcaoAdminDeveloper.FERRAMENTAS_OBJETO_CONTAINER_FRM_NOVAVISUALIZACAO)) {
            novoContainer = new NovoContainerVisualizacaoObjeto(MapaObjetosProjetoAtual.getClasseDoObjetoByNome(getEntidadeSelecionada().getNomeEntidade()));
        }
    }

    public boolean isContainersCarregados() {
        return containersExistentes != null;
    }

    public List<String> getVisualizacoesExistentes() {
        return visualizacoesExistentes;
    }

    public void gerarNovaVisualizacao() {
        String caminhoArquivoXHTML = novoContainer.getEntrLocalArquivoDesktop();
        String caminhoMobile = novoContainer.getEntrLocalArquivoMobile();
        novoContainer.criarVisualizacaoContextoAtual(caminhoMobile != null);

    }

    public void publicarVisualizacaoLaboratorio() {

    }

    public void publicarVisualizacaoLaboratorioMobile() {

    }

    public ItfBeanSimples getItemDoContainer() {
        return itemDoContainer;
    }

    public ContainersVisualizacaoDoObjeto getContainersExistentes() {
        return containersExistentes;
    }

    public List<BeanInfoContainerVisualizacao> getContainersComUrl() {
        return containersComUrl;
    }

    public ContainerVisualizacaoObjeto getContainerSelecionado() {
        return containerSelecionado;
    }

    public List<Integer> getColunasDisponiveisCriacao() {
        return colunasDisponiveisCriacao;
    }

    public NovoContainerVisualizacaoObjeto getNovoContainer() {
        return novoContainer;
    }

    public BeanExemplo getConteudoExemplo() {
        return conteudoExemplo;
    }

}
