import Ejercicio1.*;
import Ejercicio2.*;
import Ejercicio3.Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("0 para salir.");
            System.out.println("Ejercicio 1: ");
            System.out.println("Ejercicio 2: ");
            System.out.println("Ejercicio 3: ");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 0: {
                    System.out.println("Cerrando programa...");
                    break;
                }

                case 1: {
                    Ejercicio1.ejecutar(entrada);

                    break;
                }

                case 2:{
                    Ejercicio2.ejecutar(entrada);

                    break;
                }

                case 3:{
                    Ejercicio3.ejecutar(entrada);
                    break;
                }

                default: {
                    System.out.println("Opcion invalida. Ingrese otra opcion.");
                }
            }

        } while (opcion != 0);

    }
}