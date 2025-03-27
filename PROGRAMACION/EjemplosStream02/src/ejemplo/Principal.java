package ejemplo;

import java.util.*;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Producto> productos = new ArrayList<>();
        CRUD crud = new CRUD(productos);

        productos.add(new Producto("Ordenador", 1250.99, "Electrónica"));
        productos.add(new Producto("Ratón", 25, "Electrónica"));
        productos.add(new Producto("Teclado", 45.75, "Electrónica"));
        productos.add(new Producto("Camiseta", 19, "Ropa"));
        productos.add(new Producto("Zapatillas", 79.99, "Ropa"));
        productos.add(new Producto("Teléfono", 699.99, "Electrónica"));
        productos.add(new Producto("Libro", 12, "Librería"));
        productos.add(new Producto("Cascos", 12.99, "Electrónica"));

        int opcion;

        System.out.println("Bienvenido a nuestra tienda online.");

        do {
            System.out.print("""
                    \n0. Salir
                    1. Mostrar productos con precio mayor a 50€
                    2. Mostrar solo los nombres de los productos
                    3. Redondear precios de los productos
                    4. Mostrar todas las letras de los nombres de los productos
                    5. Mostrar los valores ASCII de los nombres de los productos
                    6. Mostrar productos únicos
                    7. Ordenar productos por precio de menor a mayor
                    8. Ordenar productos por precio de mayor a menor
                    9. Mostrar productos con detalles
                    10. Mostrar los 3 productos más baratos
                    11. Omitir los 2 productos más baratos
                    12. Mostrar productos de menos de 100€
                    12. Mostrar productos de mas de 100€
                    14. Recoger todos los productos
                    Seleccione una opción:\t""");
            
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 0:
                    System.out.println();
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println();
                    System.out.println(crud.productosCaros());
                    break;
                case 2:
                    System.out.println();
                    System.out.println(crud.mostrarNombresProductos());
                    break;
                case 3:
                    System.out.println();
                    System.out.println(crud.preciosRedondeados());
                    break;
                case 4:
                    System.out.println();
                    System.out.println(crud.mostrarLetrasDeProductos());
                    break;
                case 5:
                    System.out.println();
                    System.out.println(crud.mostrarValoresASCII());
                    break;
                case 6:
                    System.out.println();
                    System.out.println(crud.mostrarProductosUnicos());
                    break;
                case 7:
                    System.out.println();
                    System.out.println(crud.ordenarPorPrecioAscendente());
                    break;
                case 8:
                    System.out.println();
                    System.out.println(crud.ordenarPorPrecioDescendente());
                    break;
                case 9:
                    System.out.println();
                    System.out.println(crud.mostrarProductosConDetalles());
                    break;
                case 10:
                    System.out.println();
                    System.out.println(crud.tresProductosMasEconomicos());
                    break;
                case 11:
                    System.out.println();
                    System.out.println(crud.omitirProductosEconomicos());
                    break;
                case 12:
                    System.out.println();
                    System.out.println(crud.mostrarProductosHasta100());
                    break;
                case 13:
                    System.out.println();
                    System.out.println(crud.omitirHastaEncontrarProductoCaro());
                    break;
                case 14:
                    System.out.println();
                    System.out.println(crud.recogerTodosLosProductos());
                    break;
                default:
                    System.out.println("Opción inexistente, intentelo de nuevo.");
                    break;
            }
        } while (opcion != 0);

        sc.close();
    }
}
