package examenT4;

public class ConstantsExample {
    private static final int VELOCIDAD_DE_LA_LUZ = 299792458;

	public static void main(String[] args) {
        int velocidadLuz = VELOCIDAD_DE_LA_LUZ; // Velocidad de la luz en metros por segundo
        int distancia = 50000000; // Distancia en metros

        int tiempo = distancia / velocidadLuz;

        System.out.println("El tiempo necesario para recorrer " + distancia + " metros a la velocidad de la luz es de " + tiempo + " segundos.");
    }
}

