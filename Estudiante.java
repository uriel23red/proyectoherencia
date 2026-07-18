// Clase derivada que hereda de Persona
public class Estudiante extends Persona {

    private String carrera;
    private double promedio;

    public Estudiante(String nombre, int edad, String carrera, double promedio) {

        super(nombre, edad);

        this.carrera = carrera;
        this.promedio = promedio;
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }

    public boolean estaAprobado() {
        return promedio >= 70;
    }
}
