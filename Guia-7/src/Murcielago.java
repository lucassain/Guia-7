public class Murcielago extends Animal implements iVolador{

    public Murcielago(TipoAnimal tipo, String nombre) {
        super(tipo, nombre);
    }

    public Murcielago() {
    }

    @Override
    public void comer() {
        System.out.println(getNombre()+" esta comiendo");
    }

    @Override
    public void dormir() {
        System.out.println(getNombre()+" esta durmiendo...");
    }

    @Override
    public void emitirSonidoFeliz() {
        System.out.println("¡Chirp! ¡Chirp!(" +getNombre()+ " esta feliz)");
    }

    @Override
    public void emitirSonidoPeligro() {
        System.out.println("¡Screeech! (" +getNombre()+ " se siente en peligro)");
    }


    @Override
    public void volar() {
        System.out.println(getNombre()+ " esta volando!");
    }

    public void colgarBocaAbajo(){
        System.out.println(getNombre()+"esta colgado boca abajo en la cueva");
    }


}
