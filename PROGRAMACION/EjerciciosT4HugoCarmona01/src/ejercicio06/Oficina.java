package ejercicio06;

import java.util.Arrays;

public class Oficina {

	private Cuenta[] lista;

	public Oficina(Cuenta[] lista) {
		super();
		this.lista = lista;
	}

	public Cuenta[] getLista() {
		return lista;
	}

	public void setLista(Cuenta[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + Arrays.toString(lista) + "]";
	}

	public double calcularTotalCuentas() {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			suma += lista[i].getSalario();
		}
		return suma;
	}

	public Cuenta findCuenta(int opcionCuenta) {
		boolean encontrado = true;
		Cuenta c = null;
		for (int i = 0; i < lista.length || encontrado != false; i++) {
			if (opcionCuenta == i) {
				c = lista[i];
				encontrado = false;
			}
		}
		return c;
	}

	public double ingresar(Cuenta c, double ingreso) {
		return c.ingresarDinero(ingreso);
	}

	public double retirar(Cuenta c, double reintegro) {
		return c.sacarDinero(reintegro);
	}

	public double calcularGanadoPorReintegro() {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaEmpresa) {
				suma += ((CuentaEmpresa) lista[i]).getAcumulo();	
			}
		}
		return suma;
	}

	public double calcularGastadoPorRegalo() {
		double suma = 0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] instanceof CuentaJoven)
			suma += ((CuentaJoven)lista[i]).getRegalo();
		}
		return suma;
	}
}
