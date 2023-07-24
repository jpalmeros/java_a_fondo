package libro.cap02;

import libro.cap02.fechas.Fecha;
import libro.cap02.misclases.FechaDetallada;

public class TestPolimorfismo {

	public static void main(String[] args) {
		// a fec (de tipo fecha) le asigno un objeto FechaDetallada
		Fecha fec = new FechaDetallada("25/02/2009");
		
		// a obj (de tipo Object) le asigno un objeto FechaDetallada
		Object obj = new FechaDetallada("3/12/2008");
		
		// Imprimo los dos objetos
		System.out.println("fec = " + fec);		// invoca a toString de fec
		System.out.println("obj = " + obj);		// invoca a toString de obj
	}

}
