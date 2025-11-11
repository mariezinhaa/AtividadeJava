import java.util.Scanner;

public class Q8 {
    static void selectionSort(int[] v) {
        for (int i = 0; i < v.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[j] < v[min]) min = j;
            }
            int temp = v[i];
            v[i] = v[min];
            v[min] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamanho do vetor: ");
        int n = sc.nextInt();
        int[] v = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            v[i] = sc.nextInt();
        }

        System.out.print("Antes da ordenação: ");
        for (int num : v) System.out.print(num + " ");

        selectionSort(v);

        System.out.print("\nDepois da ordenação: ");
        for (int num : v) System.out.print(num + " ");
        sc.close();
    }
}

