package Actividades;

/* 
public class Main {
    public static void main(String[] args) {
        //crea una bolsa de Chocolatinas con un límite de 3
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);
        try {
            bolsaCho.add(new Chocolatina("Milka"));
            bolsaCho.add(new Chocolatina("Ferrero"));
            bolsaCho.add(new Chocolatina("Nestlé"));
            bolsaCho.add(new Chocolatina("PRUEBA")); //intento de agregar más elementos
        } catch (RuntimeException e) {
            System.out.println("Error al agregar chocolatina: " + e.getMessage());
        }

        System.out.println("\nContenido de la bolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println("Chocolatina marca: " + chocolatina.getMarca());
        }

        //crear una bolsa de Golosinas con un límite de 2
        Bolsa<Golosina> bolsaGol = new Bolsa<>(2);
        try {
            bolsaGol.add(new Golosina("Gomitas", 50.5));
            bolsaGol.add(new Golosina("Caramelo", 30.0));
            bolsaGol.add(new Golosina("Extra", 20.0)); // Intento de agregar más elementos
        } catch (RuntimeException e) {
            System.out.println("Error al agregar golosina: " + e.getMessage());
        }

        System.out.println("\nContenido de la bolsa de Golosinas:");
        for (Golosina golosina : bolsaGol) {
            System.out.println("Golosina: " + golosina.getNombre() + " - Peso: " + golosina.getPeso() + "g");
        }
    }
}
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una bolsa de Chocolatinas con un límite definido por el usuario
        System.out.print("Ingrese el límite de la bolsa de Chocolatinas: ");
        int limiteChoco = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(limiteChoco);

        // Ingresar Chocolatinas manualmente
        for (int i = 0; i < limiteChoco; i++) {
            System.out.print("Ingrese la marca de la Chocolatina " + (i + 1) + ": ");
            String marca = scanner.nextLine();
            bolsaCho.add(new Chocolatina(marca));
        }

        // Línea divisoria antes de ingresar las golosinas
        System.out.println("========================================");

        // Crear una bolsa de Golosinas con un límite definido por el usuario
        System.out.print("Ingrese el límite de la bolsa de Golosinas: ");
        int limiteGolo = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        Bolsa<Golosina> bolsaGol = new Bolsa<>(limiteGolo);

        // Ingresar Golosinas manualmente
        for (int i = 0; i < limiteGolo; i++) {
            System.out.print("Ingrese el nombre de la Golosina " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el peso de la Golosina " + (i + 1) + " en gramos: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            bolsaGol.add(new Golosina(nombre, peso));
        }

        // Línea divisoria antes de mostrar los resultados
        System.out.println("\n========================================");
        System.out.println("        CONTENIDO DE LAS BOLSAS        ");
        System.out.println("========================================");

        // Mostrar contenido de la bolsa de Chocolatinas
        System.out.println("\nBolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println("- " + chocolatina.getMarca());
        }

        // Mostrar contenido de la bolsa de Golosinas
        System.out.println("\nBolsa de Golosinas:");
        for (Golosina golosina : bolsaGol) {
            System.out.println("- " + golosina.getNombre() + " (Peso: " + golosina.getPeso() + "g)");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

/*
SALIDA:

Ingrese el límite de la bolsa de Chocolatinas: 1
Ingrese la marca de la Chocolatina 1: a
========================================
Ingrese el límite de la bolsa de Golosinas: 1
Ingrese el nombre de la Golosina 1: b
Ingrese el peso de la Golosina 1 en gramos: 12

========================================
        CONTENIDO DE LAS BOLSAS
========================================

Bolsa de Chocolatinas:
- a

Bolsa de Golosinas:
- b (Peso: 12.0g)
 * 
 */