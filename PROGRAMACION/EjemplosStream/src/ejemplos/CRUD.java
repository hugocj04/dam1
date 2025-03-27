package ejemplos;

import java.util.List;

public class CRUD {

	List<Producto> list;

	public CRUD(List<Producto> list) {
		super();
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
	
	public List<Producto> mostrarPrecioMayor50() {
		
	}
	
}
