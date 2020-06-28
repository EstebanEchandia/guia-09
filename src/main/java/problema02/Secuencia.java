package problema02;

import java.util.ArrayList;


public class Secuencia {

	private Solucion solucion;
	
	ArrayList<Integer> secuencia = new ArrayList<Integer>();
	
	public Secuencia() {
		secuencia.add(1);
		secuencia.add(4);
		secuencia.add(2);
		secuencia.add(0);
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
