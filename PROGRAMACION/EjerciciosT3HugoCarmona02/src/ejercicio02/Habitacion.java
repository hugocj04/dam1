package ejercicio02;

public class Habitacion {

	private String tipo;
	private double precioNoche;
	private String serviciosExtra;
	private String nombreCliente;
	private int diasCont;
	private boolean limpia;
	private boolean ocupada;

	public Habitacion(String tipo, double precioNoche, String serviciosExtra, String nombreCliente, int diasCont,
			boolean limpia, boolean ocupada) {
		super();
		this.tipo = tipo;
		this.precioNoche = precioNoche;
		this.serviciosExtra = serviciosExtra;
		this.nombreCliente = nombreCliente;
		this.diasCont = diasCont;
		this.limpia = limpia;
		this.ocupada = ocupada;
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precioNoche=" + precioNoche + ", serviciosExtra=" + serviciosExtra
				+ ", nombreCliente=" + nombreCliente + ", diasCont=" + diasCont + ", limpia=" + limpia + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecioNoche() {
		return precioNoche;
	}

	public void setPrecioNoche(double precioNoche) {
		this.precioNoche = precioNoche;
	}

	public String getServiciosExtra() {
		return serviciosExtra;
	}

	public void setServiciosExtra(String serviciosExtra) {
		this.serviciosExtra = serviciosExtra;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public int getDiasCont() {
		return diasCont;
	}

	public void setDiasCont(int diasCont) {
		this.diasCont = diasCont;
	}

	public boolean isLimpia() {
		return limpia;
	}

	public void setLimpia(boolean limpia) {
		this.limpia = limpia;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

}
