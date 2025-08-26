import java.util.Scanner;
import java.util.Arrays;

public class Q13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[20];

        System.out.println("Digite os 10 elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vetor1[i] = teclado.nextInt();
        }

        System.out.println("Digite os 10 elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            vetor2[i] = teclado.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vetor3[i * 2] = vetor1[i];
            vetor3[i * 2 + 1] = vetor2[i];
        }

        System.out.println("\nVetor intercalado:");
        System.out.println(Arrays.toString(vetor3));
    }
}