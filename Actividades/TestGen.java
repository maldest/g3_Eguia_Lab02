package Actividades;

/*
public class TestGen {
    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(Utils.exist(v, "Sanchez"));  // true
        System.out.println(Utils.exist(w, 12));         // true
        System.out.println(Utils.exist(w, "Salas"));    // Error de compilación
    }
}
 */

 /*
public class TestGen {
    public static void main(String[] args) {
        Golosina[] golosinas = {
            new Golosina("Caramelo", 10.5),
            new Golosina("Chocolate", 25.0)
        };

        Chocolatina[] chocolatinas = {
            new Chocolatina("Milka"),
            new Chocolatina("Ferrero")
        };

        System.out.println(Utils.exist(golosinas, new Golosina("Caramelo", 10.5))); // true
        System.out.println(Utils.exist(golosinas, new Golosina("Chicle", 5.0)));    // false
        System.out.println(Utils.exist(chocolatinas, new Chocolatina("Ferrero")));  // true
        System.out.println(Utils.exist(chocolatinas, new Chocolatina("Snickers"))); // false
    }
}
*/

public class TestGen {
    public static void main(String[] args) {
        // creacion de cajoneria de golosinas
        Cajoneria<Golosina> cajonGolosinas = new Cajoneria<>();
        cajonGolosinas.addCaja(new Caja<>("Rojo", new Golosina("Caramelo", 10.5)));
        cajonGolosinas.addCaja(new Caja<>("Azul", new Golosina("Chocolate", 25.0)));
        cajonGolosinas.addCaja(new Caja<>("Verde", new Golosina("Gomita", 5.0)));
        cajonGolosinas.addCaja(new Caja<>("Amarillo", new Golosina("Chicle", 8.0)));
        cajonGolosinas.addCaja(new Caja<>("Naranja", new Golosina("Malvavisco", 12.3)));

        // mostrar contenido antes de buscar y eliminar
        System.out.println("Cajoneria de Golosinas:");
        System.out.println(cajonGolosinas);

        // buscar golosinas
        System.out.println("\nBuscando golosinas...");
        System.out.println(cajonGolosinas.search(new Golosina("Chocolate", 25.0))); // debe encontrarlo
        System.out.println(cajonGolosinas.search(new Golosina("Caramelo", 10.5))); // debe encontrarlo
        System.out.println(cajonGolosinas.search(new Golosina("Menta", 15.0)));    // no debe encontrarlo

        // borrar una golosina
        System.out.println("\nEliminando golosina 'Chocolate'...");
        Golosina eliminada = cajonGolosinas.delete(new Golosina("Chocolate", 25.0));
        if (eliminada != null) {
            System.out.println("Se eliminó: " + eliminada);
        } else {
            System.out.println("No se encontró el objeto para eliminar.");
        }

        // mostrar contenido después de eliminar
        System.out.println("\nCajoneria de Golosinas después de eliminar:");
        System.out.println(cajonGolosinas);

        // creacion de cajoneria de chocolatinas
        Cajoneria<Chocolatina> cajonChocolatinas = new Cajoneria<>();
        cajonChocolatinas.addCaja(new Caja<>("Amarillo", new Chocolatina("Milka")));
        cajonChocolatinas.addCaja(new Caja<>("Naranja", new Chocolatina("Ferrero")));
        cajonChocolatinas.addCaja(new Caja<>("Rojo", new Chocolatina("Snickers")));
        cajonChocolatinas.addCaja(new Caja<>("Azul", new Chocolatina("KitKat")));
        cajonChocolatinas.addCaja(new Caja<>("Verde", new Chocolatina("Toblerone")));

        // mostrar contenido antes de buscar y eliminar
        System.out.println("\nCajoneria de Chocolatinas:");
        System.out.println(cajonChocolatinas);

        // buscar chocolatinas
        System.out.println("\nBuscando chocolatinas...");
        System.out.println(cajonChocolatinas.search(new Chocolatina("Milka"))); // debe encontrarlo
        System.out.println(cajonChocolatinas.search(new Chocolatina("KitKat"))); // debe encontrarlo
        System.out.println(cajonChocolatinas.search(new Chocolatina("Kinder"))); // no debe encontrarlo

        // borrar una chocolatina
        System.out.println("\nEliminando chocolatina 'Ferrero'...");
        Chocolatina eliminadaChoco = cajonChocolatinas.delete(new Chocolatina("Ferrero"));
        if (eliminadaChoco != null) {
            System.out.println("Se eliminó: " + eliminadaChoco);
        } else {
            System.out.println("No se encontró el objeto para eliminar.");
        }

        // mostrar contenido después de eliminar
        System.out.println("\nCajoneria de Chocolatinas después de eliminar:");
        System.out.println(cajonChocolatinas);
    }
}
