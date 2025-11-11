import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantidade de números: ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.print("Digite o valor a procurar: ");
        int x = sc.nextInt();

        int cont = 0;
        for (int i = 0; i < n; i++)
            if (v[i] == x) cont++;

        System.out.println("O número " + x + " ocorre " + cont + " vezes.");
        sc.close();
    }
}

