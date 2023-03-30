package editor;
import java.util.ArrayList;

public class Escenario extends Entorno{
    ArrayList<Entorno> entornos;
    
    public Entorno getAmbiente(){
        Entorno aux=null;
        int i=0;
        if(entornos ==null){return aux;}
        while (aux==null || i<entornos.size()){
            
            if(entornos.get(i) instanceof Ambiente ){
                aux = entornos.get(i);
            }
            else {
                 aux = entornos.get(i).getAmbiente();
            }
            i++;
        }
        return aux;
    }
}
