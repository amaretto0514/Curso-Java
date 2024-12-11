package ejemplos;

public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("Numeros Impares del 1-20");

        var contador = 0;

        do {
            if (contador % 2 != 0 )
                System.out.println(contador);
                contador++;
        } while (contador <=20);
    }
}
