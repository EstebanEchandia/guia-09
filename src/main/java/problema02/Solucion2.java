package problema02;

import java.util.ArrayList;

public class Solucion2 implements Solucion{

	public Integer valorFaltante(Secuencia m) {
		
		ArrayList<Integer> sec = m.getSecuencia();
		
		int sumaValor = 0;
		int sumaIndice = 0;
		
		for(int i = 0; i<sec.size(); i++) {
			
			sumaValor += sec.indexOf(i);
			sumaIndice += i;
			
		}
		
		
		return sumaIndice-sumaValor;
	}
}
