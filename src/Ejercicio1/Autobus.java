package Ejercicio1;

import java.util.Scanner;

public class Autobus implements iTransporte {
    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipo;

    /*Implementa la interfaz Transporte.
Atributos: numeroLinea (entero), capacidad (entero), tipo (Ejercicio1.TipoTransporte).
Métodos: Implementa los métodos definidos en la interfaz y un método adicional para anunciar
la próxima parada (anunciarParada(String parada)).
*/

    public Autobus(int numeroLinea, int capacidad, TipoTransporte tipo) {
        this.numeroLinea = numeroLinea;
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public Autobus(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public Autobus() {
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ejercicio1.Autobus{" +
                "numeroLinea=" + numeroLinea +
                ", capacidad=" + capacidad +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void arrancar() {
        System.out.println("El autobus "+tipo+ " de la linea" +numeroLinea+" esta arrancando!");
    }

    @Override
    public void detener() {
        System.out.println("El autobus "+tipo+ " de la linea" +numeroLinea+" se detuvo!");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public String anunciarParada(String parada){
        return "Siguiente parada: "+parada;
    }

    public void cargarDatosAutobus (Scanner entrada){
        entrada.nextLine();
        System.out.println("CARGAR DATOS DEL AUTOBUS");
        System.out.print("Ingrese el numero de linea: ");
        this.numeroLinea= entrada.nextInt();
        System.out.print("Ingrese la capacidad: ");
        this.capacidad= entrada.nextInt();
    }

}
