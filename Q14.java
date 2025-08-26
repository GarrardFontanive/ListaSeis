import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int totalAlunos = 30;

        int[] idades = new int[totalAlunos];
        double[] alturas = new double[totalAlunos];
        double somaAlturas = 0;

        for (int i = 0; i < totalAlunos; i++) {
            System.out.println("Dados do aluno " + (i + 1) + ":");
            System.out.print("Idade: ");
            idades[i] = teclado.nextInt();
            System.out.print("Altura: ");
            alturas[i] = teclado.nextDouble();
            somaAlturas += alturas[i];
        }

        double mediaAltura = somaAlturas / totalAlunos;
        int contador = 0;

        for (int i = 0; i < totalAlunos; i++) {
            if (idades[i] > 13 && alturas[i] < mediaAltura) {
                contador++;
            }
        }

        System.out.println("\nMedia de altura da turma: " + mediaAltura);
        System.out.println("Total de alunos com mais de 13 anos e altura inferior a media: " + contador);
    }
}