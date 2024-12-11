import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");
        var consola = new Scanner(System.in);

        //Ingreso de datos
        // Ingreso del nombre de la receta

        System.out.print("Ingresa el nombre de la rectas: ");
        var nombreRecta= consola.nextLine();

        //Ingreso de la lista de ingredientes
        System.out.print("Ingresa la lista de ingredientes(min): ");
        var ingredientes = consola.nextLine();

        //Ingreso del tiempo de preparacion
        System.out.print("Ingresa el tiempo de preparacion: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        //Ingresa la dificultad

        System.out.print("Ingresa la dificultad de la receta: ");
        var dificultad = consola.nextLine();
        //Impresion

        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre de la receta: "+nombreRecta);
        System.out.println("\tIngredientes de la receta: "+ingredientes);
        System.out.println("\tTiempo de preparación: "+tiempoPreparacion+" min");
        System.out.println("\tDificultad: "+ dificultad);
    }
}
