import java.util.Scanner;
import java.util.ArrayList;

public class Q5 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        System.out.println("Digite 20 numeros:");

        for (int i = 0; i < 20; i++) {
            int numeroLido = teclado.nextInt();
            numeros.add(numeroLido);
        }

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                par.add(numero);
            } else {
                impar.add(numero);
            }
        }

        System.out.println("\nTodos os numeros digitados:");
        System.out.println(numeros);

        System.out.println("\nNumeros pares:");
        System.out.println(par);

        System.out.println("\nNumeros impares:");
        System.out.println(impar);
    }
}