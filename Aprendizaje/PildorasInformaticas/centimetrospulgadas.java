// 1. Pedir al usuario que introduzca los centímetros y mostrar el resultado en pulgadas
package Aprendizaje.PildorasInformaticas;

public class centimetrospulgadas {
    public static void main(String[] args)
    {
        // Pedir al usuario que introduzca los centímetros
        System.out.println("Introduzca los centímetros: ");
        double centimetros = Double.parseDouble(System.console().readLine());
        // Mostrar el resultado en pulgadas
        double pulgadas = centimetros / 2.54;
        System.out.println("El resultado en pulgadas es: " + pulgadas);
    }
}
