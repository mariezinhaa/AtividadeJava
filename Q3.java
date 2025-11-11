import java.util.Scanner;

public class Q3 {
    static int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite três números inteiros: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("Maior número: " + max3(a, b, c));
        sc.close();
    }
}
