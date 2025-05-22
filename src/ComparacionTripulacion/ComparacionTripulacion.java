package ComparacionTripulacion;

import Nave.Nave;

import java.util.Comparator;


public class ComparacionTripulacion implements Comparator<Nave> {

    @Override
    public int compare(Nave n1, Nave n2) {
        return Integer.compare(n2.getCapacidadTripulantes(), n1.getCapacidadTripulantes());
    }
}

