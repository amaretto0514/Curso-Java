package ejemplos;

import java.util.Scanner;

public class CasaEspejos {
    public static void main(String[] args) {
        System.out.println("***Casa de los espejos***");
        System.out.println("Hola, bienvenido a la casa de los espejos");
        System.out.println("*Para ingresar tienes que cunplir con las siguientes condicione");

        var teclado = new Scanner(System.in);

        System.out.println("Cuantos años tienes?");
        int edad = Integer.parseInt(teclado.next());

        System.out.println("Le tienes miedo a la oscuridad?");
        boolean miedo = Boolean.parseBoolean(teclado.next());

        if (edad >=10 && miedo == false){
            System.out.println("Puedes ingresar");
        }else {
            System.out.println("Mejor en otra oportunidad");
        }
    }
}
