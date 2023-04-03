package simulador;

import editor.Ambiente;
import editor.Elemento;
import editor.Puerta;

public class Personaje{
    private Ambiente actual;

    public Personaje(Ambiente a){
        this.actual = a;
    }

    public Personaje (){
        this.actual = null; 
    }
    
    public void setAmbienteActual(Ambiente a){
        this.actual = a; 
    }
 
    public void interactuarElemento(){
        for (Elemento e : actual.geElementos()) {
            System.out.println(actual.getNombre());
            e.interactuar(this);
        } 
    }

    public Ambiente getAmbienteActual(){
        return actual; 
    }

}
