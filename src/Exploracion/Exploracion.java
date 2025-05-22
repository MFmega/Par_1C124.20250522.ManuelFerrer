package Exploracion;

import Nave.Nave;

public class Exploracion extends Nave {
    private TipoMision mision;


    public Exploracion(String nombre, int capacidadTripulantes, int anioLanzamiento, TipoMision misiones) {
        super(nombre, capacidadTripulantes, anioLanzamiento);
        this.mision = misiones;
    }

    @Override
    public String toString() {
        return "\nNombre del Explorador Espacial:"+this.nombre+"\nCapacidad Tripulantes:"+this.capacidadTripulantes+"\nAnio de Lanzamiento:"+this.anioLanzamiento
                +"\nTipo de mision:"+this.mision;

    }
    @Override
    public void iniciarMision() {
        System.out.println("Iniciando Mision de Exploracion del Explorador "+this.nombre);
    }
}
