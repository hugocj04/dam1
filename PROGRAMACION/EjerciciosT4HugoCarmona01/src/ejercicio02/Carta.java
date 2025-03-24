package ejercicio02;

public class Carta extends Documento {

	private String fecha;

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + "]";
	}

	public Carta(String empresa, String fecha) {
		super(empresa);
		this.fecha = fecha;
	}
	
	public void imprimirCabecera() {
		System.out.printf(""" 
				\tDATOS DE LA EMPRESA
				
				\tFecha: %s
				
				
				""", fecha);
	}

}
