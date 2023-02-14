package Aprendizaje.PildorasInformaticas;

public class operadores {
    public static void main(String[] args){
        // Operadores aritméticos

        // Suma (+)
        int resultado=5+3;
        System.out.println("El resultado de la suma es: " + resultado);

        // Resta (-)
        resultado=5-3;
        System.out.println("El resultado de la resta es: " + resultado);

        // Multiplicación (*)
        resultado=5*3;
        System.out.println("El resultado de la multiplicación es: " + resultado);

        // División (/)  
        resultado=5/3;
        System.out.println("El resultado de la división es: " + resultado);

        // Módulo (resto de la división) (%)
        resultado=5%3;
        System.out.println("El resultado del módulo es: " + resultado);

        // Operadores de asignación (+=, -=, *=, /=, %=)
        int x=5; 
        x+=3; // x=x+3
        System.out.println("El valor de x es: " + x);

        // Igual que (==) - Compara si dos variables son iguales
        int y=8;

        if (x==y){
            System.out.println("x e y son iguales");
        } else {
            System.out.println("x e y son diferentes");
        }

        // Diferente que (!=) - Compara si dos variables son diferentes
        x = 3;
        if (x!=y){
            System.out.println("x e y son diferentes");
        } else {
            System.out.println("x e y son iguales");
        }

        // Operadores lógicos (&&, ||, !)
        // && - AND
        // || - OR
        // ! - NOT
        
        // AND
        if (x==12 && y==8){
            System.out.println("x e y son iguales");
        } else {
            System.out.println("x e y son diferentes");
        }

        // OR
        if (x==3 || y==8){
            System.out.println("x e y son iguales");
        } else {
            System.out.println("x e y son diferentes");
        }

        // NOT
        if (!(x==3)){
            System.out.println("x e y son diferentes");
        } else {
            System.out.println("x e y son iguales");
        }

        // Operadores de incremento (++, --)
        // ++ - Incrementa en 1 el valor de la variable
        // -- - Decrementa en 1 el valor de la variable
        x=5;
        x++;
        System.out.println("El valor de x es: " + x);

        // Operadores de comparación (<, >, <=, >=)
        // < - Menor que
        // > - Mayor que
        // <= - Menor o igual que
        // >= - Mayor o igual que
        x=5;
        y=8;
        if (x<y){
            System.out.println("x es menor que y");
        } else {
            System.out.println("x es mayor que y");
        }

        // Operadores ternarios (?:)
        // (condición) ? (resultado si es true) : (resultado si es false)
        x=5;
        y=8;
        String resultadoTernario = (x<y) ? "x es menor que y" : "x es mayor que y";
        System.out.println(resultadoTernario);

        // Operadores de desplazamiento (<<, >>, >>>)
        // << - Desplaza los bits de la variable a la izquierda
        // >> - Desplaza los bits de la variable a la derecha
        // >>> - Desplaza los bits de la variable a la derecha sin signo
        x=5;
        y=8;
        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        System.out.println("El valor de x<<2 es: " + (x<<2)); // 5*2^2
        System.out.println("El valor de y>>2 es: " + (y>>2)); // 8/2^2
        System.out.println("El valor de y>>>2 es: " + (y>>>2)); // 8/2^2 sin signo

        // Operadores de asignación compuesta (+=, -=, *=, /=, %=, <<=, >>=, >>>=, &=, ^=, |=)
        // += - Suma
        // -= - Resta
        // *= - Multiplicación
        // /= - División
        // %= - Módulo
        // <<= - Desplaza los bits de la variable a la izquierda
        // >>= - Desplaza los bits de la variable a la derecha
        // >>>= - Desplaza los bits de la variable a la derecha sin signo
        // &= - AND
        // ^= - XOR
        // |= - OR
        x=5;
        y=8;

        System.out.println("El valor de x es: " + x);
        System.out.println("El valor de y es: " + y);
        x+=y; // x=x+y
        System.out.println("El valor de x+=y es: " + x);
        x-=y; // x=x-y
        System.out.println("El valor de x-=y es: " + x);
        x*=y; // x=x*y
        System.out.println("El valor de x*=y es: " + x);
        x/=y; // x=x/y
        System.out.println("El valor de x/=y es: " + x);
        x%=y; // x=x%y
        System.out.println("El valor de x%=y es: " + x);
        x<<=y; // x=x<<y (x*2^y)
        System.out.println("El valor de x<<=y es: " + x);
        x>>=y; // x=x>>y (x/2^y)
        System.out.println("El valor de x>>=y es: " + x);
        x>>>=y; // x=x>>>y (x/2^y sin signo)
        System.out.println("El valor de x>>>=y es: " + x);
        x&=y; // x=x&y
        System.out.println("El valor de x&=y es: " + x);
        x^=y; // x=x^y
        System.out.println("El valor de x^=y es: " + x);
        x|=y; // x=x|y
        System.out.println("El valor de x|=y es: " + x);

        // Operadores de instancia (instanceof)
        // Comprueba si un objeto es una instancia de una clase
        String nombre = "Pepe";
        if (nombre instanceof String){
            System.out.println("nombre es una instancia de String");
        } else {
            System.out.println("nombre no es una instancia de String");
        }

        // Operadores de coma (,)
        // Permite separar varias expresiones en una misma línea
        int a, b, c;
        a=5;
        b=8;
        c=10;
        System.out.println("El valor de a es: " + a);
        System.out.println("El valor de b es: " + b);
        System.out.println("El valor de c es: " + c);

        // Operadores de punto (.)
        // Accede a los miembros de un objeto
        String nombre2 = "Pepe";
        System.out.println("El valor de nombre2 es: " + nombre2);
        System.out.println("El valor de nombre2.length() es: " + nombre2.length());

        // Operadores de doble punto (..)
        // Crea un rango de valores
        for (int i=0; i<10; i++){
            System.out.println("El valor de i es: " + i);
        }

        // Operadores de punto y coma (;)
        // Permite separar varias sentencias en una misma línea
        int d=5, e=8, f=10;
        System.out.println("El valor de d es: " + d);
        System.out.println("El valor de e es: " + e);
        System.out.println("El valor de f es: " + f);

        // Operadores de exclamación (!)
        // Invierte el valor de una variable booleana
        boolean activo = true;
        System.out.println("El valor de activo es: " + activo);
        activo = !activo;
        System.out.println("El valor de activo es: " + activo);

        // Operadores de interrogación (?)
        // Permite asignar un valor a una variable si esta es null
        String nombre3 = null;
        System.out.println("El valor de nombre3 es: " + nombre3);
        nombre3 = (nombre3 != null) ? nombre3 : "Pepe";
        System.out.println("El valor de nombre3 es: " + nombre3);

        // Operadores de corchetes ([, ])
        // Se utiliza para definir arrays
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("El valor de numeros[0] es: " + numeros[0]);
        System.out.println("El valor de numeros[1] es: " + numeros[1]);
        System.out.println("El valor de numeros[2] es: " + numeros[2]);
        System.out.println("El valor de numeros[3] es: " + numeros[3]);
        System.out.println("El valor de numeros[4] es: " + numeros[4]);

        // Operadores de paréntesis ((, ))
        // Se utiliza para definir prioridades en las operaciones
        int g=5, h=8, i=10;
        System.out.println("El valor de g es: " + g);
        System.out.println("El valor de h es: " + h);
        System.out.println("El valor de i es: " + i);
        System.out.println("El valor de (g+h)*i es: " + ((g+h)*i));

        // Operadores de barra vertical (|, ||)
        // Se utiliza para operaciones lógicas
        boolean activo2 = true;
        boolean conectado = false;
        System.out.println("El valor de activo2 es: " + activo2);
        System.out.println("El valor de conectado es: " + conectado);
        System.out.println("El valor de activo2|conectado es: " + (activo2|conectado));
        System.out.println("El valor de activo2||conectado es: " + (activo2||conectado));

        // Operadores de barra diagonal (\)
        // Se utiliza para escapar caracteres especiales
        System.out.println("Hola \"Pepe\"");
        System.out.println("Hola \\Pepe\\");
        System.out.println("Hola \tPepe");     
    }
}
