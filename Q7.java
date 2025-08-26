import java.util.Scanner;
import java.util.Arrays;

public class Q7 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        long soma = 0;
        long multiplicacao = 1;

        System.out.println("Digite 5 numeros inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        for (int numero : numeros) {
            soma = soma + numero;
            multiplicacao = multiplicacao * numero;
        }

        System.out.println("\nNumeros digitados: " + Arrays.toString(numeros));
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicacao: " + multiplicacao);
    }
}