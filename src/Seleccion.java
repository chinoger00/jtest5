public abstract class Seleccion {
    protected Integer id;
    protected String nombre;
    protected String apellidos;
    protected Integer edad;

    public Seleccion(){}
    public Seleccion(Integer id, String nombre, String apellidos, Integer edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void viajar(){
        System.out.println("Viajar (Clase  Padre)");
    }

    public void concentrarse(){
        System.out.println("Concentrarse (Clase Padre)");
    }

    public abstract void entrenamiento();

    public void partido(){
        System.out.println("Asiste al partido (Clase Padre)");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
