public class ReservaHoteles {
    public static void main(String[] args) {
        String cliente = "Angeluz Vasquez";
        int diasEstancia = 5;
        final var tarifa = 45;
        boolean vistaMar = true;

        System.out.println("Nombre del cliente = " + cliente);
        System.out.println("su estancia sera de = " + diasEstancia);
        System.out.println("con una tarifa diaria = " + tarifa);
        System.out.println("cueenta con vista la mar? = " + vistaMar);

        cliente = "Estrella Lozano";
        diasEstancia = 9;
        vistaMar = false;

        System.out.println("Nombre del cliente = " + cliente);
        System.out.println("su estancia sera de = " + diasEstancia);
        System.out.println("con una tarifa diaria = " + tarifa);
        System.out.println("cueenta con vista la mar? = " + vistaMar);
    }
}
