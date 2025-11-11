import java.util.InputMismatchException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Digite um número inteiro: ");
            int num = sc.nextInt();
            if (num % 2 == 0)
                System.out.println("Par");
            else
                System.out.println("Ímpar");
        } catch (InputMismatchException e) {
            System.out.println("Erro: entrada inválida. Digite um número inteiro.");
        }
        sc.close();
    }
}
