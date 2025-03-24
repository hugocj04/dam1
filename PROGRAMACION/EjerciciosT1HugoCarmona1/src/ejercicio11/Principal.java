package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("¿De cuantos litros es el caudal?");
		
		double litros=Leer.datoDouble();
		
		System.out.println("¿Cuanto tiempo esta conectado?");
		
		//Conversion de horas a segundo
		double hora=Leer.datoDouble();
		double secHora=3600;
		double horaSec;
		horaSec=hora*secHora;
		
		//Cuantos litros hay en un metro cubico
		double metroCubico=0.001;
		double conversion;
		conversion=litros*metroCubico;
		
		//Cuantos metros cubicos se vacian en x tiempo
		double metrosFin;
		metrosFin=horaSec*conversion;
			
		System.out.println("Del caudal se sacan "+metrosFin+" metros cubicos");
	}

}
