package ejemplos;

public class NumeroPares {
    public static void main(String[] args) {
        System.out.println("***Numeors pares del 1 al 20 ***");

        var contador = 1;

        while ( contador <=20){
            //revisamos si es par
            if(contador %2 == 0)
                System.out.println(contador);
            contador++;
        }
    }
}
