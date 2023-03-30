package simulador;
import editor.Ambiente;

public class Personaje{
    Ambiente actual;

    public Personaje(Ambiente a){
        this.actual = a;
    }

    public Personaje (){
        this.actual = null; 
    }
    
    public void setAmbienteActual(Ambiente a){
        this.actual = a; 
    }
}
