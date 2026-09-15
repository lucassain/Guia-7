package Ejercicio2;

public class Pez extends Animal implements iNadador {

    public Pez(TipoAnimal tipo, String nombre) {
        super(tipo, nombre);
    }

    public Pez(String nombre) {
        super(nombre);
    }

    public Pez() {
    }

    @Override
    public void comer() {
        System.out.println(getNombre()+" esta comiendo.");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre()+" esta durmiendo.");
    }

    @Override
    public void emitirSonidoFeliz() {
        System.out.println(getNombre()+" esta feliz");
    }

    @Override
    public void emitirSonidoPeligro() {
        System.out.println(getNombre()+" esta en peligro!!!");
    }

    @Override
    public void nadar() {
        System.out.println(getNombre()+" esta nadando.");
    }
}
