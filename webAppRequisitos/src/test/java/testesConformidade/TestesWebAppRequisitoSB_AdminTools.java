/*
 *  Desenvolvido pela equipe Super-Bits.com CNPJ 20.019.971/0001-90

 */
package testesConformidade;

import com.super_bits.config.webPaginas.ConfiguradorCoreRequisitosSB_AdminTools;
import com.super_bits.config.webPaginas.FabConfiguracoesDeAmbienteSB_AdminToolsRequisitos;
import com.super_bits.modulosSB.Persistencia.ConfigGeral.SBPersistencia;
import com.super_bits.modulosSB.Persistencia.ERROS.TesteJunitSBPersistencia;
import com.super_bits.modulosSB.SBCore.ConfigGeral.SBCore;
import com.super_bits.modulosSB.webPaginas.ConfigGeral.SBWebPaginas;
import com.super_bits.modulosSB.webPaginas.TratamentoDeErros.RelatorioTesteWebPaginas;

import org.junit.Test;

/**
 *
 * @author desenvolvedor
 */
public class TestesWebAppRequisitoSB_AdminTools extends TesteJunitSBPersistencia {

    @Override
    protected void configAmbienteDesevolvimento() {

        SBCore.configurar(new ConfiguradorCoreRequisitosSB_AdminTools(), SBCore.ESTADO_APP.DESENVOLVIMENTO);
        SBPersistencia.configuraJPA(FabConfiguracoesDeAmbienteSB_AdminToolsRequisitos.DESENVOLVIMENTO.getConfiguracaoPersistencia());
        SBWebPaginas.configurar(FabConfiguracoesDeAmbienteSB_AdminToolsRequisitos.DESENVOLVIMENTO.getConfiguracaoWebPaginas());
    }

}
