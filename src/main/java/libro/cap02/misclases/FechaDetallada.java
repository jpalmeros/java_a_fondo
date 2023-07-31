package libro.cap02.misclases;

import libro.cap02.fechas.Fecha;

public class FechaDetallada extends Fecha
{	
	private static String meses[] = {"Enero"
									,"Febrero"
									,"Marzo"
									,"Abril"
									,"Mayo"
									,"Junio"
									,"Julio"
									,"Agosto"
									,"Septiembre"
									,"Octubre"
									,"Noviembre"
									,"Diciembre"};
	
	
	
	public FechaDetallada(int dia, int mes, int anio) {
		// invocamos al constructor del padre
		super(dia, mes, anio);
	}
	
	public FechaDetallada()
	{
		// invocamos al constructor del padre
		super();
	}
	
	public String toString()
	{
		return getDia() + " de " + meses[getMes() - 1] + " de " + getAnio();
	}
}
