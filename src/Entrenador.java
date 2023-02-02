public class Entrenador extends Seleccion{

    public Entrenador(Integer id, String nombre, String apellidos, Integer edad){
        super(id, nombre, apellidos, edad);
    }

    @Override
    public void entrenamiento() {
        System.out.println("Entrenamiento Entrenador");
    }
}
