package ejemplointerfaces;

public class Gacela extends Bovido implements IPresa{

	public void observar() {
		System.out.println("Rana mirando 360º");
	}
	
	public void huir() {
		System.out.println("Salto triple");
	}
	
}