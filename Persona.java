public class Persona {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;

    Persona(String nombre, String apellido, String fechaDeNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    String getNombre(){
        return nombre;
    }

    String getApellido(){
        return apellido;
    }
    String getFechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    void setNombre(String nombre){
        this.nombre = nombre;
    }
    void setApellido(String apellido){
        this.apellido = apellido;
    }
    void setFechaDeNacimiento(String fechaDeNacimiento){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
}
