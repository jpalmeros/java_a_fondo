package libro.cap01;

public class DemoCaracteres3 {

	public static void main(String[] args) {
		char c;
		for ( int i = 'A'; i <= 'z'; i++)
		{
			// Para asignar un int en un char debemos "castear"
			c = (char)i;
			System.out.println(c);
		}

	}

}
