package Sistema;

import Nave.Nave;
import Carguero.Carguero;
import Exploracion.Exploracion;
import Crucero.Crucero;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Nave> naves;

    public ArrayList<Nave> getNaves() {
        return naves;
    }

    public Sistema() {
        this.naves = new ArrayList<Nave>();
    }

    public void agregarNave(Nave nave) {
        if (!naves.contains(nave)) {naves.add(nave);
        } else {
            System.out.println("Nave ya catalogada en registro intergalactico");
        }

    }

    public void mostrarNaves() {
        for (Nave nave : naves) {
            if (nave instanceof Carguero) {
                Carguero navCar = (Carguero) nave;
                System.out.println(navCar.toString());
            } else if (nave instanceof Exploracion) {
                Exploracion navEx = (Exploracion) nave;
                System.out.println(navEx.toString());
            } else if (nave instanceof Crucero) {
                Crucero navCr = (Crucero) nave;
                System.out.println(navCr.toString());
            }
        }
    }

    public void comenzarExploracion() {
        for (Nave nave : naves) {
            if (nave instanceof Carguero) {
                Carguero navCar = (Carguero) nave;
                navCar.iniciarMision();}
            else if (nave instanceof Exploracion) {
                    Exploracion navEx = (Exploracion) nave;
                    navEx.iniciarMision();}
            else if (nave instanceof Crucero) {
                    Crucero navCr = (Crucero) nave;
                    navCr.iniciarMision();}
            }
        }

    }



