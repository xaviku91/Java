// 2. Pedir al usuario que introduzca los grados centígrados y mostrar el resultado en grados Fahrenheit
package Aprendizaje.PildorasInformaticas;

public class gradosfarenheit {
    public static void main(String[] args)
    {
        // Pedir al usuario que introduzca los grados centígrados
        System.out.println("Introduzca los grados centígrados: ");
        double gradosCentigrados = Double.parseDouble(System.console().readLine()); // Double.parseDouble convierte un String en un double
        // Mostrar el resultado en grados Fahrenheit
        double gradosFahrenheit = (gradosCentigrados * 9/5) + 32; 
        System.out.println("El resultado en grados Fahrenheit es: " + gradosFahrenheit);
    }
}