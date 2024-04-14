public class Estudiante extends Persona{
    private int id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado;

    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
