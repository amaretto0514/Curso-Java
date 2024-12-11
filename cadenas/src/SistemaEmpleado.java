import java.util.Scanner;

public class SistemaEmpleado {
    public static void main(String[] args) {
        System.out.println("***Sistema de empleados***");

        var consola = new Scanner(System.in);

        //Nombre del empleado

        System.out.println("Nombre del empleado");
        var nombreEmpleado = consola.nextLine();

        //Edad
        System.out.println("Edad del empleado");
        var edad = Integer.parseInt(consola.nextLine());

        // salario del empleado
        System.out.println("Ingrese su salario");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Es jefe de departamento?

        System.out.println("Usted es jefe de departamento?(true/false)");
        var jefeDepatamento = Boolean.parseBoolean(consola.nextLine());

        //Impresion

        System.out.println("***\nDatos del empleado***");
        System.out.println("\tNombre del empleado: "+nombreEmpleado);
        System.out.println("\tEdad del empleado: " + edad);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de departamento?" + jefeDepatamento);
    }
}
