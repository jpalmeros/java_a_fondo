package libro.cap01.cadenas;

public class Cadenas5a {

	public static void main(String[] args) {
		// Obtengo el milisegundo actual
		long hi = System.currentTimeMillis();
		
		// Instancio un StringBuffer inicialmente vacio
		StringBuffer sb = new StringBuffer();
		
		// Voy a concatenar n caracteres
		int n = 100000;
		
		char c;
		for (int i = 0; i < n; i++)
		{
			// Obtengo caracteres entre 'A' y 'z'
			c = (char)('A' + i % ('Z' - 'A' + 1));
			
			// Concateno el caracter en el StringBuffer
			sb.append(c);
		}
		
		// Obtengo el milisegundo actual
		long hf = System.currentTimeMillis();
		
		// Muestro la cadena resultante
		System.out.println(sb.toString());
		
		// Muestro la cantidad de milisegundos insumidos
		System.out.println((hf - hi) + " milisegundos");
	}

}
