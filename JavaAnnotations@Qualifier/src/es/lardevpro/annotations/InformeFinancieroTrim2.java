package es.lardevpro.annotations;
import org.springframework.stereotype.Component;

@Component//registro de la clase en spring
public class InformeFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "Informe del segundo trimestre donde se han ganado un 50% de activos en agronomía";
	}

}
