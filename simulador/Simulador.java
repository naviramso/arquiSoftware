package simulador;
import editor.Ambiente;
import editor.Entorno;


public class Simulador {

    Personaje personaje; 
    Entorno entorno; 

    public Simulador(Entorno entorno) {
        this.entorno = entorno; 
        this.personaje = new Personaje();
    }

    public void run()  {
        System.out.println("Corriendo el simulador");
        Entorno aux = entorno.getAmbiente();
        personaje.setAmbienteActual((Ambiente) aux);
        personaje.interactuarElemento();
    }

}
