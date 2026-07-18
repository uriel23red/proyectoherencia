public class Main {

    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante(
                "Juan Perez",
                20,
                "Ingenieria en Tecnologias",
                90
        );

        Profesor profesor = new Profesor(
                "Laura Martinez",
                40,
                "Programacion Orientada a Objetos"
        );

        System.out.println("===== ESTUDIANTE =====");
        estudiante.mostrarDatos();
        System.out.println("¿Aprobó? " + estudiante.estaAprobado());

        System.out.println();

        System.out.println("===== PROFESOR =====");
        profesor.mostrarDatos();
        profesor.impartirClase();

    }
}
