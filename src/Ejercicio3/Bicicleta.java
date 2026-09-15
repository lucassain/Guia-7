package Ejercicio3;

public class Bicicleta implements iVehiculo{
    private String marca;
    private String modelo;
    private float velocidadMaxima;

    public Bicicleta(String marca, String modelo, float velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public Bicicleta() {
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

    @Override
    public String toString() {
        return "Bicicleta{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                '}';
    }

    @Override
    public void encender() throws InterruptedException {
        System.out.println("Ajustando cascos y desenganchando la traba... (La bici no requiere motor)");
        Thread.sleep(500);
        System.out.println("¡Lista para pedalear! (Bicicleta lista)");
    }

    @Override
    public void acelerar() {
        System.out.println("¡Fiuf-fiuf! (Pedaleando más rápido)");
    }

    @Override
    public void frenar() throws InterruptedException {
        System.out.println("¡Sssssss! (Frenos de disco accionados)");
        Thread.sleep(500);
        System.out.println("La bicicleta se ha detenido.");
    }
}
