package ejemplo01;

public class Consultor extends Trabajador {

	private int horas;
	private double tarifa;

	public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	@Override
	public String toString() {
		return super.toString() + "Consultor [horas=" + horas + ", tarifa=" + tarifa + "]";
	}

	// Usamos el super para llamar al metodo, asi si tenemos que cambiar algo en la clase trabajador, no hay que cambiarlo en todas sus subclases
	public double calcularSueldo(double base) {
		return super.calcularSueldo(base) + horas * tarifa;
	}

	public void imprimirSueldo (double base) {
		// El this llama al metodo de la propia clase, pero no es necesario ponerlo para llamar a un metodo dentro de una misma clase
		System.out.println("Tu sueldo es: " + this.calcularSueldo(base));
	}
	
	public int calcularDias (int horasDia) {
		return (int) horas / horasDia;
	}
	
}