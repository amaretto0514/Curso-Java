package ejemplos;

import java.util.Scanner;

public class TiendaDescuentos {
    public static void main(String[] args) {
        System.out.println("***Sistema de venta con descuentos***");
        var teclado = new Scanner(System.in);
        System.out.println("Ingresa el monto de tu compra");
        int compra = Integer.parseInt(teclado.next());
        double descuento=0.00;
        double precioF=0.00;
        System.out.println("Ustes es miembro de nuestro clan?(true/false)");
        boolean miembro = Boolean.parseBoolean(teclado.next());
        double montoD = 0.0;


        if (compra>=1000 && miembro== true){
            montoD = 10;
            descuento = compra * (montoD/100);
            precioF = compra-descuento;

        } else if (compra<1000 && miembro== true) {
            montoD = 5;
            descuento = compra * (montoD/100);
            precioF = compra-descuento;

        }else {
            montoD = 0;
            descuento = compra * (montoD/100);
            precioF = compra-descuento;

        }

        var mensaje = String.format("""
                "Felicidades, has tenido un desciento del: %s"
                Monto de la compra: %d
                Monto del desccuento: %.2f
                Monto final de la compra con descuento: %.2f
                """, montoD, compra, descuento, precioF);
        System.out.println(mensaje);
    }
}
