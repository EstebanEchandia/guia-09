package problema02;

import java.util.ArrayList;

public class Solucion1 implements Solucion{

	public Integer valorFaltante(Secuencia m) {
		
		ArrayList<Integer> sec = m.getSecuencia();
	
		for(int i = 0; i<sec.size(); i++) {
			if(!sec.contains(i)) return i;
		}
		
		return 0;
	}
}
