package libro.cap01;

import java.util.Scanner;

public class DemoMatriz {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de filas: ");
		int n = scanner.nextInt();
		
		System.out.print("Ingrese cantidad de columnas: ");
		int m = scanner.nextInt();
		
		// Creo una matriz de n filas y m columnas
		int mat[][] = new int[n][m];
		
		int nro;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				// Genero un numero aleatorio entre 0 y 1000
				nro = (int)(Math.random() * 1000);
				
				// Asigno el numero en la matriz
				mat[i][j] = nro;
			}
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				// Imprimo la celda de la matriz
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
