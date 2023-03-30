import editor.Entorno;
import editor.Editor;
import simulador.Simulador;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        Entorno entorno = editor.getEntorno();
        Simulador simulador = new Simulador(entorno);
        simulador.run();
    }
}