package libro.cap02.figuras;

public class Triangulo extends FiguraGeometrica {
	private double base;
	private double altura;
	
	public Triangulo(int b, int h)
	{
		super("Triangulo");
		base = b;
		altura = h;
	}
	
	public double area()
	{
		return base * altura / 2;
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
