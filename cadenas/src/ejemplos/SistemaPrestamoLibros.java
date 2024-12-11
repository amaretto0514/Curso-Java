package ejemplos;

import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("***Sitema de prestamo de libros***");

        System.out.println("Bienvenido a la biblioteca, ingrese su información para ver si se lleva un libro");
        var teclado = new Scanner(System.in);
        System.out.println("Usted tiene carnet estudiantil?");
        boolean carnetEstudiante = Boolean.parseBoolean(teclado.next());

        System.out.println("A que distancia vive de la biblioteca?");
        int distancia = Integer.parseInt(teclado.next());

        if (carnetEstudiante == true && distancia <=3 ){
            System.out.println("Felicidades puede llevarse su libro");
        }else {
            System.out.println("para la proxima vv");
        }
    }
}
