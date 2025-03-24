package ejercicio10;

public class Maquina {

	private int cantBilletes;
	private double saldo;
	private String contraseña;
	private Billete b;

	public int getCantBilletes() {
		return cantBilletes;
	}

	public void setCantBilletes(int cantBilletes) {
		this.cantBilletes = cantBilletes;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public Billete getB() {
		return b;
	}

	public void setB(Billete b) {
		this.b = b;
	}

	public Maquina(int cantBilletes, double saldo, String contraseña, Billete b) {
		super();
		this.cantBilletes = cantBilletes;
		this.saldo = saldo;
		this.contraseña = contraseña;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Maquina [cantBilletes=" + cantBilletes + ", saldo=" + saldo + ", contraseña=" + contraseña + ", b=" + b
				+ "]";
	}
	

	public double calcularLineaVenta() {
		return cantBilletes * b.calcularPrecio();
	}

	public void agregarRecaudacion() {
		saldo = saldo + calcularLineaVenta();
	}

}
