package ejemplos;

import java.util.Scanner;

public class Autenticacion1 {
    public static void main(String[] args) {
        System.out.println("Sistema de identificacion");

        final var ID = "AGUSTINVT1";
        final var PASSWORD = "amaretto12.";

        var teclado = new Scanner(System.in);
        System.out.println("Bienvenido a nuestro sistema de autenicacion:");
        System.out.println("Ingresa tu ID");
        var login = teclado.next().toUpperCase().strip();
        System.out.println("Ingresa tu contraseña:");
        var clave = teclado.next().strip();

        //validaciones

        var mensajeAutenticacion = switch(login){
            case ID ->{
                if (ID.equals(login))
                yield "Bienvenido al sistema";
                else
                    yield "Password incorrecto, facrvor de corregir";
            }
            default -> {
                if (PASSWORD.equals(clave)){
                    yield  "Usuario incorrecto, favot de corregirlo";}
                else {
                    yield "Usuario y passeord incorrectos, favor de corregirlos";
                }
            }
        };

        System.out.println(mensajeAutenticacion);
    }
}
