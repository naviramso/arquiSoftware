package editor;

public class Editor {
    Entorno escenarioDePrueba ; 

    public Editor(){
        escenarioDePrueba = new Escenario();
    }

    public Entorno getEntorno() {
        return getEscenarioDePrueba();
    }

    public Entorno getEscenarioDePrueba() {
        return escenarioDePrueba;
    }
}
