import java.util.Scanner;

public class Tranvia implements iTransporte{
    /*Clase Tranvía:
Implementa la interfaz Transporte.
Atributos: ruta (cadena de texto), capacidad (entero), tipo (TipoTransporte).
Métodos: Implementa los métodos definidos en la interfaz y un método adicional para
cambiar de vía (cambiarVia(int nuevaVia)).
*/

    private String ruta;
    private int capacidad;
    private TipoTransporte tipo;
    private int viaActual;

    public Tranvia(String ruta, int capacidad, TipoTransporte tipo) {
        this.ruta = ruta;
        this.capacidad = capacidad;
        this.tipo = tipo;
        this.viaActual=viaActual;
    }

    public Tranvia(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public Tranvia() {
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
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

    public int getViaActual() {
        return viaActual;
    }

    public void setViaActual(int viaActual) {
        this.viaActual = viaActual;
    }

    @Override
    public String toString() {
        return "Tranvia{" +
                "ruta='" + ruta + '\'' +
                ", capacidad=" + capacidad +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void arrancar() {
        System.out.println("El "+tipo+ "comenzo la ruta de "+ruta+ "!");
    }

    @Override
    public void detener() {
        System.out.println("El" +tipo+ " se detuvo!");
    }

    @Override
    public int obtenerCapacidad() {
        return capacidad;
    }

    public void cambiarVia (int nuevaVia){
        this.viaActual=nuevaVia;
        System.out.println("El "+tipo+ " cambio a la via "+nuevaVia);
    }

    public void cargarDatosTranvia (Scanner entrada){
        entrada.nextLine();
        System.out.println("CARGAR DATOS DEL TRANVIA");
        System.out.print("Ingrese la ruta: ");
        this.ruta= entrada.nextLine();

        System.out.print("Ingrese la capacidad: ");
        this.capacidad= entrada.nextInt();

        System.out.print("Ingrese la via actual: ");
        this.capacidad= entrada.nextInt();
    }


}
