import java.util.Scanner;

public class Q9 {
    static int buscaBinaria(int[] v, int x) {
        int ini = 0, fim = v.length - 1;
        while (ini <= fim) {
            int meio = (ini + fim) / 2;
            if (v[meio] == x) return meio;
            else if (x < v[meio]) fim = meio - 1;
            else ini = meio + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do vetor (ordenado): ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.print("Valor a buscar: ");
        int x = sc.nextInt();

        int pos = buscaBinaria(v, x);
        if (pos == -1)
            System.out.println("Elemento não encontrado.");
        else
            System.out.println("Elemento encontrado na posição " + pos + ".");
        sc.close();
    }
}

