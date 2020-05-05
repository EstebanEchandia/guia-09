package ejemplo01;

public class App {

	public static void main(String[] args) {

		Registro r = new Registro();

		r.usarCalculo1();
//		r.usarCalculo2();
		
		r.generateRandomArray(10);
		r.calcualrPromedios();
		r.generateRandomArray(100);
		r.calcualrPromedios();
		r.generateRandomArray(500);
		r.calcualrPromedios();
		r.generateRandomArray(1000);
		r.calcualrPromedios();
		r.generateRandomArray(5000);
		r.calcualrPromedios();
		r.generateRandomArray(10000);
		r.calcualrPromedios();
		r.generateRandomArray(20000);
		r.calcualrPromedios();
		r.generateRandomArray(40000);
		r.calcualrPromedios();
		r.generateRandomArray(80000);
		r.calcualrPromedios();
		r.generateRandomArray(100000);
		r.calcualrPromedios();
		r.imprimirReporte();
		r.guardarReporte();

	}
}
