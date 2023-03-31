package editor;
public abstract class Entorno {
    String nombre; 

    public Entorno(String nombre){
        this.nombre = nombre;
    }
    
    public abstract Entorno getAmbiente();

    public String getNombre() {
        return nombre;
    }
}
