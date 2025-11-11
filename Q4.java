import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro (0 a 20): ");
        int n = sc.nextInt();

        if (n < 0 || n > 20) {
            System.out.println("Valor fora do limite permitido.");
        } else {
            long fat = 1;
            for (int i = 1; i <= n; i++) {
                fat *= i;
            }
            System.out.println(n + "! = " + fat);
        }
        sc.close();
    }
}

