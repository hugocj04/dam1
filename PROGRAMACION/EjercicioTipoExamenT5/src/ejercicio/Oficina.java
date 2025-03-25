package ejercicio;

import java.util.List;

public class Oficina {

	private List<Trastero> lista;

	public Oficina(List<Trastero> lista) {
		super();
		this.lista = lista;
	}

	public List<Trastero> getLista() {
		return lista;
	}

	public void setLista(List<Trastero> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Oficina [lista=" + lista + "]";
	}
	
	public void añadirTrastero(Trastero t) {
		lista.add(t);
	}
	
	public int[] buscarPorPrecio(double precio){
		int[] aux = null;
		for (int i = 0; i < lista.size(); i++) {
			if (precio == lista.get(i).getPrecio()) {
				aux[i] = i;
			}
		}
		return aux;
	}
	
}
