package problema03;

import ejemplo01.ListaPromedio1;
import ejemplo01.ListaPromedio2;

public class Secuencia {

	private Solucion solucion;
	
	public void usarSolucion1() {
		this.solucion = new Solucion1();
	}

	public void usarSolucion2() {
		this.solucion = new Solucion2();
	}
}
