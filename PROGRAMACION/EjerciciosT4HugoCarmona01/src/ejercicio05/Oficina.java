package ejercicio05;

import java.util.Arrays;

public class Oficina {

	private Empleado[] lista;
	private double dineroOficina;

	public Oficina(Empleado[] lista, double dineroOficina) {
		super();
		this.lista = lista;
		this.dineroOficina = dineroOficina;
	}

	public Empleado[] getLista() {
		return lista;
	}

	public void setLista(Empleado[] lista) {
		this.lista = lista;
	}
	
	public double getDineroOficina() {
		return dineroOficina;
	}

	public void setDineroOficina(double dineroOficina) {
		this.dineroOficina = dineroOficina;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + ", dineroOficina=" + dineroOficina + "]";
	}
	
	public Empleado elegirEmpleado(int opcionEmpleado) {
		Empleado e = null;
		switch(opcionEmpleado) {
			case 1:
				e = lista[0];
				break;
			case 2:
				e = lista[1];
				break;
			case 3:
				e = lista[2];
				break;
			}
		return e;
	}

	public double calcularSueldoTipoEmpleado(Empleado e) {
		return e.calcularSueldo();
	}
	
	public double gastoEnEmpleados() {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma += calcularSueldoTipoEmpleado(lista[i]);
		}
		return suma;
	}
	
	public void felicitarVendedores(double ventas) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof Vendedor) {
				((Vendedor)lista[i]).comprobarTope(ventas);
			}
		}
	}
	
}
