package libro.cap02.figuras;

public class Rectangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	
	public Rectangulo(double b, double h)
	{
		super("Rectangulo"); // constructor del padre
		base = b;
		altura = h;
	}
	
	public double area()
	{
		return base * altura;
	}

	// setters y getters
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
