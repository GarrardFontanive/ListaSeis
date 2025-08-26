import java.util.Scanner;
import java.util.Arrays;

public class Q10 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String dataTexto = teclado.nextLine();

        String[] partes = dataTexto.split("/");

        if (partes.length == 3) {
            int dia = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int ano = Integer.parseInt(partes[2]);

            boolean dataValida = true;
            if (mes < 1 || mes > 12) {
                dataValida = false;
            }
            if (dia < 1 || dia > 31) {
                dataValida = false;
            }
            if (ano <= 0) {
                dataValida = false;
            }

            if (dataValida) {
                int[] dataVetor = { dia, mes, ano };
                System.out.println("Data valida! Vetor gerado:");
                System.out.println(Arrays.toString(dataVetor));
            } else {
                System.out.println("Data invalida!");
            }

        } else {
            System.out.println("Formato invalido!");
        }
    }
}