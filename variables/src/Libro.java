public class Libro {
    public static void main(String[] args) {
        //Detalle un libro
        String tituloLibro= "El seño de los anilos";
        int aniopublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.80;

        // Imprimir

        System.out.println("el libro: "+tituloLibro);
        System.out.println("Con año de publicacion: " + aniopublicacion);
        System.out.println("disponibilidad: " + libroDisponible);
        System.out.println("Con precio; "+precio);

        //Modificando datos

        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
}
