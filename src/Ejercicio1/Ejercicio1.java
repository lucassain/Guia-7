package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar(Scanner entrada) {
        int opcionTransporte;

        do {
            System.out.println("\n--- ELIJA UN TRANSPORTE ---");
            System.out.println("1. AUTOBUS | 2. TRANVIA | 3. BICICLETA | 0. VOLVER");
            opcionTransporte = entrada.nextInt();

            // Usamos la interfaz iTransporte como tipo general
            iTransporte transporte = null;

            switch (opcionTransporte) {
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                case 1:
                    transporte = crearAutobus(entrada);
                    break;

                case 2:
                    transporte = crearTranvia(entrada);
                    break;

                case 3:
                    transporte = crearBicicleta(entrada);
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese otra opción.");
                    break;
            }

            // Si se creó un transporte válido, ejecutamos las acciones
            if (transporte != null) {
                System.out.println(transporte);
                menuAcciones(transporte, entrada);
            }

        } while (opcionTransporte != 0);
    }

    private static Autobus crearAutobus(Scanner entrada) {
        Autobus autobus = new Autobus(TipoTransporte.AUTOBUS);
        autobus.cargarDatosAutobus(entrada);
        return autobus;
    }

    private static Tranvia crearTranvia(Scanner entrada) {
        Tranvia tranvia = new Tranvia(TipoTransporte.TRANVIA);
        tranvia.cargarDatosTranvia(entrada);
        return tranvia;
    }

    private static Bicicleta crearBicicleta(Scanner entrada) {
        Bicicleta bici = new Bicicleta(TipoTransporte.BICILETA);
        bici.cargarDatosBicicleta(entrada);
        return bici;
    }

    public static void menuAcciones(iTransporte transporte, Scanner entrada) {
        int accion;
        do {
            System.out.println("\nACCIONES DISPONIBLES:");
            System.out.println("1.ARRANCAR | 2.DETENER | 3.VER CAPACIDAD | 4. VER DATOS | 0. VOLVER");
            accion = entrada.nextInt();

            switch (accion) {
                case 1:
                    transporte.arrancar();
                    break;
                case 2:
                    transporte.detener();
                    break;
                case 3:
                    System.out.println("Capacidad: " + transporte.obtenerCapacidad());
                    break;
                case 4:
                    System.out.println(transporte);
                    break;
                case 0:
                    System.out.println("Volviendo...");
                    break;
                default:
                    System.out.println("Acción inválida. Ingrese de nuevo.");
                    break;
            }

        } while (accion != 0);
    }
}