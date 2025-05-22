package Carguero;

import Nave.Nave;

public class Carguero extends Nave {
    private int capacidadCarga;

    public Carguero(String nombre, int capacidadTripulantes, int anioLanzamiento, int capacidadCarga) {
        super(nombre, capacidadTripulantes, anioLanzamiento);
        this.capacidadCarga = capacidadCarga;
    }


    @Override
    public String toString() {
        return "\nNombre de Carguero:"+this.nombre+"\nCapacidad Tripulantes:"+this.capacidadTripulantes+"\nAnio de Lanzamiento:"+this.anioLanzamiento
                +"\nCapacidad de carga:"+this.capacidadCarga;

    }
    @Override
    public void iniciarMision() {
        System.out.println("Iniciando Mision de Exploracion de Carguero "+this.nombre);
    }
}

