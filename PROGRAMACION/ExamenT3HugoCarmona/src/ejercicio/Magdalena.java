package ejercicio;

public class Magdalena {

	private int id;
	private String sabor;
	private String tipo;
	private double volumenMasa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getVolumenMasa() {
		return volumenMasa;
	}

	public void setVolumenMasa(double volumenMasa) {
		this.volumenMasa = volumenMasa;
	}

	@Override
	public String toString() {
		return "Magdalena [id=" + id + ", sabor=" + sabor + ", tipo=" + tipo + ", volumenMasa=" + volumenMasa + "]";
	}

	public Magdalena(int id, String sabor, String tipo, double volumenMasa) {
		super();
		this.id = id;
		this.sabor = sabor;
		this.tipo = tipo;
		this.volumenMasa = volumenMasa;
	}

}
