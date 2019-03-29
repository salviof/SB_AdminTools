/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.super_bits.Super_Bits.SB_AdminTools.model;

import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaCampo;
import com.super_bits.modulosSB.SBCore.modulos.geradorCodigo.model.EstruturaDeEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampo;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoCampoModeloDocumento;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.InfoObjetoSB;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.anotacoes.ValorAceito;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoExibicaoFormulario;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.CaminhoCampoReflexao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.FabTipoAtributoObjeto;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.campo.GrupoCampos;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.ItemBairro;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.ItemCidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.ItemLocalizacao;
import com.super_bits.modulosSB.SBCore.modulos.objetos.InfoCampos.cep.ItemUnidadeFederativa;
import com.super_bits.modulosSB.SBCore.modulos.objetos.MapaObjetosProjetoAtual;
import com.super_bits.modulosSB.SBCore.modulos.objetos.estrutura.ItfEstruturaCampoEntidade;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.Interfaces.icones.FabIconeFontAwesome;
import com.super_bits.modulosSB.SBCore.modulos.objetos.registro.ItemContatoCorporativo;
import java.util.Date;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.coletivojava.fw.api.objetoNativo.view.icone.IconeSistema;
import org.coletivojava.fw.api.tratamentoErros.FabErro;

/**
 * ATENÇÃO A DOCUMENTAÇÃO DA CLASSE É OBRIGATÓRIA O JAVADOC DOS METODOS PUBLICOS
 * SÃO OBRIGATÓRIOS E QUANDO EXISTIR UMA INTERFACE DOCUMENTADA UMA REFERENCIA
 * DEVE SER CRIADA, A SINTAXE DE REFERENCIA É: @see_ NomeDAClasse#Metodo
 * DOCUMENTE DE FORMA OBJETIVA E EFICIENTE, NÃO ESQUEÇA QUE VOCÊ FAZ PARTE DE
 * UMA EQUIPE.
 *
 * @author <a href="mailto:salviof@gmail.com">Salvio Furbino</a>
 * @since 30/12/2015
 * @version 1.0
 *
 */
