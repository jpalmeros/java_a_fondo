package libro.cap01;

import java.util.Scanner;

public class HolaMundoNombreDos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Mensaje para el usuario
		System.out.print("Ingrese nombre edad y altura: ");
		
		// Leemos el nombre
		String nom = scanner.next();
		
		// Leemos la edad
		int edad = scanner.nextInt();
		
		// Leemos la altura
		double altura = scanner.nextDouble();
		
		// Mostramos los datos por consola
		System.out.println("Nombre: " + nom
				+ " Edad: " + edad
				+ " Altura: " + altura);

	}

}
