package Actividades;

public class Utils {
    // Método genérico para buscar un elemento en un arreglo
    public static <T> boolean exist(T[] array, T element) {
        for (T item : array) {
            if (item.equals(element)) {
                return true;
            }
        }
        return false;
    }
}
