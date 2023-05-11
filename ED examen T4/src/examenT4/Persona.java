package examenT4;

public class Persona {
    private String nombre;
    private int edad;
    private String domicilio;
    String carrera=null;
    String matricula=null;

    public Persona(String nombre, int edad, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.domicilio = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return domicilio;
    }

    public void setDireccion(String direccion) {
        this.domicilio = direccion;
    }

	public void imprimirDatos() {
	    System.out.println("Nombre: " + getNombre());
	    System.out.println("Edad: " + getEdad());
	    System.out.println("Dirección: " + getDireccion());
	    System.out.println("Matrícula: " + matricula);
	    System.out.println("Carrera: " + carrera);
	}
}

