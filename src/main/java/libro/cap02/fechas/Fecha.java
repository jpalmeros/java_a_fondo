package libro.cap02.fechas;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	
	// constructor
	public Fecha(int d, int m, int a) {
		super();
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}

	public int getDia() {
		// retorna el valor de la variable dia
		return dia;
	}
	
	public void setDia(int dia) {
		// asigna el valor del parametro a la variable dia
		this.dia = dia;
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		this.mes = mes;
	}
	
	public int getAnio() {
		return anio;
	}
	
	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	// sobreescribimos el metodo toString (lo heredamos de Object)
	@Override
	public String toString() {
		// retorna una cadena tal como queremos que se vea la fecha
		return dia + "/" + mes + "/" + anio;
	}
	
	// sobreescribimos el metodo equals que heredamos de Object
	@Override
	public boolean equals(Object o) {
		Fecha otra = (Fecha)o;
		return (dia == otra.dia) && (mes == otra.mes) && (anio == otra.anio);
	}
}
