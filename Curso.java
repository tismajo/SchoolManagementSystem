public class Curso {
    private int id;
    private String nombre;
    private String descripcion;
    private int numeroCreditos;
    private String version;

    public Curso(int id, String nombre, String descripcion, int numeroCreditos, String version) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.numeroCreditos = numeroCreditos;
        this.version = version;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroCreditos() {
        return numeroCreditos;
    }

    public String getVersion() {
        return version;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumeroCreditos(int numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
