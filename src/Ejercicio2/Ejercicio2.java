package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void ejecutar(Scanner entrada) {
        int opcionAnimal;

        do {
            System.out.println("\n--- SIMULADOR DEL BOSQUE MÁGICO ---");
            System.out.println("1. PATO | 2. MURCIÉLAGO | 3. PEZ | 0. VOLVER");
            opcionAnimal = entrada.nextInt();

            // Usamos la clase abstracta Animal como tipo general
            Animal animal = null;

            switch (opcionAnimal) {
                case 0:
                    System.out.println("Volviendo al menú principal...");
                    break;

                case 1:
                    animal = crearPato();
                    break;

                case 2:
                    animal = crearMurcielago();
                    break;

                case 3:
                    animal = crearPez();
                    break;

                default:
                    System.out.println("Opción inválida. Ingrese otra opción.");
                    break;
            }

            // Si se seleccionó un animal válido, ejecutamos las acciones
            if (animal != null) {
                menuAcciones(animal, entrada);
            }

        } while (opcionAnimal != 0);
    }

    private static Pato crearPato() {
        return new Pato("Donald el Pato");
    }

    private static Murcielago crearMurcielago() {
        return new Murcielago("Batty el Murciélago");
    }

    private static Pez crearPez() {
        return new Pez("Nemo el Pez");
    }

    public static void menuAcciones(Animal animal, Scanner entrada) {
        int accion;
        do {
            System.out.println("\nACCIONES DISPONIBLES PARA " + animal.getNombre() + ":");
            System.out.println("1. COMER | 2. DORMIR | 3. HACER SONIDO FELIZ | 4. HACER SONIDO EN PELIGRO | 5. PROBAR HABILIDADES | 0. VOLVER");
            accion = entrada.nextInt();

            switch (accion) {
                case 1:
                    animal.comer();
                    break;

                case 2:
                    animal.dormir();
                    break;

                case 3:
                    animal.emitirSonidoFeliz();
                    break;

                case 4:
                    animal.emitirSonidoPeligro();
                    break;

                case 5:
                    probarHabilidades(animal);
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

    private static void probarHabilidades(Animal animal) {
        System.out.println("\n--- PROBANDO HABILIDADES ---");

        if (animal instanceof iVolador) {
            iVolador v = (iVolador) animal;
            v.volar();
        }

        if (animal instanceof iNadador) {
            iNadador n = (iNadador) animal;
            n.nadar();
        }

        if (animal instanceof Murcielago) {
            Murcielago m = (Murcielago) animal;
            m.colgarBocaAbajo();
        }
    }
}