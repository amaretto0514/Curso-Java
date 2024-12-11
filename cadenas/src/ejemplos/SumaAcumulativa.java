package ejemplos;

public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("***Suma Acumulativa***");

        final var MAXIMO = 5;
        var aculadorSuma = 0;

        var numero = 1;

        while(numero<=MAXIMO){
            aculadorSuma+=numero;
            numero++;
            System.out.println(numero);
        }
        System.out.println(aculadorSuma);
    }
}
