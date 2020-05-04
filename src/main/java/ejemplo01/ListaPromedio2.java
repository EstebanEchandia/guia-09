package ejemplo01;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ListaPromedio2 implements ListaPromedio{

	@Override
	public List<Double> calcular(Registro r) {
		List<Integer> lista = r.getValores();
		Instant t1 = Instant.now();
		long iteraciones =0;
		List<Double> resultado = new ArrayList<Double>();
		Double total = 0.0;
		// [ 3 , 4 ,2 , 8]
		// 3
		// 3/1=3
		// 4+3 total = 7
		// 7/2=3.5
		
		for(int i=0;i<lista.size();i++) {
			iteraciones++;
			total += lista.get(i);
			resultado.add(i, total/Double.valueOf(i));
		}
		Instant t2 = Instant.now();
		Duration d = Duration.between(t1, t2);
		r.addCorrida(new Informacion(LocalDateTime.now(),lista.size(),d.toMillis(),iteraciones));
		return resultado;

	}

}
