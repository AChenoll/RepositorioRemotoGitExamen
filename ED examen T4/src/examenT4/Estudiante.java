package examenT4;

public class Estudiante extends Persona {
    int matricula;
    String carrera;

    public Estudiante(String nombre, int edad, String direccion, int matricula, String carrera) {
        super(nombre, edad, direccion);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}