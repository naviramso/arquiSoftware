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
        Escenario pb = new Escenario();
        Escenario p2 = new Escenario();
        Ambiente bibliotecaPB = new Ambiente("pb");
        Ambiente bibliotecaP2 = new Ambiente("p2");
        Ambiente prestamosLibros = new Ambiente("prestamos de libros");
        Ambiente oficinaAdministrativa = new Ambiente("oficina administrativa");
        ((Escenario) escenarioDePrueba).setEntorno(p2);
        ((Escenario) escenarioDePrueba).setEntorno(pb);
        pb.setEntorno(prestamosLibros);
        pb.setEntorno(bibliotecaPB);
        p2.setEntorno(bibliotecaP2);
        p2.setEntorno(oficinaAdministrativa);
        Elemento puerta1 = new Puerta();
        Elemento puerta2 = new Puerta(prestamosLibros);
        Elemento puerta3 = new Puerta(bibliotecaP2);
        Elemento puerta4 = new Puerta(oficinaAdministrativa);
        Elemento puerta5 = new Puerta(bibliotecaPB);
        bibliotecaPB.setElementos(puerta1);
        bibliotecaPB.setElementos(puerta1);
        bibliotecaPB.setElementos(puerta2);
        bibliotecaPB.setElementos(puerta3);
        bibliotecaP2.setElementos(puerta4);
        bibliotecaP2.setElementos(puerta1);
        bibliotecaP2.setElementos(puerta5);
        return escenarioDePrueba;
    }
}
