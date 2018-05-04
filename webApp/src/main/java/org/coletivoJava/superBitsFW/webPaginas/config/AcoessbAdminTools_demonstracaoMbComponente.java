package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;

@Named
@ApplicationScoped
public class AcoessbAdminTools_demonstracaoMbComponente implements Serializable {

	public ItfAcaoFormulario getDemonstracao_mb_componente() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoDemonstracaoSB.DEMONSTRACAO_MB_COMPONENTE");
	}
}