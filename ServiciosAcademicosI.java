public interface ServiciosAcademicosI {
    class estudianteYaInscritoException extends Exception {
        public estudianteYaInscritoException(String message) {
            super(message);
        }
    }

    class estudianteNoInscritoEnCursoException extends Exception {
        public estudianteNoInscritoEnCursoException(String message) {
            super(message);
        }
    }

    void matricularEstudiante(Estudiante estudiante);
    void agregarCurso(Curso curso);
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws estudianteYaInscritoException;
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws  estudianteNoInscritoEnCursoException;
}