import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean verificaFibonacci(int num) {
        int a = 0, b = 1, c;
        while (b <= num) {
            if (b == num) {
                return true;
            }
            c = a + b;
            a = b;
            b = c;
        }
        return false;
    }
}
