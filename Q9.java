import java.util.Scanner;
import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um texto qualquer:");
        String texto = teclado.nextLine();

        char[] caracteres = texto.toCharArray();

        System.out.println("\nTexto em um vetor de caracteres:");
        System.out.println(Arrays.toString(caracteres));
    }
}