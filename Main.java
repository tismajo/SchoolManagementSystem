public class Main {
        public static void main(String[] args) {
            // Crear instancias de Estudiante y Curso según tus especificaciones
            Estudiante primerEstudiante = new Estudiante(561265, "Juan", "Sánchez", "10 de abril del 2002", "matriculado");
            Estudiante segundoEstudiante = new Estudiante(561651, "Celia", "Pérez", "5 de octubre de 2001", "matriculado");

            // Instanciar el GestorAcademico
            GestorAcademico gA = new GestorAcademico();

            Curso curso1 = new Curso(101, "Programación Java", "Curso introductorio de Java", 4, "1.0");
            Curso curso2 = new Curso(102, "Estructura de datos", "Introducción a bases de datos relacionales", 3, "2.0");

            // Probar métodos del GestorAcademico
            gA.agregarCurso(curso1);
            gA.agregarCurso(curso2);

            gA.matricularEstudiante(primerEstudiante);
            gA.matricularEstudiante(segundoEstudiante);

            try {
                gA.inscribirEstudianteCurso(primerEstudiante, curso1.getId());
                gA.inscribirEstudianteCurso(segundoEstudiante, curso1.getId());
                gA.inscribirEstudianteCurso(primerEstudiante, curso2.getId());

                // Prueba de desinscribir un estudiante de un curso
                gA.desinscribirEstudianteCurso(primerEstudiante.getId(), curso1.getId());
            }
             catch (ServiciosAcademicosI.estudianteYaInscritoException e) {
                throw new RuntimeException(e);
            }
            
        }
    }

