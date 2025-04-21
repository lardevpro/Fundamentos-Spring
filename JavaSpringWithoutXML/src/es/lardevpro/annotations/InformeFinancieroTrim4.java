package es.lardevpro.annotations;

import org.springframework.stereotype.Component;

@Component//registro de la clase en spring
public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Presentación de informe de cierre de año";
	}

}
