import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();
        System.out.print("Operação (+ - * /): ");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+': System.out.println("Resultado: " + (a + b)); break;
            case '-': System.out.println("Resultado: " + (a - b)); break;
            case '*': System.out.println("Resultado: " + (a * b)); break;
            case '/':
                if (b == 0) System.out.println("Erro: divisão por zero!");
                else System.out.println("Resultado: " + (a / b));
                break;
            default: System.out.println("Operação inválida!");
        }
        sc.close();
    }
}
