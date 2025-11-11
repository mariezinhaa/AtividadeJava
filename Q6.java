import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números deseja inserir (1–100)? ");
        int n = sc.nextInt();

        if (n < 1 || n > 100) {
            System.out.println("Quantidade inválida!");
            sc.close();
            return;
        }

        double[] v = new double[n];
        double soma = 0, min, max;

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextDouble();
            soma += v[i];
        }

        min = max = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] < min) min = v[i];
            if (v[i] > max) max = v[i];
        }

        double media = soma / n;
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + media);
        System.out.println("Mínimo = " + min);
        System.out.println("Máximo = " + max);
        sc.close();
    }
}
