import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Único ***");
        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre: ");
        var nombre = consola.nextLine();

        System.out.print("Cual es tu apellido: ");
        var apellido = consola.nextLine();

        System.out.print("Cual es tu fecha de nacimiento? (YYYY): ");
        var nacimiento = consola.nextLine();

        //logica

        var inicioID = nombre.trim().substring(0,2).toUpperCase();
        var segunID = apellido.trim().substring(0,2).toUpperCase();
        var tercerID =  nacimiento.substring(2);
        var randomito = new Random();

        var ultimo = randomito.nextInt(9999)+1;
        var numeorAleatorio = String.format("%04d", ultimo);

        var mensaje = """
                Hola %s,
                \tTu número de identificación (ID) generado por el sistemas es:
                %s%s%s%s
                Felicidades!
                """.formatted(nombre, inicioID,segunID,tercerID,numeorAleatorio);
        System.out.printf(mensaje);


    }
}
