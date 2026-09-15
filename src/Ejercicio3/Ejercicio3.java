package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void ejecutar(Scanner entrada) throws InterruptedException {
        int opcionVehiculo;

        do {
            System.out.println("\n--- SIMULADOR DE VEHÍCULO ---");
            System.out.println("1. AUTOMOVIL | 2. AUTOBUS | 3. CAMION | 4. BICICLETA | 0. VOLVER");
            opcionVehiculo = entrada.nextInt();

            // Usamos la interfaz madre como variable genérica
            iVehiculo vehiculo = null;

            switch (opcionVehiculo) {
                case 0:
                    System.out.println("Saliendo...");
                    break;

                case 1:
                    vehiculo = crearAutomovil(entrada); // Guardamos la instancia
                    break;

                case 2:
                    vehiculo = crearAutobus(entrada);
                    break;

                case 3:
                    vehiculo = crearCamion(entrada);
                    break;

                case 4:
                    vehiculo = crearBicicleta(entrada);
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese otra opción.");
                    break;
            }

            if (vehiculo != null) {
                menuAcciones(entrada, vehiculo);
            }

        } while (opcionVehiculo != 0);
    }

    public static Automovil crearAutomovil(Scanner entrada) {
        return new Automovil("Escort", "Ford Escort MK IV", 200);
    }

    public static Autobus crearAutobus(Scanner entrada) {
        return new Autobus("Mercedes-Benz", "Mercedes-Benz Bus año 2026", 150);
    }

    public static Camion crearCamion(Scanner entrada) {
        return new Camion("Ford", "Camión Ford año 2024", 180);
    }

    public static Bicicleta crearBicicleta(Scanner entrada) {
        return new Bicicleta("Raleigh", "Raleigh modelo 2025", 50);
    }

    public static void menuAcciones(Scanner entrada, iVehiculo vehiculo) throws InterruptedException {
        int accion;
        do {
            System.out.println("\n--- MENÚ DE ACCIONES ---");
            System.out.println("1. ENCENDER | 2. ACELERAR | 3. FRENAR | 4. DEFINIR PASAJEROS/CARGA | 5. VER DATOS | 0. VOLVER");
            accion = entrada.nextInt();

            switch (accion) {
                case 0:
                    System.out.println("Volviendo al menú de selección...");
                    break;

                case 1:
                    vehiculo.encender();
                    break;

                case 2:
                    vehiculo.acelerar();
                    break;

                case 3:
                    vehiculo.frenar();
                    break;

                case 4:
                    if (vehiculo instanceof Bicicleta) {
                        System.out.println("La bicicleta posee 1 pasajero por default.");
                    } else if (vehiculo instanceof iVehiculoPasajeros) {
                        iVehiculoPasajeros vehiculoPasajeros = (iVehiculoPasajeros) vehiculo;
                        System.out.print("Ingrese la cantidad de pasajeros: ");
                        int pasajeros = entrada.nextInt();
                        vehiculoPasajeros.definirCantPasajeros(pasajeros);
                    } else if (vehiculo instanceof iVehiculoDeCarga) {
                        iVehiculoDeCarga vehiculoDeCarga = (iVehiculoDeCarga) vehiculo;
                        System.out.print("Ingrese la carga (en kg): ");
                        double carga = entrada.nextDouble();
                        vehiculoDeCarga.definirCarga(carga);
                    }
                    break;

                case 5:
                    System.out.println(vehiculo);
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese otra opción.");
                    break;
            }

        } while (accion != 0);
    }
}