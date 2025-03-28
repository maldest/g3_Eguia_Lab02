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

        //crea la bolsa y establece el maximo por teclado
        System.out.print("Ingrese el límite de la bolsa de Chocolatinas (ya hay 1 creada): ");
        int limiteChoco = scanner.nextInt();
        scanner.nextLine(); 

        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(limiteChoco + 1); //+1 porque ya hay una creada
        bolsaCho.add(new Chocolatina("Milka")); //chocolatina predeterminada

        //Ingresar Chocolatinas manualmente
        for (int i = 0; i < limiteChoco; i++) {
            System.out.print("Ingrese la marca de la Chocolatina " + (i + 1) + ": ");
            String marca = scanner.nextLine();
            bolsaCho.add(new Chocolatina(marca));
        }

        System.out.println("========================================");

        //Cre el limite de golosinas por teclado
        System.out.print("Ingrese el límite de la bolsa de Golosinas (ya hay 1 creada): ");
        int limiteGolo = scanner.nextInt();
        scanner.nextLine(); 

        Bolsa<Golosina> bolsaGol = new Bolsa<>(limiteGolo + 1); 
        bolsaGol.add(new Golosina("Gomitas", 50.5)); //golosina predeterminada

        //Ingresar Golosinas por teclado
        for (int i = 0; i < limiteGolo; i++) {
            System.out.print("Ingrese el nombre de la Golosina " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el peso de la Golosina " + (i + 1) + " en gramos: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Limpiar el buffer

            bolsaGol.add(new Golosina(nombre, peso));
        }

        System.out.println("\n========================================");
        System.out.println("        CONTENIDO DE LAS BOLSAS        ");
        System.out.println("========================================");

        //mostrar contenido de la bolsa de Chocolatinas
        System.out.println("\nBolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println("- " + chocolatina.getMarca());
        }

        //mostrar contenido de la bolsa de Golosinas
        System.out.println("\nBolsa de Golosinas:");
        for (Golosina golosina : bolsaGol) {
            System.out.println("- " + golosina.getNombre() + " (Peso: " + golosina.getPeso() + "g)");
        }

        scanner.close();
    }
}

/*
SALIDA:

Ingrese el límite de la bolsa de Chocolatinas (ya hay 1 creada): 2
Ingrese la marca de la Chocolatina 1: papas
Ingrese la marca de la Chocolatina 2: avena
========================================
Ingrese el límite de la bolsa de Golosinas (ya hay 1 creada): 1
Ingrese el nombre de la Golosina 1: mani
Ingrese el peso de la Golosina 1 en gramos: 20

========================================
        CONTENIDO DE LAS BOLSAS
========================================

Bolsa de Chocolatinas:
- Milka
- papas
- avena

Bolsa de Golosinas:
- Gomitas (Peso: 50.5g)
- mani (Peso: 20.0g)
 * 
 */