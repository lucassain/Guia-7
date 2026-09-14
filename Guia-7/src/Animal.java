public abstract class Animal{
    private TipoAnimal tipo;
    private String nombre;

    public Animal(TipoAnimal tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public Animal() {
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    public void setTipo(TipoAnimal tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void comer();
    public abstract void dormir();
    public abstract void emitirSonidoFeliz();
    public abstract void emitirSonidoPeligro();


}
