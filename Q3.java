import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final int tam = 4;
        double[] nota = new double[tam];
        double soma = 0;

        for ( int i = 0 ; i < tam ; i++){
            System.out.println("Informe o " + ( i + 1 ) + "ª nota");
            nota[i] = scanner.nextDouble();
            //calcular a nota
            soma += nota[i];
        }

        double media = soma / tam;

        System.out.println("Notas Digitadas");
        for (int i = 0 ; i < tam ; i++) {
            System.out.print(nota[i] + " ");
        }
        System.out.println("\nMédia:" + media);
    }
}
