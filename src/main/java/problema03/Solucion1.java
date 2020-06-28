package problema03;

import java.util.ArrayList;

public class Solucion1 implements Solucion{

	public ArrayList<Integer> subsecuenciaMaxima(Secuencia m) {
		
		int maximoHastaAhora = 0;
		int maxFinalizaAca = 0;
		int primerIndice = 0;
		int ultimoIndice = 0;
		
		ArrayList<Integer> subsec = new ArrayList<Integer>();
		
		ArrayList<Integer> datos = m.getSecuencia();
		
		
		
		for (int i = 0; i < datos.size(); i++) {
			
			maxFinalizaAca += datos.indexOf(i);
			
			
			if(maxFinalizaAca<0) {
				ultimoIndice = i;
				maximoHastaAhora = maxFinalizaAca;			
				}
			
			
			if(maximoHastaAhora<0) {
				maximoHastaAhora = 0;				
			}

		}
		while(maximoHastaAhora>0) {
			maximoHastaAhora-=datos.indexOf(ultimoIndice);
			subsec.add(datos.indexOf(ultimoIndice));
			ultimoIndice--;
		}
		
		
		System.out.println("INDICES: "+primerIndice+ultimoIndice);
		
		return subsec;
	}
}
