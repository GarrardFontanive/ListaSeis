import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int tam = 10;

        char[] letras = new char[tam];
        String consoantesLidas = " ";
        int contador = 0;

        System.out.println("Digite " + tam + " letras.");

        for (int i = 0 ; i < tam ; i++){
            System.out.print("letra " + (i + 1) + ": ");
            letras[i] = scanner.next().charAt(0);

            char caracterMinus = Character.toLowerCase(letras[i]);

            if (Character.isLetter(caracterMinus) &&
                    !(caracterMinus == 'a' ||
                      caracterMinus == 'e' ||
                      caracterMinus == 'i' ||
                      caracterMinus == 'o' ||
                      caracterMinus == 'u')) {

                contador++;
                consoantesLidas += letras[i] + " ";
            }
        }
        System.out.println("\n------------------------------------");
        System.out.println("Análise concluída:");
        System.out.println("------------------------------------");
        System.out.println("Quantidade de consoantes: " + contador);
        System.out.println("Lidas: " + consoantesLidas);
        System.out.println("------------------------------------");
        scanner.close();
    }
}