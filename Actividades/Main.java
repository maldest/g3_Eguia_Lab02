package Actividades;
public class Main {
    public static void main(String[] args) {
        // Crear una bolsa de Chocolatinas con un límite de 3
        Bolsa<Chocolatina> bolsaCho = new Bolsa<>(3);
        try {
            bolsaCho.add(new Chocolatina("Milka"));
            bolsaCho.add(new Chocolatina("Ferrero"));
            bolsaCho.add(new Chocolatina("Nestlé"));
            bolsaCho.add(new Chocolatina("Extra")); // Intento de agregar más elementos
        } catch (RuntimeException e) {
            System.out.println("Error al agregar chocolatina: " + e.getMessage());
        }

        System.out.println("\nContenido de la bolsa de Chocolatinas:");
        for (Chocolatina chocolatina : bolsaCho) {
            System.out.println("Chocolatina marca: " + chocolatina.getMarca());
        }

        // Crear una bolsa de Golosinas con un límite de 2
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


