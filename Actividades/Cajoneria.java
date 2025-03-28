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
