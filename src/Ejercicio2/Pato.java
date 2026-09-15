package Ejercicio2;

public class Pato extends Animal implements iVolador, iNadador {

    public Pato(TipoAnimal tipo, String nombre) {
        super(tipo, nombre);
    }

    public Pato(String nombre) {
        super(nombre);
    }

    public Pato() {
    }

    @Override
    public void comer() {
        System.out.println(getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre()+" esta durmiendo");
    }

    @Override
    public void emitirSonidoFeliz() {
        System.out.println("¡Cuac, cuac, cuac!("+getNombre()+" esta feliz)");
    }

    @Override
    public void emitirSonidoPeligro() {
        System.out.println("¡¡¡CUA-CUA-CUA!!!("+getNombre()+" esta en peligro)");
    }

    @Override
    public void nadar() {
        System.out.println(getNombre()+" esta nadando.");
    }

    @Override
    public void volar() {
        System.out.println(getNombre()+" esta volando sobre el agua.");
    }
}
