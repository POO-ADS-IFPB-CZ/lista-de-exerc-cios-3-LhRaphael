package quest3;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void exibirFibonacci(int n) {
        System.out.print("Sequência de Fibonacci até " + n + ": ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.print("Informe um número inteiro positivo:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        if (n < 0) {
            System.out.println("Número inválido. Informe um número inteiro positivo.");
        } else {
            exibirFibonacci(n);
        }
        
    }
}
