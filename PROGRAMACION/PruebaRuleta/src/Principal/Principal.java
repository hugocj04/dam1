package Principal;

public class Principal {

	    public static void main(String[] args) throws InterruptedException {
	    	
	    	Casino ruleta = new Casino();
	    	
	    	ruleta.imprimiRuleta();
	    	
//	        Vista vista = new Vista();
//	        Metodos metodos = new Metodos();
//
//	        vista.mostrarMenu();
//
//	        int numeroGanador = metodos.generarNumeroGanador();
//	        vista.mostrarRuletaCircular(numeroGanador);
//
//	        int[] apuesta = {5}; // Ejemplo de apuesta, podría ser cualquier número
//	        int ganancias = metodos.calcularGanancias(apuesta, numeroGanador);
//
//	        vista.mostrarGanancias(ganancias);
//	    }
//
//	    static class Vista {
//	        public void mostrarMenu() {
//	            System.out.println("Bienvenido a la Ruleta de Casino");
//	            System.out.println("1. Girar la ruleta");
//	            System.out.println("2. Salir");
//	            System.out.println("Elige una opción:");
//	        }
//
//	        public void mostrarRuletaCircular(int numeroGanador) throws InterruptedException {
//	            String[] ruleta = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}; // Los números de la ruleta
//	            int posicionActual = 0;
//
//	            System.out.println("La bola está girando...");
//
//	            // Simular la "bola" girando
//	            for (int i = 0; i < 50; i++) { // Número arbitrario de vueltas antes de detenerse
//	                posicionActual = (posicionActual + 1) % ruleta.length; // Mover a la siguiente posición
//	                System.out.print("\033[H\033[2J");
//	                System.out.flush();
//	                mostrarRuleta(ruleta, posicionActual);
//	                Thread.sleep(200); // Pausa para mostrar el efecto de giro
//	            }
//
//	            // Mostrar el número ganador
//	            System.out.print("\033[H\033[2J");
//	            System.out.flush();
//	            mostrarRuleta(ruleta, numeroGanador);
//	            System.out.println("\n¡El número ganador es: " + numeroGanador + "!");
//	        }
//
//	        private void mostrarRuleta(String[] ruleta, int posicionBola) {
//	            // Representación de la ruleta en un círculo (aproximado)
//	            String[] circulo = new String[ruleta.length];
//	            for (int i = 0; i < ruleta.length; i++) {
//	                if (i == posicionBola) {
//	                    circulo[i] = "X"; // Posición de la bola
//	                } else {
//	                    circulo[i] = ruleta[i];
//	                }
//	            }
//
//	            // Simulamos una representación circular:
//	            System.out.println();
//	            System.out.println("      " + circulo[0] + "      ");
//	            System.out.println("  " + circulo[9] + "      " + circulo[1] + "  ");
//	            System.out.println(circulo[8] + "          " + circulo[2]);
//	            System.out.println("  " + circulo[7] + "      " + circulo[3] + "  ");
//	            System.out.println("      " + circulo[6] + "      ");
//	            System.out.println("           " + circulo[5] + "   " + circulo[4]);
//	        }
//
//	        public void mostrarGanancias(int ganancias) {
//	            System.out.println("Tus ganancias son: " + ganancias + " euros.");
//	        }
//	    }
//
//	    static class Metodos {
//	        public int generarNumeroGanador() {
//	            return (int) (Math.random() * 11); // Número aleatorio entre 0 y 10
//	        }
//
//	        public int calcularGanancias(int[] apuesta, int numeroGanador) {
//	            int ganancias = 0;
//	            for (int numero : apuesta) {
//	                if (numero == numeroGanador) {
//	                    ganancias += 10; // Ejemplo de cálculo de ganancias
//	                }
//	            }
//	            return ganancias;
//	        }
//	    }
//
//	    static class Objetos {
//	        static class Ruleta {
//	            String[] numeros = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
//	        }
//
//	        static class MiCasino { // Renombrada para evitar conflicto
//	            // Atributos y métodos del casino
//		        }
//
//		        static class Jugador {
//		            String nombre;
//		            int saldo;
//
//		            public Jugador(String nombre, int saldo) {
//		                this.nombre = nombre;
//		                this.saldo = saldo;
//		            }
//		        }
	}

}
