package org.coletivoJava.superBitsFW.webPaginas.config;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import com.super_bits.modulosSB.SBCore.UtilGeral.MapaAcoesSistema;
import com.super_bits.modulosSB.SBCore.modulos.Controller.Interfaces.permissoes.ItfAcaoFormulario;

@Named
@ApplicationScoped
public class AcoessbAdminTools_logs implements Serializable {

	public ItfAcaoFormulario getFerramentas_logs_mb() {
		return (ItfAcaoFormulario) MapaAcoesSistema
				.getAcaoDoSistemaByNomeUnico("FabAcaoAdminDeveloper.FERRAMENTAS_LOGS_MB");
	}
}