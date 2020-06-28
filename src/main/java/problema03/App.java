package problema03;

import java.util.ArrayList;

import problema03.Secuencia;

public class App {

	public static void main(String[] args) {
		
		Secuencia sec = new Secuencia();
		
		System.out.println("Solucion Kadane: ");
		
		sec.usarSolucion1();
		
		long startTime1 = System.nanoTime();
		
		ArrayList<Integer> solucion1 = sec.getSolucion().subsecuenciaMaxima(sec);
		
		
		long stopTime1 = System.nanoTime();
		long time1 = stopTime1 - startTime1;
		System.out.println("Resultado: "+ solucion1 +" --- Tiempo: "+time1);

//		System.out.println("Solucion Lineal: ");
//		
//		sec.usarSolucion2();
//		
//		long startTime2 = System.nanoTime();
//		int solucion2 = sec.getSolucion().valorFaltante(sec);
//		long stopTime2 = System.nanoTime();
//		long time2 = stopTime2 - startTime2;
//		
//		System.out.println("Resultado: "+ solucion2 +" --- Tiempo: "+time2);
	}
	

}
