package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente cc = new CuentaCorriente(1200, "Hugo", "Carmona Jiménez", 15, 0);
		CuentaJoven cj = new CuentaJoven(1200, "Paco", "Martinez Serrano", 0);
		CuentaEmpresa ce = new CuentaEmpresa(1200, "Rodrigo", "Yedro Alonso", 0);
		Cuenta[] lista = {cc, cj, ce};
		Oficina o = new Oficina (lista);
	
		int opcion, opcionCuenta;
		double ingreso, reintegro;
		
		System.out.println("Bienvenido.");
		
		do {
			System.out.println("\n¿Qué desea hacer?");
			System.out.println("""
					1. Ingresar dinero
					2. Sacar dinero
					3. Calcular total de las cuentas
					4. Calcular lo ganado por cada reintegro
					5. Calcular lo gastado por cada regalo
					6. Salir
					""");
			opcion = Leer.datoInt();

			switch (opcion) {
			case 1:
				System.out.println("¿Qué tipo de cuenta tiene?");
				System.out.println("""
						1. Cuenta corriente
						2. Cuenta joven
						3. Cuenta de empresa
						""");
				opcionCuenta = Leer.datoInt();
				while (opcionCuenta < 1 || opcionCuenta > 3) {
					System.out.print("Opcion inexistente, intentelo de nuevo: ");
					opcionCuenta = Leer.datoInt();
				}
				System.out.println("¿Cuánto desea ingresar?");
				ingreso = Leer.datoDouble();
				System.out.printf("Ingreso realizado con existo.\nSaldo actual: %.2f€\n\n", o.ingresar(o.findCuenta(opcionCuenta - 1), ingreso));
				break;
			case 2:
				System.out.println("¿Qué tipo de cuenta tiene?");
				System.out.println("""
						1. Cuenta corriente
						2. Cuenta joven
						3. Cuenta de empresa
						""");
				opcionCuenta = Leer.datoInt();
				System.out.println("¿Cuánto desea retirar?");
				reintegro = Leer.datoDouble();
				System.out.printf("Ingreso realizado con existo.\nSaldo actual: %.2f€\n\n", o.retirar(o.findCuenta(opcionCuenta - 1), reintegro));
				break;
			case 3:
				System.out.printf("El total gastado en sueldos es de: %.2f€\n\n", o.calcularTotalCuentas());
				break;
			case 4:
				System.out.printf("Lo ganado por cada reintegro son %.2f€\n\n", o.calcularGanadoPorReintegro());
				break;
			case 5:
				System.out.printf("Lo gastado por cada regalo son %.2f€\n\n", o.calcularGastadoPorRegalo());
				break;
			case 6:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion inexistente, intentelo de nuevo.");
				break;
			}
		} while (opcion != 6);
		
	}

}
