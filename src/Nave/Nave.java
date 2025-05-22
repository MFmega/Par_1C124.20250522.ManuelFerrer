package Nave;


public abstract class Nave implements Comparable<Nave> {
    protected String nombre;
    protected int capacidadTripulantes;
    protected int anioLanzamiento;


    public Nave(String nombre, int capacidadTripulantes, int anioLanzamiento) {
        this.nombre = nombre;
        this.capacidadTripulantes = capacidadTripulantes;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void iniciarMision() {}

    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {return true;}
        if (!(objeto instanceof Nave)) {return false;}

        Nave objNave = (Nave) objeto;
        return this.nombre.equals(objNave.nombre) && this.anioLanzamiento == objNave.anioLanzamiento;
    }
    @Override
    public int compareTo(Nave otraNave) {
        return this.nombre.compareToIgnoreCase(otraNave.nombre);
    }

    public int getCapacidadTripulantes() {
        return capacidadTripulantes;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
}

