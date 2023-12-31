package libro.cap01;

import java.util.Scanner;

public class DemoArray {

	public static void main(String[] args) {
		// Defino un array de 10 enteros
		int arr[] = new int[10];
		
		// El scanner para leer por teclado...
		Scanner scanner = new Scanner(System.in);
		
		// Leo el primer valor
		System.out.print("Ingrese un valor (0 >= fin): ");
		int v = scanner.nextInt();
		
		int i = 0;
		
		// Mientras v sea distinto de cero AND i sea menor que 10
		while( v != 0 && i < 10 )
		{
			// Asigna v en arr[i] y luego incrementa el valor de i
			arr[i++] = v;
			
			// Leo el siguiente valor
			System.out.print("Ingrese el siguiente valor (0 >+ fin): ");
			v = scanner.nextInt();
		}
		
		// Recorro el array mostrando su contenido
		for( int j = 0; j < i; j++)
		{
			System.out.println(arr[j]);
		}

	}

}
