package ejemplos;

import java.util.Scanner;

public class EstacionAño {
    public static void main(String[] args) {
        System.out.println("***Estacion del año***");

        var teclado = new Scanner(System.in);
        var estacion = " ";
        System.out.println("Ingresa un numero del 1-12");
        var numeroEstacion= Integer.parseInt(teclado.next());

        if(numeroEstacion==12 || numeroEstacion==1 || numeroEstacion ==2){
            estacion = "VERANO";
        } else if (numeroEstacion==3 || numeroEstacion==4 || numeroEstacion ==5) {
            estacion = "OTOÑO";
        } else if (numeroEstacion==6 || numeroEstacion==7 || numeroEstacion ==8) {
            estacion = "INVIERNO";
        } else if (numeroEstacion==9 || numeroEstacion==10 || numeroEstacion ==11) {
            estacion = "PRIMAVERA";
        }else {
            estacion= "Estacion no encontrada";
        }
        System.out.println("Tu estacion es: " + estacion);

        estacion = switch (numeroEstacion){
            case 12, 1, 2 -> "Invierno";
            case 3, 4, 5 -> "primaver";
            case 6, 7, 8 -> "verano";
            case 9, 10, 11 -> "otoño";
            default -> "Desconocida";
        };
        System.out.println("Tu estacion es: " + estacion);
    }
}
