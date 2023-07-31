package libro.cap02.figuras;

public class Circulo extends FiguraGeometrica {
	private int radio;
	
	public Circulo(int r)
	{
		super("Circulo");
		radio = r;
	}
	
	public double area()
	{
		// retorno "PI por radio al cuadrado"
		return Math.PI * Math.pow(radio, 2);
	}

	// setters y getters
	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}	
}
