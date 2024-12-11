package ejemplos;

import java.util.Scanner;

public class SsitemaBancario {
    public static void main(String[] args) {
        System.out.println("***Bienvenidos al sistema bancarios ***");

        var teclado = new Scanner(System.in);
        System.out.println("Desea salir del sistema? (true/false)");
        var salirSistema= Boolean.parseBoolean(teclado.next());

        if(!salirSistema){
            System.out.println("Genial, aun soy tu dueño...");
        }else{
            System.out.println("Saliendo del sistema...");
        }
    }
}
