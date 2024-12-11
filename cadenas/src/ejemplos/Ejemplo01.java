package ejemplos;

import java.util.Scanner;

public class Ejemplo01 {
    public static void main(String[] args) {
        System.out.println("***Valor dentro rango***");
        final var minimo= 0;
        final var maximo=5;
        var teclado = new Scanner(System.in);
        System.out.println("Ingresa un valor a evaluar:");
        var cliente = teclado.nextInt();

        if (cliente <= 5 && cliente >=0 ){
            System.out.println("Tu valor: " + cliente +", si esta dentro del rango");
        }else {
            System.out.println("tu valor: "+ cliente + ", no esta dentro del rango");
        }


    }
}
