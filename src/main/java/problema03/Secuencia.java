package problema03;

import java.util.ArrayList;
import problema03.Solucion;

public class Secuencia {

	private Solucion solucion;

	ArrayList<Integer> secuencia = new ArrayList<Integer>();
	
	public Secuencia() {
		secuencia.add(3);
		secuencia.add(-4);
		secuencia.add(-3);
		secuencia.add(2);
		secuencia.add(7);
		secuencia.add(-4);
		secuencia.add(3);
	}
	
	public void usarSolucion1() {
		this.solucion = new Solucion1();
	}

	public void usarSolucion2() {
		this.solucion = new Solucion2();
	}
	
	public ArrayList<Integer> getSecuencia() {
		return secuencia;
	}
	
	public Solucion getSolucion() {
		return solucion;
	}
}
