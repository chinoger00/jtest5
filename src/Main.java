import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Seleccion> integrantes = new ArrayList<>();
        Seleccion pedro = new Futbolista(1, "Pedro", "Garcia", 20);
        Seleccion juan = new Entrenador(2, "Juan", "Lopez", 21);
        Seleccion luis = new Masajista(3, "Luis", "Hernandez", 22);

        integrantes.add(pedro);
        integrantes.add(juan);
        integrantes.add(luis);

        integrantes.forEach(x ->
        {
            System.out.println("Integrante: " + x.getNombre() + " " + x.getApellidos() + " Edad: " + x.getEdad());
            x.concentrarse();
            x.viajar();
        }
        );

        for(Seleccion seleccionado : integrantes){
            System.out.println("\n Seleccionado: ");
            seleccionado.entrenamiento();
        }
    }
}