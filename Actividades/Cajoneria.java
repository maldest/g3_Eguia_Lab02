package Actividades;
import java.util.ArrayList;
import java.util.Iterator;

public class Cajoneria<T> implements Iterable<Caja<T>> {
    private ArrayList<Caja<T>> cajas;

    public Cajoneria() {
        this.cajas = new ArrayList<>();
    }

    public void addCaja(Caja<T> caja) {
        cajas.add(caja);
    }

    // metodo para buscar un objeto en la cajoneria
    public String search(T elemento) {
        int posicion = 1;
        for (Caja<T> caja : cajas) {
            if (caja.getContenido().equals(elemento)) {
                return "Encontrado en posición " + posicion + " | Color: " + caja.getColor();
            }
            posicion++;
        }
        return "No encontrado.";
    }

    //meodo para eliminar un objeto de la cajoneria
    public T delete(T elemento) {
        Iterator<Caja<T>> iterator = cajas.iterator();
        while (iterator.hasNext()) {
            Caja<T> caja = iterator.next();
            if (caja.getContenido().equals(elemento)) {
                iterator.remove();
                return caja.getContenido();
            }
        }
        return null;
    }

    @Override
    public Iterator<Caja<T>> iterator() {
        return cajas.iterator();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int posicion = 1;
        sb.append("Posición | Color Caja | Contenido\n");
        for (Caja<T> caja : cajas) {
            sb.append(posicion).append(" | ").append(caja.getColor()).append(" | ").append(caja.getContenido()).append("\n");
            posicion++;
        }
        return sb.toString();
    }
}
