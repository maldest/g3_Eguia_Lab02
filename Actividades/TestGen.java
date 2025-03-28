package Actividades;

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