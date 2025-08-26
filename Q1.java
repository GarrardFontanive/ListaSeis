import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final int tam = 5;
        int[] num = new int[tam];

        for (int i = 0 ; i < tam ; i++) {
            System.out.println("Informe o " + (i + 1) + "º número.");
            num[i] = scanner.nextInt();
        }

        // Sistema para apresentar//
        System.out.println("---Números informados---");
        for (int i = 0 ; i < tam ; i++) {
            System.out.println(num[i]);
        }
        scanner.close();
    }
}