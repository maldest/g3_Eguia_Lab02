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
        //creacion cajoneria golosinas
        Cajoneria<Golosina> cajonGolosinas = new Cajoneria<>();
        cajonGolosinas.addCaja(new Caja<>("Rojo", new Golosina("Caramelo", 10.5)));
        cajonGolosinas.addCaja(new Caja<>("Azul", new Golosina("Chocolate", 25.0)));
        cajonGolosinas.addCaja(new Caja<>("Verde", new Golosina("Gomita", 5.0)));

        //cracion cajoneria chocolatinas
        Cajoneria<Chocolatina> cajonChocolatinas = new Cajoneria<>();
        cajonChocolatinas.addCaja(new Caja<>("Amarillo", new Chocolatina("Milka")));
        cajonChocolatinas.addCaja(new Caja<>("Naranja", new Chocolatina("Ferrero")));

        // mostrar contenido
        System.out.println("Cajoneria de Golosinas:");
        System.out.println(cajonGolosinas);

        System.out.println("Cajoneria de Chocolatinas:");
        System.out.println(cajonChocolatinas);
    }
}
