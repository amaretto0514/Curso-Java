public class Cadenas {
    public static void main(String[] args) {
        System.out.println("***Manejo de cadenas***");
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);
        var cadena3 = cadena1+""+cadena2;
        System.out.println("cadena3 = " + cadena3);
        //Cadena multipnes lineas (text block)
        var cadena4 = """
                Este es un texto
                multilinea
                """;
        //System.out.println("  = " +  );


        //sustraer y crear una nueva cadena
        
        var cadena01 = "Hola Mundo";
        System.out.println("cadena01 = " + cadena01);
        var cadena03 = cadena01.substring(5,10);
        System.out.println("cadena03 = " + cadena03);


        // BUSQUEDA EN SUBCADENAS

        var subcande1= cadena01.indexOf("M");
        System.out.println("subcande1 = " + subcande1);

        //reemplazar subcadenas

        var subcadena02  = "Hola Mundo";

    }
}
