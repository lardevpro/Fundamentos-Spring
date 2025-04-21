package es.lardevpro.annotations;

public class InformeFinancieroCompras implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "El informe de financiación del departamento";
	}

}
