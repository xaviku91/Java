package Aprendizaje.PildorasInformaticas;

public class constantes {
    // Constantes: Son variables que no cambian su valor
    
    public static void main(String[] args){

        // Declaración de constantes (final)
        final double pi=3.1416;
        System.out.println("El valor de pi es: " + pi);
        // pi=3.315; // Esto no se puede hacer porque es una variable final y porque pi siempre es 3.1416

        // Declaración de constantes (final) - Cadena de caracteres
        final String ciudad="Sabadell";
        System.out.println("La ciudad es: " + ciudad);
        // ciudad="Barcelona"; // Esto no se puede hacer porque es una variable final y porque ciudad siempre es Sabadell
        
        // Declaración de constantes (final) - Boolean
        final boolean casado=true;
        System.out.println("¿Está casado Juan? " + casado);
        // casado=false; // Esto no se puede hacer porque es una variable final y porque casado siempre es true
    }

}
