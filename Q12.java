import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] idades = new int[5];
        double[] alturas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            System.out.print("Idade: ");
            idades[i] = teclado.nextInt();
            System.out.print("Altura: ");
            alturas[i] = teclado.nextDouble();
        }

        System.out.println("\n--- Ordem Inversa ---");
        for (int i = 4; i >= 0; i--) {
            System.out.println("Pessoa " + (i + 1) + " -> Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }

        int indiceMaisVelho = 0;
        int indiceMaisNovo = 0;
        int indiceMaisAlto = 0;
        int indiceMaisBaixo = 0;
        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < 5; i++) {
            if (idades[i] > idades[indiceMaisVelho]) indiceMaisVelho = i;
            if (idades[i] < idades[indiceMaisNovo]) indiceMaisNovo = i;
            if (alturas[i] > alturas[indiceMaisAlto]) indiceMaisAlto = i;
            if (alturas[i] < alturas[indiceMaisBaixo]) indiceMaisBaixo = i;
            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }

        double mediaIdade = (double)somaIdades / 5.0;
        double mediaAltura = somaAlturas / 5.0;

        System.out.println("\n--- Extremos ---");
        System.out.println("Mais velho: Idade " + idades[indiceMaisVelho] + ", Altura " + alturas[indiceMaisVelho]);
        System.out.println("Mais novo: Idade " + idades[indiceMaisNovo] + ", Altura " + alturas[indiceMaisNovo]);
        System.out.println("Mais alto: Idade " + idades[indiceMaisAlto] + ", Altura " + alturas[indiceMaisAlto]);
        System.out.println("Mais baixo: Idade " + idades[indiceMaisBaixo] + ", Altura " + alturas[indiceMaisBaixo]);

        System.out.println("\n--- Medias ---");
        System.out.println("Media de idade: " + mediaIdade);
        System.out.println("Media de altura: " + mediaAltura);

        System.out.println("\nPessoas com idade ACIMA da media:");
        for(int i=0; i<5; i++){
            if(idades[i] > mediaIdade){
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nPessoas com altura ABAIXO da media:");
        for(int i=0; i<5; i++){
            if(alturas[i] < mediaAltura){
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }
    }
}