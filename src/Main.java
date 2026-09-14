import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion;

        do {

            System.out.println("0 para salir.");
            System.out.println("Ejercicio 1: ");
            System.out.println("Ejercicio 2: ");
            System.out.println("Ejercicio 3: ");
            opcion=entrada.nextInt();

            switch (opcion){
                case 0:{
                    System.out.println("Cerrando programa...");
                    break;
                }

                case 1:{

                    int opcionTransporte;
                    do {
                        System.out.println("ELIJA UN TRANSPORTE: ");
                        System.out.println("0 para no elegir ninguno");
                        System.out.println("AUTOBUS (1)");
                        System.out.println("TRANVIA (2)");
                        System.out.println("BICILETA (3)");
                        opcionTransporte=entrada.nextInt();

                        switch (opcionTransporte){

                            case 1:{
                                Autobus autobus= new Autobus(TipoTransporte.AUTOBUS);
                                autobus.cargarDatosAutobus(entrada);
                                System.out.println(autobus);

                                menuAcciones(autobus, entrada);

                                break;
                            }

                            case 2:{
                                Tranvia tranvia= new Tranvia(TipoTransporte.TRANVIA);
                                tranvia.cargarDatosTranvia(entrada);
                                System.out.println(tranvia);

                                menuAcciones(tranvia, entrada);

                                break;
                            }

                            case 3:{
                                Bicicleta bici= new Bicicleta(TipoTransporte.BICILETA);
                                bici.cargarDatosBicicleta(entrada);
                                System.out.println(bici);

                                menuAcciones(bici, entrada);

                                break;
                            }

                            default:{
                                System.out.println("Opcion invalida. Ingrese otra opcion.");
                                break;
                            }
                        }

                    }while (opcionTransporte!=0);

                    break;
                }

                default:{
                    System.out.println("Opcion invalida. Ingrese otra opcion.");
                }
            }

        }while (opcion!=0);

    }

    public static void menuAcciones(iTransporte transporte, Scanner entrada){
        int accion;
        do {
            System.out.println("ACCIONES DISPONIBLES:");
            System.out.println("1.ARRANCAR | 2.DETENER | 3.VER CAPACIDAD | 4. VER DATOS | 0. VOLVER");
            accion=entrada.nextInt();

            switch (accion) {
                case 1: {
                    transporte.arrancar();
                    break;
                }
                case 2: {
                    transporte.detener();
                    break;
                }
                case 3: {
                    System.out.println("Capacidad: " + transporte.obtenerCapacidad());
                    break;
                }
                case 4: {
                    System.out.println(transporte);
                    break;
                }
                default: {
                    System.out.println("Accion invalida. Ingrese de nuevo");
                    break;
                }

            }

        }while (accion!=0);
    }
}