package Ejercicio3;

import static java.lang.Thread.sleep;

public class Automovil implements iVehiculoPasajeros{
    private String marca;
    private String modelo;
    private float velocidadMaxima;
    private int cantidadPasajeros;

    public Automovil(String marca, String modelo, float velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Automovil() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cantidadPasajeros="+cantidadPasajeros+
                '}';
    }

    @Override
    public void encender() throws InterruptedException {
        System.out.println("Ch-ch-ch-ch o cre-cre-cre (El automovil esta encendiendo...)");
        Thread.sleep(500);
        System.out.println();
        System.out.println("¡Vroooom! (Automovil encendido!)");
    }

    @Override
    public void acelerar() {
        System.out.println("¡nyeee-eeee-eeeh! (Automovil acelerando)");
    }

    @Override
    public void frenar() throws InterruptedException {
        System.out.println("¡iiiiiiiiiiih! (Automovil frenando)");
        Thread.sleep(500);
        System.out.println("El automovil ha frenado.");
    }

    @Override
    public int definirCantPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros>5){
            System.out.println("Limite de pasajeros excedido (max 5)");
            this.cantidadPasajeros=5;
        }else {
            this.cantidadPasajeros=cantidadPasajeros;
        }
        System.out.println("Cantidad de pasajeros asignados: "+cantidadPasajeros);
        return this.cantidadPasajeros;
    }
}
