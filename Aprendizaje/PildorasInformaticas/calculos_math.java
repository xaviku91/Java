package Aprendizaje.PildorasInformaticas;

public class calculos_math {
    public static void main(String[] args) {
        // Saber la raíz cuadrada de un número dado por el usuario.

        // Declaración de variables
        double raiz, numero;

        // Pedir al usuario que introduzca un número
        System.out.println("Introduce un número: ");

        // Leer el número introducido por el usuario
        numero = Double.parseDouble(System.console().readLine());

        // Calcular la raíz cuadrada del número introducido por el usuario
        raiz = Math.sqrt(numero);

        // Mostrar el resultado
        System.out.println("La raíz cuadrada de " + numero + " es " + raiz);
    }
}
