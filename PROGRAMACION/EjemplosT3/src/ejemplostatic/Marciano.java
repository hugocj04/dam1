package ejemplostatic;

public class Marciano {

	private int tipo;
	private static int cuentaMarcianos;
	
	public Marciano(int tipo) {
		this.tipo = tipo;
		cuentaMarcianos++;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public static int getCuentaMarcianos() {
		return cuentaMarcianos;
	}

	public static void setCuentaMarcianos(int cuentaMarcianos) {
		Marciano.cuentaMarcianos = cuentaMarcianos;
	}
}
