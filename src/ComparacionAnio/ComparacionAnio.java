package ComparacionAnio;

import Nave.Nave;

import java.util.Comparator;

public class ComparacionAnio implements Comparator<Nave> {

    @Override
    public int compare(Nave n1, Nave n2) {
        return Integer.compare(n2.getAnioLanzamiento(), n1.getAnioLanzamiento());
    }
}
