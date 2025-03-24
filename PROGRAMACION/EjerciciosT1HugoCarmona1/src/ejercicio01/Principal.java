package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Apartado a)
		double largo=50, ancho=21, profundidad=2.50;
		double volumen;
		volumen=largo*ancho*profundidad;
		
		System.out.println("El volumen de una piscina se averigua multiplicando su largo = "
		+largo+" por su ancho = "+ancho+" por la profundidad = "+profundidad);
		System.out.println("Por lo tanto, su volumen es igual a "+volumen+" metros cubicos");
		
		double coste;
		coste=volumen*1.8;
				
		System.out.println("Teniendo en cuenta que el volumen es "
		+volumen+" metros cubicos y el metro cubico cuesta 1,80 euros, rellenarla costaría "+coste+" euros");
		
//Apartado b)
		double profundidad2=1.8, radio=12;
		double volumen2;
		double exp=2.0;
		volumen2=profundidad2*Math.PI*Math.pow(radio, exp);
		
		System.out.println("El volumen de una piscina se calcula multiplicando profundidad "
				+ "por pi por radio al cuadrado, por lo que su volumen sera de "+volumen2+" metros cubicos");
		
		double coste2;
		coste2=volumen2*1.8;

		System.out.println("Teniendo en cuenta que el volumen de la piscina es "
		+volumen2+" metros cubicos, costaria rellenarla "+coste2+" euros");

	}

}
