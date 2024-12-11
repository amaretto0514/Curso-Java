public class Correo {
    public static void main(String[] args) {
        System.out.println("***Generador de correos electronicos");
        var nombre = "Victor Agustin Villalta Delgado";
        var nombreUsuario = nombre.toLowerCase().replace(" ", ".");
        System.out.println("nombreUsuario = " + nombreUsuario);
        var empresa = "Tech Domotics";
        var dominioEmp = empresa.toLowerCase().replace(" ", "");

        System.out.println("empresa = " + empresa);
        var extensiomDom = ".com.pe";

        var correo = nombreUsuario+"@"+dominioEmp+extensiomDom;
        System.out.println("Email final generado = " + correo);

    }
}
