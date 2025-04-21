package es.lardevpro.annotations;

import org.springframework.stereotype.Component;

@Component
public class InformeFinancieroTrim1 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		return "Presenatación del informe financiero de trimestre 1 (@Autowired)";
	}

}
