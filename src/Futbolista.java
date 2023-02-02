public class Futbolista extends Seleccion {

    public Futbolista(Integer id, String nombre, String apellidos, Integer edad){
        super(id, nombre, apellidos, edad);
    }
    @Override
    public void entrenamiento() {
        System.out.println("Entrenamiento Futbolista");
    }

    @Override
    public void viajar(){
        System.out.println("Viaje del Futbolista");
    }
}
