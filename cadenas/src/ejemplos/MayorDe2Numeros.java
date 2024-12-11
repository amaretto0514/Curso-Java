package ejemplos;

import java.util.Scanner;

public class MayorDe2Numeros {
    public static void main(String[] args) {
        System.out.println("***Mayor de 2 numeros***");
        var teclado = new Scanner(System.in);

        System.out.println("Ingresa un numero:");
        var primerN= Integer.parseInt(teclado.next());
        System.out.println("Ingresa otro numero:");
        var segundoN = Integer.parseInt(teclado.next());;
        var mensaje= " ";
        if(primerN > segundoN){
            mensaje =primerN +" es mayor que "+segundoN;
        } else if (primerN< segundoN) {
            mensaje = primerN +" es menor que "+segundoN;
        }else{
            mensaje="son iguales";
        }
        System.out.println(mensaje);
    }
}
