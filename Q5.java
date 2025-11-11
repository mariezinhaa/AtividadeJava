import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite n (n ≥ 1): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Valor inválido!");
        } else {
            int a = 0, b = 1, cont = 1;
            System.out.print("Sequência de Fibonacci: ");
            while (cont <= n) {
                System.out.print(a + " ");
                int prox = a + b;
                a = b;
                b = prox;
                cont++;
            }
        }
        sc.close();
    }
}

