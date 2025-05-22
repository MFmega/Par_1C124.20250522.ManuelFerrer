package Crucero;

import Nave.Nave;

public class Crucero extends Nave {
    public int capacidadPasajeros;

    public Crucero(String nombre, int capacidadTripulantes, int anioLanzamiento, int capacidadPasajeros) {
        super(nombre, capacidadTripulantes, anioLanzamiento);
        this.capacidadPasajeros = capacidadPasajeros;
    }


    @Override
    public String toString() {
        return "\nNombre de Crucero:"+this.nombre+"\nCapacidad Tripulantes:"+this.capacidadTripulantes+"\nAnio de Lanzamiento:"+this.anioLanzamiento
                +"\nCapacidad de pasajeros:"+this.capacidadPasajeros;

    }
    @Override
    public void iniciarMision() {
        System.out.println("El crucero "+this.nombre+" no se reporta para la exploracion del sector");
    }
}
