package ejemplos;

import java.util.Scanner;

public class AppFitness {
    public static void main(String[] args) {
        System.out.println("***Bienvenido a la aplicacion fitness***");
        var teclado = new Scanner(System.in);
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        System.out.println("Ingresa tu nombre de usuario");
        var usuario = teclado.next();
        System.out.println("Ingresa la cantidad de pasos caminados en el dia");
        int pasosDia = Integer.parseInt(teclado.next());

        //calculo de calorias quemadas
        double CALORIAS_QUEMADAS = pasosDia * CALORIAS_POR_PASO;

        var metaAlcanzada = pasosDia>=META_PASOS_DIARIOS ? "Meta alcanzada" : "Meta no alcanzada";

        System.out.println("Hola " +  usuario+ " " + metaAlcanzada);
    }
}
