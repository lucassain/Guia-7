package Ejercicio3;

public class Camion implements iVehiculoDeCarga{

    private String marca;
    private String modelo;
    private float velocidadMaxima;
    private double carga;

    public Camion(String marca, String modelo, float velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Camion() {
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

    public double getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", carga=" + carga +
                '}';
    }

    @Override
    public void encender() throws InterruptedException {
        System.out.println("Ch-ch-ch-ch o cre-cre-cre (El camion esta encendiendo...)");
        Thread.sleep(500);
        System.out.println();
        System.out.println("¡RUMMMMMM-BRRRRRRR! (Camion encendido!)");
    }

    @Override
    public void acelerar() {
        System.out.println("¡BZZZZZZ-RUMMMMMM!  (Camion acelerando)");
    }

    @Override
    public void frenar() throws InterruptedException {
        System.out.println("¡PSSSHHH-RUMMMMM! (Camion frenando)");
        Thread.sleep(500);
        System.out.println("El Camion ha frenado.");
    }

    @Override
    public double definirCarga(double carga) {

        if (carga>100000){
            System.out.println("Limite de peso excedido (Max 100000)");
            this.carga=100000;
        }else {
            this.carga=carga;
        }
        System.out.println("Se le han asignado "+this.carga+"kg al Camion");
        return this.carga;
    }
}
