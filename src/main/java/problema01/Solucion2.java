package problema01;

public class Solucion2 implements Solucion{

	public Integer filaConMasUnos(Matriz m) {
		
		int datos[][] = m.getDatos();
		
		int filaMax = 0;
		int maxUnos = 0;
		for(int i = 0; i<datos.length; i++) {
			
			
			if(cantidadUnos(datos[i]) > maxUnos){
				filaMax = i;	
				maxUnos = cantidadUnos(datos[i]);
			}
		}
		
		return filaMax;
	}
	
	
	public int cantidadUnos(int[] fila) {
		int cantUnos = 0;
		for(int i = 0; i<fila.length; i++) {
			if(fila[i] == 1) cantUnos++;
			
		}
		
		
		return cantUnos;
	}
}
