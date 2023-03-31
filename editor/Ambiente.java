package editor;
import java.util.ArrayList;

public class Ambiente extends Entorno {
    ArrayList<Elemento> elementos; 

    public Ambiente(String nombre){
        super(nombre);
        elementos = new ArrayList<>();
    }

    public Entorno getAmbiente(){
        return this; 
    }

    public void setElementos(Elemento e) {
        elementos.add(e);
    }
}