@InfoObjetoSB(tags = {"Objeto Exemplo"}, plural = "Beans de Exmplo", icone = "fa fa-tag")
public class BeanExemplo
        extends ItemContatoCorporativo {

    public BeanExemplo() {
        this(true);
        grupoCampoCompleto = new GrupoCampos("Grupo de Campos teste");

        EstruturaDeEntidade est = MapaObjetosProjetoAtual.getEstruturaObjeto(BeanExemplo.class);
        for (ItfEstruturaCampoEntidade strutura : est.getCampos()) {
            try {
                grupoCampoCompleto.adicionarCampo(new CaminhoCampoExibicaoFormulario(new CaminhoCampoReflexao(strutura.getNomeDeclarado(), BeanExemplo.class), grupoCampoCompleto.getNomeIdentificadorSlug()));
            } catch (Throwable t) {
                SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro adicionando campo extra em ambiente teste", t);
            }
        }
        grupoCampoSimples = new GrupoCampos("Grupo campo Simples");
        try {
            grupoCampoSimples.adicionarCampo(new CaminhoCampoExibicaoFormulario(new CaminhoCampoReflexao(BeanExemplo.class.getDeclaredField("nome")), grupoCampoCompleto.getNomeIdentificadorSlug()));
            grupoCampoSimples.adicionarCampo(new CaminhoCampoExibicaoFormulario(new CaminhoCampoReflexao(BeanExemplo.class.getDeclaredField("celular")), grupoCampoCompleto.getNomeIdentificadorSlug()));
            grupoCampoSimples.adicionarCampo(new CaminhoCampoExibicaoFormulario(new CaminhoCampoReflexao(BeanExemplo.class.getDeclaredField("beanSelecionadoDaListaFabrica")), grupoCampoCompleto.getNomeIdentificadorSlug()));

        } catch (Throwable t) {
            SBCore.RelatarErro(FabErro.SOLICITAR_REPARO, "Erro criando " + BeanExemplo.class.getSimpleName(), t);
        }

    }

    /**
     *
     * @param pCriarLista
     */
    public BeanExemplo(boolean pCriarLista) {
        super();

        if (!pCriarLista) {

        } else {
            BeanExemplo exemplo1 = new BeanExemplo(false);
            exemplo1.setNome("Bean Lista 1");
            exemplo1.setId(1);
            exemplo1.setEmail("teste@teste.com");

            BeanExemplo exemplo2 = new BeanExemplo(false);
            exemplo2.setNome("Bean Lista 2");
            exemplo2.setId(2);
            exemplo2.setEmail("teste2@teste.com");

            beanFilho = new BeanExemplo(false);
            beanFilho.setApelido("Apelido bean Filho");

            setLocalizacao(new ItemLocalizacao());
            getLocalizacao().prepararNovoObjeto();

            apelido = "testeeeeeeee";

        }

    }

    @InfoCampo(tipo = FabTipoAtributoObjeto.ID, label = "ID")
    @NotNull
    private int id;

    @InfoCampo(tipo = FabTipoAtributoObjeto.EMAIL, label = "Email")
    @NotNull
    private String email = "emailteste@teste.com";

    @InfoCampo(fabricaDeOpcoes = FabIconeFontAwesome.class, tipo = FabTipoAtributoObjeto.OBJETO_DE_UMA_LISTA)
    private IconeSistema seletorOpcao;

    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_DESCRITIVO, label = "Descritivo memo")
    private String descritivo;

    @InfoCampo(tipo = FabTipoAtributoObjeto.TELEFONE_FIXO_NACIONAL, label = "Telefone")
    @NotNull
    private String telefone = "313017-7334";

    @InfoCampo(tipo = FabTipoAtributoObjeto.DATA, descricao = "Colé")
    private Date data;

    @InfoCampo(tipo = FabTipoAtributoObjeto.TELEFONE_CELULAR, label = "Celular")
    @NotNull
    private String celular;

    @InfoCampo(tipo = FabTipoAtributoObjeto.TELEFONE_FIXO_INTERNACIONAL, label = "Tel Internacional")
    @NotNull
    private String telInternacional;

    @InfoCampo(tipo = FabTipoAtributoObjeto.CPF, label = "CPF")
    @NotNull
    private String cpf;

    @InfoCampo(tipo = FabTipoAtributoObjeto.CNPJ, label = "CNPJ")
    @NotNull
    private String cnpj;

    @InfoCampo(tipo = FabTipoAtributoObjeto.INSCRICAO_ESTADUAL, label = "Teste")
    @NotNull
    private String cpTeste;

    @InfoCampo(tipo = FabTipoAtributoObjeto.INSCRICAO_ESTADUAL, label = "Inscestadual")
    @NotNull
    private String inscricaoEstadual;

    @InfoCampo(tipo = FabTipoAtributoObjeto.INSCRIACAO_MUNICIPAL, label = "Insc. Municipal")
    @NotNull
    private String inscricaoMunicipal;

    @InfoCampo(tipo = FabTipoAtributoObjeto.COR, label = "Cor")
    @NotNull
    private String cor;

    @InfoCampo(Mask = "", label = "Mascara Esp.")
    @NotNull
    private String mascaraEspecial;

    @InfoCampo(tipo = FabTipoAtributoObjeto.HTML, label = "Html")
    @NotNull
    private String html;

    @InfoCampo(tipo = FabTipoAtributoObjeto.SITE, obrigatorio = true, label = "Site")
    @NotNull
    private String site;

    @InfoCampo(tipo = FabTipoAtributoObjeto.URL, label = "Url")
    private String url;

    @InfoCampo(tipo = FabTipoAtributoObjeto.SENHA, label = "Senha")
    @NotNull
    private String senha;

    @NotNull
    @InfoCampo(tipo = FabTipoAtributoObjeto.QUANTIDADE, label = "Quantidade")
    private int quantidade;

    @NotNull
    @InfoCampo(tipo = FabTipoAtributoObjeto.PERCENTUAL, label = "Percentual")
    private int porcentagem;

    @NotNull
    @InfoCampo(tipo = FabTipoAtributoObjeto.MOEDA_REAL, label = "Dinheiro")
    private Double dinheiro;

    @NotNull
    @InfoCampo(tipo = FabTipoAtributoObjeto.REG_DATAALTERACAO, label = "Data Alteração")
    private Date dataAlteracao;

    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME, label = "Apelido")
    private String apelido = "Bean Simples";

    @InfoCampo(tipo = FabTipoAtributoObjeto.HTML_TEMPLATE)
    @InfoCampoModeloDocumento(classeModeloVinculado = BeanExemplo.class)
    private String templateHtml = "Conteúdo padrao Teste";

    @NotNull
    @InfoCampo(tipo = FabTipoAtributoObjeto.AAA_NOME_LONGO, label = "Nome")
    private String nome = "Nome Completo do Bean Simples";

    @InfoCampo(tipo = FabTipoAtributoObjeto.LC_LOGRADOURO, label = "Logradouro", obrigatorio = true)
    private String logradouro;

    @InfoCampo(tipo = FabTipoAtributoObjeto.LC_COMPLEMENTO, label = "Complemento", obrigatorio = true)
    @NotNull
    private String complemento;

    @InfoCampo(tipo = FabTipoAtributoObjeto.LCCEP, obrigatorio = true, label = "CEP")
    @NotNull
    private String cep;

    @InfoCampo(tipo = FabTipoAtributoObjeto.DATAHORA, label = "Data Hora", descricao = "Campo para formato data hora xx/xx/xx 00:00:00")
    @NotNull
    private Date dataHora;

    @InfoCampo(tipo = FabTipoAtributoObjeto.ARQUIVO_DE_ENTIDADE, label = "Arquivo")
    @NotNull
    private String arquivo;

    @InfoCampo(tipo = FabTipoAtributoObjeto.ARQUIVO_DE_ENTIDADE, label = "Arquivo de Categoria")
    @NotNull
    private String arquivoDeCategoria;

    @InfoCampo(tipo = FabTipoAtributoObjeto.LC_LOCALIZACAO, label = "Localização")
    @NotNull
    private ItemLocalizacao localizacao;
    @NotNull
    private BeanExemplo beanFilho;

    @InfoCampo(tipo = FabTipoAtributoObjeto.LC_BAIRRO)
    private ItemBairro bairro;

    @InfoCampo(tipo = FabTipoAtributoObjeto.OBJETO_DE_UMA_LISTA, valoresAceitos = {
        @ValorAceito(valor = "Teste")
        ,   @ValorAceito(valor = "Teste2")})
    private BeanExemplo beanSelecionadoDaListaDescritiva;

    @InfoCampo(tipo = FabTipoAtributoObjeto.OBJETO_DE_UMA_LISTA, fabricaDeOpcoes = FabIconeFontAwesome.class)
    private IconeSistema beanSelecionadoDaListaFabrica;

    @InfoCampo(tipo = FabTipoAtributoObjeto.OBJETO_DE_UMA_LISTA, caminhoParaLista = "filiaisFornecedor")
    private BeanExemplo benSelecionadoListaPorCampo;

    @InfoCampo(tipo = FabTipoAtributoObjeto.LC_UNIDADE_FEDERATIVA)
    private ItemUnidadeFederativa unidadeFederativa;

    @InfoCampo(tipo = FabTipoAtributoObjeto.LC_CIDADE)
    private ItemCidade cidade;

    @InfoCampo(tipo = FabTipoAtributoObjeto.VERDADEIRO_FALSO)
    private boolean verdadeiroOuFalso;
    @InfoCampo(tipo = FabTipoAtributoObjeto.GRUPO_CAMPO)
    private GrupoCampos grupoCampoCompleto;
    @InfoCampo(tipo = FabTipoAtributoObjeto.GRUPO_CAMPO)
    private GrupoCampos grupoCampoSimples;
    @InfoCampo(tipo = FabTipoAtributoObjeto.FORMULARIO_DE_ACAO)
    private ItfAcaoFormulario acaoGrupoTeste;
    @InfoCampo(label = "Campo Vinculado 1", tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String campoVinculado1;

    @InfoCampo()
    @Enumerated(EnumType.STRING)
    private FabTipoAtributoObjeto objetoFabrica = FabTipoAtributoObjeto.CPF;

    @InfoCampo(label = "Campo Vinculado 2", tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String campoVinculado2;

    @InfoCampo(label = "Campo Vinculado 3", tipo = FabTipoAtributoObjeto.TEXTO_SIMPLES)
    private String campoVinculado3;

    @Transient
    private int qtdCampoVinculado1gets;
    @Transient
    private int qtdCampoVinculado1sets;

    @Transient
    private int qtdCampoVinculado2gets;
    @Transient
    private int qtdCampoVinculado2sets;

    @Transient
    private int qtdCampoVinculado3gets;
    @Transient
    private int qtdCampoVinculado3sets;

    @Override
    public int getId() {
        return id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelInternacional() {
        return telInternacional;
    }

    public void setTelInternacional(String telInternacional) {
        this.telInternacional = telInternacional;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return cpTeste;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.cpTeste = inscricaoEstadual;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMascaraEspecial() {
        return mascaraEspecial;
    }

    public void setMascaraEspecial(String mascaraEspecial) {
        this.mascaraEspecial = mascaraEspecial;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(int porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(Double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }

    @Override
    public ItemLocalizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(ItemLocalizacao localizacao) {
        this.localizacao = localizacao;
    }

    public BeanExemplo getBeanFilho() {
        return beanFilho;
    }

    public BeanExemplo getBeanSelecionadoDaListaDescritiva() {
        return beanSelecionadoDaListaDescritiva;
    }

    public void setBeanSelecionadoDaListaDescritiva(BeanExemplo beanSelecionadoDaListaDescritiva) {
        this.beanSelecionadoDaListaDescritiva = beanSelecionadoDaListaDescritiva;
    }

    public IconeSistema getBeanSelecionadoDaListaFabrica() {
        return beanSelecionadoDaListaFabrica;
    }

    public void setBeanSelecionadoDaListaFabrica(IconeSistema beanSelecionadoDaListaFabrica) {
        this.beanSelecionadoDaListaFabrica = beanSelecionadoDaListaFabrica;
    }

    public BeanExemplo getBenSelecionadoListaPorCampo() {
        return benSelecionadoListaPorCampo;
    }

    public void setBenSelecionadoListaPorCampo(BeanExemplo benSelecionadoListaPorCampo) {
        this.benSelecionadoListaPorCampo = benSelecionadoListaPorCampo;
    }

    public void setBeanFilho(BeanExemplo beanFilho) {
        this.beanFilho = beanFilho;
    }

    public IconeSistema getSeletorOpcao() {
        return seletorOpcao;
    }

    public void setSeletorOpcao(IconeSistema seletorOpcao) {
        this.seletorOpcao = seletorOpcao;
    }

    public String getCpTeste() {
        return cpTeste;
    }

    public void setCpTeste(String cpTeste) {
        this.cpTeste = cpTeste;
    }

    public String getArquivoDeCategoria() {
        return arquivoDeCategoria;
    }

    public void setArquivoDeCategoria(String arquivoDeCategoria) {
        this.arquivoDeCategoria = arquivoDeCategoria;
    }

    public ItemBairro getBairro() {
        return bairro;
    }

    public void setBairro(ItemBairro bairro) {
        this.bairro = bairro;
    }

    public boolean isVerdadeiroOuFalso() {
        return verdadeiroOuFalso;
    }

    public void setVerdadeiroOuFalso(boolean verdadeiroOuFalso) {
        this.verdadeiroOuFalso = verdadeiroOuFalso;
    }

    public GrupoCampos getGrupoCampoCompleto() {
        return grupoCampoCompleto;
    }

    public void setGrupoCampoCompleto(GrupoCampos grupoCampoCompleto) {
        this.grupoCampoCompleto = grupoCampoCompleto;
    }

    @Override
    public String getDescritivo() {
        return descritivo;
    }

    @Override
    public void setDescritivo(String descritivo) {
        this.descritivo = descritivo;
    }

    public ItemUnidadeFederativa getUnidadeFederativa() {
        return unidadeFederativa;
    }

    public void setUnidadeFederativa(ItemUnidadeFederativa unidadeFederativa) {
        this.unidadeFederativa = unidadeFederativa;
    }

    public ItemCidade getCidade() {
        return cidade;
    }

    public void setCidade(ItemCidade cidade) {
        this.cidade = cidade;
    }

    public GrupoCampos getGrupoCampoSimples() {
        return grupoCampoSimples;
    }

    public void setGrupoCampoSimples(GrupoCampos grupoCampoSimples) {
        this.grupoCampoSimples = grupoCampoSimples;
    }

    public ItfAcaoFormulario getAcaoGrupoTeste() {
        return acaoGrupoTeste;
    }

    public void setAcaoGrupoTeste(ItfAcaoFormulario acaoGrupoTeste) {
        this.acaoGrupoTeste = acaoGrupoTeste;
    }

    public FabTipoAtributoObjeto getObjetoFabrica() {
        return objetoFabrica;
    }

    public void setObjetoFabrica(FabTipoAtributoObjeto objetoFabrica) {
        this.objetoFabrica = objetoFabrica;
    }

    public String getCampoVinculado1() {
        qtdCampoVinculado1gets++;
        return campoVinculado1 + getRelatCampoVinculado1();
    }

    public void setCampoVinculado1(String campoVinculado1) {
        qtdCampoVinculado1sets++;
        this.campoVinculado1 = campoVinculado1;
    }

    public String getCampoVinculado2() {
        qtdCampoVinculado2gets++;
        return campoVinculado2 + getRelatCampoVinculado2();
    }

    public void setCampoVinculado2(String campoVinculado2) {
        qtdCampoVinculado2sets++;
        this.campoVinculado2 = campoVinculado2;
    }

    public String getCampoVinculado3() {
        qtdCampoVinculado3gets++;
        return campoVinculado3 + getRelatCampoVinculado3();
    }

    public void setCampoVinculado3(String pCampoVinculado3) {
        qtdCampoVinculado3sets++;
        this.campoVinculado3 = pCampoVinculado3;
    }

    public final String getRelatCampoVinculado1() {
        return "[" + qtdCampoVinculado1gets + " gets, e " + qtdCampoVinculado1sets + " sets foram realizados" + "]";
    }

    public final String getRelatCampoVinculado2() {
        return "[" + qtdCampoVinculado2gets + " gets, e " + qtdCampoVinculado2sets + " sets foram realizados" + "]";
    }

    public final String getRelatCampoVinculado3() {
        return "[" + qtdCampoVinculado3gets + " gets, e " + qtdCampoVinculado3sets + " sets foram realizados" + "]";
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTemplateHtml() {
        return templateHtml;
    }

    public void setTemplateHtml(String templateHtml) {
        this.templateHtml = templateHtml;
    }

}
