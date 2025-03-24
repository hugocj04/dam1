package ejercicio02;

public class Documento {

	private String empresa;

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	@Override
	public String toString() {
		return "Documento [Empresa=" + empresa + "]";
	}

	public Documento(String empresa) {
		super();
		this.empresa = empresa;
	}

	public void imprimirCabecera() {
		System.out.printf(""" 
				\t\t\t\t\t\t\tDATOS DE LA EMPRESA
				
				Empresa: %s
				
				
				""", empresa);
	}
}
