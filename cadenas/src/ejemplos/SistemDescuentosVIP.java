package ejemplos;

import java.util.Scanner;

public class SistemDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("***Sitemas descuentos VIP***");
        final var noProductosDescuento = 10;
        var teclado = new Scanner(System.in);

        System.out.println("Cuantos productos compraste hoy?");
        var cantidadProdutos = teclado.nextInt();

        System.out.println("Tinee membresi ade la tienda? (true/false)");
        boolean tienesMembresia = Boolean.parseBoolean(teclado.next());

        if (cantidadProdutos >=10 && tienesMembresia == true ){
            System.out.println("Felicidades usted tiene descuento VIP");
        }else{
            System.out.println("JAJAJAJA pobre buebon no tiene descuento VIP");
        }
    }
}
