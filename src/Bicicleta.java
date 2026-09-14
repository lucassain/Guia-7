import java.util.Scanner;

public class Bicicleta implements iTransporte{

    /*Clase Bicicleta:
Implementa la interfaz Transporte.
Atributos: numeroSerie (cadena de texto), tipo (TipoTransporte).
Métodos: Implementa los métodos definidos en la interfaz y un
método adicional para ajustar la altura del asiento (ajustarAsiento(int altura)).
obtenerCapacidad() devuelve 1 (porque solo tiene capacidad para una persona).
*/

    String numeroSerie;
    TipoTransporte tipo;

    public Bicicleta(String numeroSerie, TipoTransporte tipo) {
        this.numeroSerie = numeroSerie;
        this.tipo = tipo;
    }

    public Bicicleta(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    public Bicicleta() {
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipo() {
        return tipo;
    }

    public void setTipo(TipoTransporte tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "numeroSerie='" + numeroSerie + '\'' +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public void arrancar() {
        System.out.println("La" +tipo+ " arranco");
    }

    @Override
    public void detener() {
        System.out.println("La" +tipo+ " se detuvo");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public void ajustarAsiento (int altura){
        System.out.println("Altura del asiento ajustada!");
        System.out.println("Altura del asiento: "+altura);
    }

    public void cargarDatosBicicleta (Scanner entrada){
        entrada.nextLine();
        System.out.println("CARGAR DATOS DE LA BICICLETA");
        System.out.print("Ingrese el numero de serie : ");
        this.numeroSerie= entrada.nextLine();
    }
}
