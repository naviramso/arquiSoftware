package editor;
import java.util.ArrayList;

public class Ambiente extends Entorno {
    ArrayList<Elemento> elementos; 

    public Ambiente(){
    }

    public Entorno getAmbiente(){
        return this; 
    }
}
