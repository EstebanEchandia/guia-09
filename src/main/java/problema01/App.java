package problema01;

public class App {

	public static void main(String[] args) {
		
		
		
		Matriz matrix = new Matriz();
	
		System.out.println("Solucion 2 complejidad O(n^2)");
		
		matrix.usarSolucion2();
		
		long startTime2 = System.nanoTime();
		int sol2 = matrix.solucion.filaConMasUnos(matrix);
		long stopTime2 = System.nanoTime();
		long time2 = stopTime2 - startTime2;
		
		System.out.println(sol2);
		System.out.println("Tiempo de ejecucion: "+time2);
		
		matrix.imprimirMatriz();
		
		Matriz matrix2 = new Matriz();
		System.out.println("Solucion 1 complejidad O(n)");
		
		matrix2.usarSolucion1();
		
		long startTime1 = System.nanoTime();
		int sol1 = matrix2.solucion.filaConMasUnos(matrix2);
		long stopTime1 = System.nanoTime();
		long time1 = stopTime1 - startTime1;
		
		System.out.println(sol1);
		System.out.println("Tiempo de ejecucion: "+time1);
	
	}

}
