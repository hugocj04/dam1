package ruleta;

public class rulet {
    // Método para generar el número ganador
    public int generarNumeroGanador() {
        return (int) (Math.random() * 37); // Genera un número aleatorio entre 0 y 36
    }

    // Método para calcular las ganancias (este es un ejemplo básico)
    public int calcularGanancias(int[] apuesta, int numeroGanador) {
        int ganancias = 0;
        for (int valor : apuesta) {
            if (valor == numeroGanador) {
                ganancias = valor * 35; // Ejemplo: Si apuestas a un número y ganas, la ganancia es el valor de la apuesta por 35
            }
        }
        return ganancias;
    }

    // Método para mostrar la ruleta
    public void mostrarRuletaCircular(int numeroGanador) throws InterruptedException {
        String[] ruleta = {
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18",
            "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36"
        };
        int posicionActual = 0;
        System.out.println("La bola está girando...");
        // Simular la "bola" girando
        for (int i = 0; i < 37 * 3 + numeroGanador; i++) { // Tres vueltas completas más la posición del número ganador
            posicionActual = (posicionActual + 1) % ruleta.length; // Mover a la siguiente posición
            mostrarRuleta(ruleta, posicionActual);
            Thread.sleep(100); // Pausa para mostrar el efecto de giro
        }
        // Mostrar el número ganador final
        System.out.println("\nEl número ganador es: " + ruleta[posicionActual]);
    }

    // Método para mostrar la ruleta (aproximación de la visualización)
    private void mostrarRuleta(String[] ruleta, int posicionActual) {
        // Representación de la ruleta en un cuadrado (aproximado)
        System.out.print("\r");
        System.out.println("Ruleta:");
        System.out.print("| ");
        for (int i = 0; i < 12; i++) {
            if (i == posicionActual) {
                System.out.print("X | ");
            } else {
                System.out.print(ruleta[i] + " | ");
            }
        }
        System.out.println();
        for (int i = 23, j = 12; i > 12 && j < 24; i--, j++) {
            if (i == posicionActual) {
                System.out.printf("| X |\t\t\t\t\t\t    | %2s |\n", ruleta[j]);
            } else if (j == posicionActual) {
                System.out.printf("| %2s |\t\t\t\t\t\t    | X |\n", ruleta[i]);
            } else {
                System.out.printf("| %2s |\t\t\t\t\t\t    | %2s |\n", ruleta[i], ruleta[j]);
            }
        }
        for (int i = 36; i > 23; i--) {
            if (i == posicionActual) {
                System.out.print("X | ");
            } else {
                System.out.print(ruleta[i] + " | ");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        rulet juego = new rulet();
        // Generar el número ganador
        int numeroGanador = juego.generarNumeroGanador();
        System.out.println("Número ganador generado: " + numeroGanador);
        // Mostrar la ruleta con el número ganador
        juego.mostrarRuletaCircular(numeroGanador);
        // Ejemplo de una apuesta
        int[] apuesta = {5}; // Se apuesta al número 5 (ejemplo)
        int ganancias = juego.calcularGanancias(apuesta, numeroGanador);
        // Mostrar las ganancias
        if (ganancias > 0) {
            System.out.println("¡Ganaste! Las ganancias son: " + ganancias);
        } else {
            System.out.println("No ganaste. Intenta de nuevo.");
        }
    }
}