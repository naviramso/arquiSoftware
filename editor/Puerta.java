package editor;
import simulador.Personaje;

public class Puerta extends Elemento{
    Ambiente ambienteDestino;

    public Puerta(Ambiente ambiente){
        this.ambienteDestino=ambiente;
    }

    public Puerta(){}
    
    public void interactuar(Personaje personaje){
        personaje.setAmbienteActual(ambienteDestino);
    }
    
}
