package es.lardevpro.annotations;
import org.springframework.stereotype.Component;

@Component //registro de la clase en spring
public class InformeFinancieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		
		return "informe del trimestre tres donde se han perdido la mitad de los activos";
	}

}
