package Menu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import Carguero.Carguero;
import ComparacionAnio.ComparacionAnio;
import ComparacionTripulacion.ComparacionTripulacion;
import Crucero.Crucero;
import Exploracion.*;
import Nave.Nave;
import Sistema.Sistema;

public class Menu {
    public Menu() {
    }

    public void mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        Sistema sistema = new Sistema();
        boolean salir = false;


        while (!salir) {
            System.out.println("\n--- REGISTRO GALACTICO ---");
            System.out.println("1. Agregar Nave");
            System.out.println("2. Mostrar Naves");
            System.out.println("3. Iniciar Exploracion");
            System.out.println("4. Mostrar naves ordenadas por nombre");
            System.out.println("5. Mostrar naves ordenadas por anio de lanzamiento descendente");
            System.out.println("6. Mostrar naves ordenadas por capacidad de tripulacion descendente");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Tipo de Nave:");
                    System.out.println("1. EXPLORACION");
                    System.out.println("2. CARGUERO");
                    System.out.println("3. CRUCERO");
                    int tipo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre de la nave: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Anio de lanzamiento: ");
                    int anioLanzamiento = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Capacidad de tripulantes: ");
                    int capacidadTripulantes = scanner.nextInt();
                    scanner.nextLine();

                    switch (tipo) {
                        case 1:
                            System.out.print("ESPECIFICACIONES DE EXPLORACION\n");
                            TipoMision tipoMision = null;
                            boolean misionDisponible = false;
                            while (!misionDisponible) {
                                try {
                                    System.out.print("MISIONES DISPONIBLES: (CARTOGRAFIA, INVESTIGACION, CONTACTO): ");
                                    String misionElegida = scanner.nextLine();
                                    tipoMision = TipoMision.valueOf(misionElegida.toUpperCase());
                                    misionDisponible = true;
                                } catch (IllegalArgumentException e) {
                                    System.out.println("MISION NO DISPONIBLE ACTUALMENTE. REINTENTE.");
                                }
                            }
                            sistema.agregarNave(new Exploracion(nombre, anioLanzamiento, capacidadTripulantes, tipoMision));
                            break;

                        case 2:
                            System.out.print("ESPECIFICACIONES DE CARGUERO\n)");
                            System.out.print("Capacidad de carga (entre 100 y 500 TONELADAS): ");
                            boolean cargaApropiada = false;
                            int capacidadCarga = 0;
                            while (!cargaApropiada) {
                                capacidadCarga = scanner.nextInt();
                                scanner.nextLine();
                                if (capacidadCarga > 100 && capacidadCarga < 500) {cargaApropiada = true;}
                                else {System.out.println("Carga no valida, reintente entre 100 y 500");}}
                            sistema.agregarNave(new Carguero(nombre, anioLanzamiento, capacidadTripulantes, capacidadCarga));
                            break;

                        case 3:
                            System.out.print("ESPECIFICACIONES DE CRUCERO\n");
                            System.out.print("Capacidad de Pasajeros: ");
                            int capacidadPasajeros = scanner.nextInt();
                            scanner.nextLine();
                            sistema.agregarNave(new Crucero(nombre, anioLanzamiento, capacidadTripulantes, capacidadPasajeros));
                            break;

                        default:
                            System.out.println("Opción no válida.");
                    }
                    break;

                case 2:
                    sistema.mostrarNaves();
                    break;

                case 3:
                    sistema.comenzarExploracion();
                    break;

                case 4:
                    ArrayList<Nave>nave = sistema.getNaves();
                    Collections.sort(nave);
                    for (Nave n : nave) {
                        System.out.println(n.toString());
                    }
                    break;

                case 5:
                    ArrayList<Nave>nave2 = sistema.getNaves();
                    Collections.sort(nave2,new ComparacionAnio());
                    for (Nave n : nave2) {
                        System.out.println(n.toString());
                    }
                    break;

                case 6:
                    ArrayList<Nave>nave3 = sistema.getNaves();
                    Collections.sort(nave3,new ComparacionTripulacion());
                    for (Nave n : nave3) {
                        System.out.println(n.toString());
                    }
                    break;

                case 7:
                    salir = true;
                    System.out.println("Hasta luego! Al infinito y mas alla!");
                    break;

                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }
}