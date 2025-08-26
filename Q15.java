import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {

        final int N = 5;
        Scanner teclado = new Scanner(System.in);
        int[] valores = new int[N];

        System.out.println("Digite " + N + " valores (entre 0 e 20):");

        for (int i = 0; i < N; i++) {
            int valorLido = -1;
            while (valorLido < 0 || valorLido > 20) {
                System.out.print("Valor " + (i + 1) + ": ");
                valorLido = teclado.nextInt();
                if (valorLido < 0 || valorLido > 20) {
                    System.out.println("Valor invalido! Tente novamente.");
                }
            }
            valores[i] = valorLido;
        }

        System.out.println("\nGrafico:");
        for (int i = 0; i < N; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}