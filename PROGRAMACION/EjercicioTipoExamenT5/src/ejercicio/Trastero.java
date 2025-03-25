package ejercicio;

public class Trastero implements Comparable<Trastero>{

	private int id;
	private double capacidad;
	private String direccion;
	private int num;
	private double precio;
	private boolean ocupado;

	public Trastero(int id, double capacidad, String direccion, int num, double precio, boolean ocupado) {
		super();
		this.id = id;
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.num = num;
		this.precio = precio;
		this.ocupado = ocupado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	@Override
	public String toString() {
		return "Trastero [id=" + id + ", capacidad=" + capacidad + ", direccion=" + direccion + ", num=" + num + ", precio=" + precio
				+ ", ocupado=" + ocupado + "]";
	}

	@Override
	public int compareTo(Trastero t) {
		// TODO Auto-generated method stub
		return Integer.compare(this.num, t.num);
	}

}
