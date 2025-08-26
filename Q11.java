import java.util.Scanner;
import java.util.Arrays;

public class Q11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite varias palavras separadas por ;");
        String texto = teclado.nextLine();

        String[] palavras = texto.split(";");

        System.out.println("\nVetor com as palavras:");
        System.out.println(Arrays.toString(palavras));
    }
}