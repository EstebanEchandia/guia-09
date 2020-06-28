package problema01;

import ejemplo01.ListaPromedio1;
import ejemplo01.ListaPromedio2;

public class Matriz {

	public Solucion solucion;
	int [ ] [ ] matriz = {   
			{ 1, 1, 0, 0, 0, 0, 0, 0, 0 ,0 },
            { 1, 1, 1, 1, 1, 1, 0, 0 ,0 ,0 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 },
            { 1, 0, 0, 0, 0, 0, 0, 0, 0 ,0 },
            { 1, 1, 1, 1, 1, 0, 0, 0, 0 ,0 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0 ,0 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0 ,0 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0 ,0 },
            { 1, 1, 0, 0, 0, 0, 0, 0, 0 ,0 },
            { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 },
        };
	public int length = matriz.length;
	
	
	
	public Matriz() {
		super();
	}

	public void usarSolucion1() {
		this.solucion = new Solucion1();
	}

	public void usarSolucion2() {
		this.solucion = new Solucion2();
	}
	
	public void imprimirMatriz() {
		for(int i = 0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(this.matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public int[][] getDatos() {
		return matriz;
	}
	
}
