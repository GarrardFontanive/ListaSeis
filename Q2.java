import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        final int tam = 10;
        double[] num = new double[tam];

        for (int i = 0 ; i < tam ; i++){
            System.out.println("informe o " + (i + 1) + "º número.");
            num[i] = scanner.nextDouble();
        }

        for (int i = 9 ; i >= 0 ; i--){
            System.out.print(num[i] + " ");
        }
        scanner.close();
    }
}
