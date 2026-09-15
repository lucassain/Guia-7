package Ejercicio3;

public class Autobus implements iVehiculoPasajeros{
    private String marca;
    private String modelo;
    private float velocidadMaxima;
    private int cantidadPasajeros;

    public Autobus(String marca, String modelo, float velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Autobus() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Autobus{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", cantidadPasajeros=" + cantidadPasajeros +
                '}';
    }

    @Override
    public void encender() throws InterruptedException {
        System.out.println("Ch-ch-ch-ch o cre-cre-cre (El autobus esta encendiendo...)");
        Thread.sleep(500);
        System.out.println();
        System.out.println("¡RUMMMMMM-BRRRRRRR! (Autobus encendido!)");
    }

    @Override
    public void acelerar() {
        System.out.println("¡BZZZZZZ-RUMMMMMM!  (Autobus acelerando)");
    }

    @Override
    public void frenar() throws InterruptedException {
        System.out.println("¡PSSSHHH-RUMMMMM! (Autobus frenando)");
        Thread.sleep(500);
        System.out.println("El autobus ha frenado.");
    }

    @Override
    public int definirCantPasajeros(int cantidadPasajeros) {
        if (cantidadPasajeros>30){
            System.out.println("Limite de pasajeros excedido (max 30)");
            this.cantidadPasajeros=30;
        }else {
            this.cantidadPasajeros=cantidadPasajeros;
        }
        System.out.println("Cantidad de pasajeros asignados: "+cantidadPasajeros);
        return this.cantidadPasajeros;
    }
}
