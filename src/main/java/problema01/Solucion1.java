package problema01;

public class Solucion1 implements Solucion{

	public Integer filaConMasUnos(Matriz m) {
		
		int datos[][] = m.getDatos();
		int filaMax = 0;
		
		int i = 0;
		int j = 0;
		
		while(i<datos.length && j<datos[i].length) {
			
			if(datos[i][j]==1) {
				j++;
				filaMax = i;
			}
			
			else if(datos[i][j] == 0) {
				i++;
				
			}
		
		}
	
		return filaMax;
	}
}
