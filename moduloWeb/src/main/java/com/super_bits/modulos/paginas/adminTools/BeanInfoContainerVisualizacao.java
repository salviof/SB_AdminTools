/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.modulos.paginas.adminTools;

import com.super_bits.modulosSB.SBCore.modulos.view.componenteObjeto.ContainerVisualizacaoObjeto;

/**
 *
 * @author SalvioF
 */
public class BeanInfoContainerVisualizacao {

    private final ContainerVisualizacaoObjeto containerVisualizacao;
    private final String urlVisualizacaoDeskTopUnico;
    private final String urlVisualizacaoDeskTopGrupo;
    private final String urlVisualizacaoMobileGrupo;
    private final String urlVisualizacaoMobileUnico;

    public BeanInfoContainerVisualizacao(ContainerVisualizacaoObjeto pContainer, String pUrlVisualizacaoUnicoDesk, String pVisualizacaoUnicoMobile,
            String pVisualizacaiGrupoDesk, String pVisualizacaoGrupoMobile) {
        this.containerVisualizacao = pContainer;
        urlVisualizacaoDeskTopUnico = pUrlVisualizacaoUnicoDesk;
        urlVisualizacaoDeskTopGrupo = pVisualizacaiGrupoDesk;
        urlVisualizacaoMobileGrupo = pVisualizacaoGrupoMobile;
        urlVisualizacaoMobileUnico = pVisualizacaoUnicoMobile;
    }

    public ContainerVisualizacaoObjeto getContainerVisualizacao() {
        return containerVisualizacao;
    }

    public String getUrlVisualizacaoDeskTopUnico() {
        return urlVisualizacaoDeskTopUnico;
    }

    public String getUrlVisualizacaoDeskTopGrupo() {
        return urlVisualizacaoDeskTopGrupo;
    }

    public String getUrlVisualizacaoMobileGrupo() {
        return urlVisualizacaoMobileGrupo;
    }

    public String getUrlVisualizacaoMobileUnico() {
        return urlVisualizacaoMobileUnico;
    }

}
