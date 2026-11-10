package EjemploPila1;

import java.util.Scanner;

public class VistaPila {

    Scanner teclado = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("\n--- MENU DE OPCIONES ---");
        System.out.println("1. Poner elemento en la Pila");
        System.out.println("2. Quitar elemento de la Pila");
        System.out.println("3. Mostrar elementos de la Pila");
        System.out.println("4. Salir");
        System.out.print("Selecciona una opcion: ");
    }

    public int leerOpcion() {
        return teclado.nextInt();
    }

    public String leerNombre() {
        System.out.print("Ingresa el nombre: ");
        return teclado.next();
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}



