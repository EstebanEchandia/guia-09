package ejemplo01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Registro {
		
	/**
	 * Lista de valores observados
	 * Problema es por cada entrada de la lista calcular una nueva lista
	 * donde la entrada N de la nueva lista es el promedio de los N valores anteriores.
	 * La entrada 0 es el prodio de i-0
	 * La entrada 1 es el promedio de i-0+i-1
	 * La entrada N es el promedio de i-0+i-1+.....+i-n
	 */
	private List<Integer> valores;

	private ListaPromedio calculador;
	/**
	 * Me da informacion sobre cada "corrida"
	 */
	private List<Informacion> corridas;
	
	public Registro() {
		this.corridas = new ArrayList<Informacion>();
		this.valores = new ArrayList<Integer>();
		this.usarCalculo1();
	}
	
	public void usarCalculo1() {
		this.calculador = new ListaPromedio1();
	}

	public void usarCalculo2() {
		this.calculador = new ListaPromedio2();
	}

	public void generateRandomArray(int n){
		Random r = new Random();
		Stream<Integer> t = Stream.generate( () -> r.nextInt(9999));
		this.valores.addAll(t.limit(n).collect(Collectors.toList()));
		Integer cantidad = Math.min(15, n);
		System.out.println("Primeros "+ cantidad+" valores generados");
		this.valores.stream().limit(cantidad).forEach(i -> System.out.print(i+"; "));
		System.out.println("_________________________");
	}  
	
	public void calcualrPromedios() {
		Integer cantidad = Math.min(15, this.valores.size());
		System.out.println("Primeros " + cantidad + " promedios");
		this.calculador.calcular(this)
					.stream()
					.limit(cantidad)
					.forEach(i -> {
						System.out.print(i+"; ");
					});
		System.out.println("_________________________");
	}

	public List<Integer> getValores() {
		return valores;
	}
	
	public void addCorrida(Informacion c) {
		this.corridas.add(c);
	}
	
	public void imprimirReporte() {
		System.out.println();
		System.out.println("RESULTADO DE LAS EJECUCIONES: ");		
		this.corridas.forEach(System.out::println);
	}

	public void guardarReporte() {
		long ts = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		this.corridas.forEach(c -> sb.append(c.toString()));
		try(Writer fileWriter= new FileWriter("informe-"+ts+".csv",true)) {
			try(BufferedWriter out = new BufferedWriter(fileWriter)){				
				out.write(sb.toString());  //  \r\n \n 
			} 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
