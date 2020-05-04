package ejemplo01;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaPromedio1 implements ListaPromedio{

	@Override
	public List<Double> calcular(Registro r) {
		List<Integer> lista = r.getValores();
		Instant t1 = Instant.now();
		long iteraciones =0;
		List<Double> resultado = new ArrayList<Double>();
		for(int i=0;i<lista.size();i++) {
			iteraciones++;
			Double total = 0.0;
			// calculo la suma de todos los anterioes
			for(int j=0;j<=i;j++) {
				iteraciones++;
				total += lista.get(j);
			}
			// agrego el promedio en i-esima
			resultado.add(i, total/Double.valueOf(i+1));
		}
		Instant t2 = Instant.now();
		Duration d = Duration.between(t1, t2);
		r.addCorrida(new Informacion(LocalDateTime.now(),lista.size(),d.toMillis(),iteraciones));
		return resultado;
	}

}
