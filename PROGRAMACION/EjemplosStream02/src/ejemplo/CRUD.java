package ejemplo;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class CRUD {

	private List<Producto> list;

	public CRUD(List<Producto> list) {
		this.list = list;
	}

	public List<Producto> getList() {
		return list;
	}

	public void setList(List<Producto> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "CRUD [list=" + list + "]";
	}

	// Filtra y devuelve los productos que cuestan más de 50€
	public List<Producto> productosCaros() {
	    List<Producto> productosFiltrados = new ArrayList<>();
	    list.stream().filter(p -> p.getPrecio() > 50).forEach(productosFiltrados::add);
	    return productosFiltrados;
	}

	// Extrae y devuelve solo los nombres de los productos
	public List<String> mostrarNombresProductos() {
	    List<String> nombres = new ArrayList<>();
	    list.stream().map(Producto::getNombre).forEach(nombres::add);
	    return nombres;
	}

	// Convierte los precios de los productos a enteros y los devuelve en una lista
	public List<Integer> preciosRedondeados() {
	    List<Integer> precios = new ArrayList<>();
	    list.stream().mapToInt(p -> (int) p.getPrecio()).forEach(precios::add);
	    return precios;
	}

	// Extrae y devuelve todas las letras de los nombres de los productos, una por una
	public List<Character> mostrarLetrasDeProductos() {
	    List<Character> letras = new ArrayList<>();
	    list.stream().flatMap(p -> p.getNombre().chars().mapToObj(c -> (char) c)).forEach(letras::add);
	    return letras;
	}

	// Convierte los caracteres de los nombres de los productos a sus valores ASCII
	public List<Integer> mostrarValoresASCII() {
	    List<Integer> valoresASCII = new ArrayList<>();
	    list.stream().flatMapToInt(p -> p.getNombre().chars()).forEach(valoresASCII::add);
	    return valoresASCII;
	}

	// Devuelve una lista sin productos repetidos
	public List<Producto> mostrarProductosUnicos() {
	    List<Producto> productosUnicos = new ArrayList<>();
	    list.stream().distinct().forEach(productosUnicos::add);
	    return productosUnicos;
	}

	// Ordena los productos por precio de menor a mayor
	public List<Producto> ordenarPorPrecioAscendente() {
	    List<Producto> productosOrdenados = new ArrayList<>();
	    list.stream().sorted(Comparator.comparingDouble(Producto::getPrecio)).forEach(productosOrdenados::add);
	    return productosOrdenados;
	}

	// Ordena los productos por precio de mayor a menor
	public List<Producto> ordenarPorPrecioDescendente() {
	    List<Producto> productosOrdenadosDesc = new ArrayList<>();
	    list.stream().sorted((p1, p2) -> (int) (p2.getPrecio() - p1.getPrecio())) // Orden descendente con signo menos
	            .forEach(productosOrdenadosDesc::add);
	    return productosOrdenadosDesc;
	}

	// Muestra detalles de cada producto sin modificar la lista
	public List<Producto> mostrarProductosConDetalles() {
	    List<Producto> productosConDetalles = new ArrayList<>();
	    list.stream().peek(p -> System.out.println("Producto: " + p)).forEach(productosConDetalles::add);
	    return productosConDetalles;
	}

	// Devuelve los 3 productos más baratos de la lista
	public List<Producto> tresProductosMasEconomicos() {
	    List<Producto> productosBaratos = new ArrayList<>();
	    list.stream().sorted(Comparator.comparingDouble(Producto::getPrecio)).limit(3).forEach(productosBaratos::add);
	    return productosBaratos;
	}

	// Omite los 2 productos más baratos y devuelve el resto
	public List<Producto> omitirProductosEconomicos() {
	    List<Producto> productosOmitidos = new ArrayList<>();
	    list.stream().sorted(Comparator.comparingDouble(Producto::getPrecio)).skip(2).forEach(productosOmitidos::add);
	    return productosOmitidos;
	}

	// Devuelve los productos hasta encontrar el primero que cuesta más de 100€
	public List<Producto> mostrarProductosHasta100() {
	    List<Producto> productosHasta100 = new ArrayList<>();
	    list.stream().takeWhile(p -> p.getPrecio() <= 100).forEach(productosHasta100::add);
	    return productosHasta100;
	}

	// Omite los productos baratos y devuelve la lista a partir del primero que cuesta más de 100€
	public List<Producto> omitirHastaEncontrarProductoCaro() {
	    List<Producto> productosOmitidos = new ArrayList<>();
	    list.stream().dropWhile(p -> p.getPrecio() <= 100).forEach(productosOmitidos::add);
	    return productosOmitidos;
	}

	// Devuelve todos los productos de la lista sin modificaciones
	public List<Producto> recogerTodosLosProductos() {
	    List<Producto> todosLosProductos = new ArrayList<>();
	    list.stream().forEach(todosLosProductos::add);
	    return todosLosProductos;
	}
}
