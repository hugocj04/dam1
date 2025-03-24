package ejercicio02;

import java.util.Arrays;

public class Hotel {

	private Habitacion lista[];
	private int tam = 0;

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}

	public Habitacion[] getLista() {
		return lista;
	}

	public void setLista(Habitacion[] lista) {
		this.lista = lista;
	}

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Hotel [lista=" + Arrays.toString(lista) + "]";
	}

    public void agregarHabitacion(Habitacion h1) {
        if (tam < lista.length) {
            lista[tam] = h1; 
            tam++;
            h1.setOcupada(true);
        } else {
            System.out.println("No hay espacio disponible para más habitaciones.");
        }
    }
    
    public boolean comprobarOcupada(Habitacion h1) {
    	boolean comprobar;
    	if (h1.isOcupada()) {
    		comprobar = true;
    	} else {
    		comprobar = false;
    	}
    	return comprobar;
    }
        
    public double calcularPrecioFinal(int diasCont, double precioNoche, int bebidas, double precioBebidas) {
    	double precioFinal;
       	precioFinal = diasCont * precioNoche + bebidas * precioBebidas;
    	return precioFinal;
    }
    
}
