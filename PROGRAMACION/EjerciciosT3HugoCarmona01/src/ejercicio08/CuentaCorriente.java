package ejercicio08;

import utilidades.Leer;

public class CuentaCorriente {

	private double saldo;
	
	public void ingresarDinero(double ingreso) {
		saldo += ingreso;
	}
	
	public double retirarDinero(double retiro) {
		if (saldo > retiro) {
			saldo = saldo - retiro;
			return saldo;
		} else {
			return -1;
		}
	}
	
	public void imprimirFallo(double aviso) {
		if (aviso == -1) {
			System.out.println("\nFallo al realizar la operación.");
		}
	}
	
	public double convertir(double dolarAmericano) {
		double saldoDolaresAmericanos;
		saldoDolaresAmericanos = saldo * dolarAmericano;
		return saldoDolaresAmericanos;
	}
	
	public double mostrarSaldo() {
		return saldo;
	}
	
}
