package ejercicioset;

import java.util.Objects;

public class Trastero implements Comparable<Trastero>{

	private double capacidad;
	private String direccion;
	private int num;
	private double precio;
	private boolean ocupado;

	public Trastero(double capacidad, String direccion, int num, double precio, boolean ocupado) {
		super();
		this.capacidad = capacidad;
		this.direccion = direccion;
		this.num = num;
		this.precio = precio;
		this.ocupado = ocupado;
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
		return "Trastero [capacidad=" + capacidad + ", direccion=" + direccion + ", num=" + num + ", precio=" + precio
				+ ", ocupado=" + ocupado + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(capacidad, direccion, num, ocupado, precio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trastero other = (Trastero) obj;
		return Double.doubleToLongBits(capacidad) == Double.doubleToLongBits(other.capacidad)
				&& Objects.equals(direccion, other.direccion) && num == other.num && ocupado == other.ocupado
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio);
	}
	
	@Override
	public int compareTo(Trastero t) {
		// TODO Auto-generated method stub
		if (num > t.getNum()) {
			return -1;
		} else {
			if (num < t.getNum()) {
				return 1;
			}
		}
		return 0;
	}
	
	public int compareToV2(Trastero t) {
		return Integer.compare(t.getNum(), num);
	}

}
