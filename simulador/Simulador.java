package simulador;
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
        if(aux ==null){
            System.out.println("no hay ambientes");
        }
        else {
            System.out.print("se encontro ambiente");
        }
    }

}
