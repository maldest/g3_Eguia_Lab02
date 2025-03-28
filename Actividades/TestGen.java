package Actividades;


public class TestGen {
    public static void main(String[] args) {
        String[] v = {"Perez", "Sanchez", "Rodriguez"};
        Integer[] w = {12, 34, 56};

        System.out.println(Utils.exist(v, "Sanchez"));  // true
        System.out.println(Utils.exist(w, 12));         // true
        System.out.println(Utils.exist(w, "Salas"));    // Error de compilación
    }
}
