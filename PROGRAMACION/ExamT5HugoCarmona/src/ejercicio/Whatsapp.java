package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Whatsapp {

	private List<Mensaje> lista;

	public Whatsapp(List<Mensaje> lista) {
		super();
		this.lista = lista;
	}

	public List<Mensaje> getLista() {
		return lista;
	}

	public void setLista(List<Mensaje> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Whatsapp [lista=" + lista + "]";
	}

	public void addMensaje(Mensaje m) {
		lista.add(m);
	}

	public Mensaje buscarPorId(int id) {
		for (Mensaje m : lista) {
			if (id == m.getId()) {
				return m;
			}
		}
		return null;
	}

	public boolean deleteMensaje(int id) {
		boolean eliminado = false;

		if (buscarPorId(id) != null) {
			lista.remove(buscarPorId(id));
			eliminado = true;
		}
		return eliminado;
	}

	public void imprimirLista() {
		Mensaje m;

		for (Iterator<Mensaje> it = lista.iterator(); it.hasNext();) {
			m = it.next();
			System.out.println(m);
		}
	}
	
	public boolean modificarMensaje(int id) {
		boolean modificado = false;
		
		if (buscarPorId(id) != null) {
			for (Mensaje m : lista) {
				if (buscarPorId(id).getId() == m.getId()) {
					m.setMensaje("*******");
				}
			}
			modificado = true;
		}
		return modificado;
	}
	
	public List<Mensaje> buscarPorMensaje(String mensaje){
		List<Mensaje> listMensajes = new ArrayList<Mensaje>();
		for (Mensaje m : lista) {
			if (mensaje.equalsIgnoreCase(m.getMensaje())) {
				listMensajes.add(m);
			}
		}
		return listMensajes;
	}
	
	public void imprimirMensajeTope(int tope) {
		if (lista.size() > tope) {
			System.out.println("Se está llegando al maximo que permite la memoria.");
		} else {
			System.out.println("Todavia hay margen para más mensajes.");
		}
	}
	
	public List<Mensaje> ordenarPorNombre(){
		List<Mensaje> porNombre = new ArrayList<Mensaje>(lista);
		return porNombre;
	}
	
	public List<Mensaje> ordenarPorId() {
		List<Mensaje> porId = new ArrayList<Mensaje>(lista);
		Collections.sort(porId, new OrdenarPorId());;
		return porId;
	}
	
	public double sumarPorNombre(String nombre, double cantidad) {
		int contador = 0;
		
		for (Mensaje m : lista) {
			if (nombre.equalsIgnoreCase(m.getNombre())) {
				contador++;
			}
		}
		return contador * cantidad;
	}
}
