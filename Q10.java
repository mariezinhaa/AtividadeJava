import java.util.ArrayList;
import java.util.Scanner;

public class Q10 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> lista = new ArrayList<>();

    public static void inserir() {
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        lista.add(num);
    }

    public static void listar() {
        System.out.println("Números: " + lista);
    }

    public static void somar() {
        int soma = 0;
        for (int n : lista) soma += n;
        System.out.println("Soma dos números: " + soma);
    }

    public static void limpar() {
        lista.clear();
        System.out.println("Lista limpa!");
    }

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("(1) Inserir número");
            System.out.println("(2) Listar números");
            System.out.println("(3) Somar números");
            System.out.println("(4) Limpar lista");
            System.out.println("(0) Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> inserir();
                case 2 -> listar();
                case 3 -> somar();
                case 4 -> limpar();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
