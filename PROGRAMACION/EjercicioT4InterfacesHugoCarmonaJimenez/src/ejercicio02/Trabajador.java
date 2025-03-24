package ejercicio02;

public class Trabajador implements Impuestos {

	private double irpf;

	public Trabajador(double irpf) {
		super();
		this.irpf = irpf;
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	@Override
	public String toString() {
		return "Trabajador [irpf=" + irpf + "]";
	}
	
	public double calculoIVA(double precio, int iva) {
		return 0;
	}
	
	public double calculoIRPF(double sueldo) {
		double cien = 100;
		return sueldo * irpf / cien;
	}
}
