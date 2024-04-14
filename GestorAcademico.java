import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI{
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Curso, ArrayList<Estudiante>> estudiantesPorCurso;

    GestorAcademico(){
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.estudiantesPorCurso = new HashMap<>();
    }


    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        if(!estudiantes.contains(estudiante)){
            estudiantes.add(estudiante);
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if(!cursos.contains(curso)){
            cursos.add(curso);
            estudiantesPorCurso.put(curso, new ArrayList<>());
        }
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws estudianteYaInscritoException{
        Curso curso = null;
        for (Curso c : cursos){
            if (c.getId() == idCurso){
                curso = c;
                break;
            }
        } if(curso == null){
            throw new IllegalArgumentException("El ID no es válido, intente de nuevo.");
        }
        ArrayList<Estudiante> estudiantesInscritos = estudiantesPorCurso.get(curso);
        if(estudiantesInscritos.contains(estudiante)) {
            throw new estudianteYaInscritoException("El estudiante ya es parte de este curso");
        }
        estudiantesInscritos.add(estudiante);
        estudiantesPorCurso.put(curso, estudiantesInscritos);
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        Curso curso = null;
        Estudiante estudiante = null;

        for (Curso c: cursos){
            if(c.getId()==idCurso){
                curso = c;
                break;
            }
        } if(curso == null){
            throw new IllegalArgumentException("El ID del curso no es válido, intente de nuevo.");
        }

        for (Estudiante e: estudiantes){
            if(e.getId()== idEstudiante){
                estudiante = e;
                break;
            }
        } if(estudiante == null){
            throw new IllegalArgumentException("El ID del estudiante no es válido, intente de nuevo.");
        }

        ArrayList<Estudiante> estudiantesInscritos = estudiantesPorCurso.get(curso);
        estudiantesInscritos.remove(estudiante);
        estudiantesPorCurso.put(curso, estudiantesInscritos);

    }

}