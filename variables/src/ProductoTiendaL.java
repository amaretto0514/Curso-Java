public class ProductoTiendaL {
    public static void main(String[] args) {
        System.out.println("Tienda en linea");
        String nombreProducto = "iPhone 15";
        double precioProducto = 1500;
        int cantidadDisponible = 17000;
        boolean disponibleVenta = true;

        //Imprimir el detalle del producto

        System.out.println("Nombre del producto = " + nombreProducto);;
        System.out.println("Precio = " + precioProducto);
        System.out.println("Cantidad Stock = " + cantidadDisponible);
        System.out.println("Disponible para la venta? = " + disponibleVenta);

        nombreProducto="PlayStation 5 Pro";
        precioProducto= 700;
        cantidadDisponible= 15;
        disponibleVenta= false;


        System.out.println("Nombre del producto = " + nombreProducto);;
        System.out.println("Precio = " + precioProducto);
        System.out.println("Cantidad Stock = " + cantidadDisponible);
        System.out.println("Disponible para la venta? = " + disponibleVenta);
    }
}
