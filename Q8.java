import java.util.Scanner;
import java.util.Random;

public class Q8 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
        char[] consoantes = { 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
                'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' };

        int tamanho = 0;

        while (tamanho <= 0 || tamanho >= 26) {
            System.out.print("Digite o tamanho da senha (menor que 26): ");
            tamanho = teclado.nextInt();
        }

        char[] senha = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            if (i % 2 == 0) {
                // Posicao par: consoante
                int pos = random.nextInt(consoantes.length);
                senha[i] = consoantes[pos];
            } else {
                // Posicao impar: vogal
                int pos = random.nextInt(vogais.length);
                senha[i] = vogais[pos];
            }
        }

        System.out.print("\nSenha gerada: ");
        System.out.println(senha);
    }
}