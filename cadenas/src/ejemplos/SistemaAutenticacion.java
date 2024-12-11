package ejemplos;

import java.util.Scanner;



public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***Sistema de Autenticación");
        var teclado = new Scanner(System.in);
        boolean resultado ;
        System.out.println("Cual es tu usuario?");
        var usuario = teclado.next();

        System.out.println("Cual es tu constraseñaa?");
        var password = teclado.next();

        if (usuario.equals("admin") && password.equals("123")){
            resultado = true;
            System.out.println("Datos Correctos? " + resultado);
        }else {
            resultado = false;
            System.out.println("Datos Correctos? " + resultado);
        }

    }
}
