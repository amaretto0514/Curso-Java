package ejemplos;

import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {
        System.out.println("***Calcula la area de un rectangulo***");
        var teclado = new Scanner(System.in);
        System.out.println("Ingresa la base de tu rectangulo");
        int base = Integer.parseInt(teclado.nextLine());
        System.out.println("Ingresa la altura de tu rectangulo");
        int altura = Integer.parseInt(teclado.next());

        int areaRectangulo = base*altura;
        int perimetrio = 2*(base+altura);
        System.out.println("EL área de tu rectangulo es: " + areaRectangulo);
        System.out.println("El perimetro de tu rectangulo es: " + perimetrio);
    }
}
