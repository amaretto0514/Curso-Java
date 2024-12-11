package ejemplos;

import java.util.Scanner;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("***Bienvenido al hotel rikota***");
        var teclado = new Scanner(System.in);
        double habitacion = 0.00;
        System.out.print("Ingresa tu nombre: ");
        String nombre = teclado.next();

        System.out.print("Ingresa la cantidad de días que deseas quedarte con nosotros: ");
        var diasReserva = Integer.parseInt(teclado.next());

        System.out.println("¿Desea una habitación con vista al mar? (true/false)");
        var vistaM = Boolean.parseBoolean(teclado.next());
        if (vistaM) {
            habitacion = 190.50;
        } else {
            habitacion = 150.50;
        }
        var costoTotal = diasReserva * habitacion;

        var mensanjeOUT = String.format(
                "Hola %s\nEl costo total de tu estadía es de: %.2f.\nEl cual te incluye:\n%d días en nuestra estancia,\nhabitación con vista al mar?: %b\nsaliendo el costo de habitación: %.2f",
                nombre, costoTotal, diasReserva, vistaM, habitacion
        );

        System.out.println(mensanjeOUT);
        teclado.close(); // Asegúrate de cerrar el Scanner
    }

}
