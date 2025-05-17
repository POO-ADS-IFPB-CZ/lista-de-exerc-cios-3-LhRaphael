package quest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MegaSena {

    public static boolean jaContem(ArrayList<Integer> numeros, int numero) {
        for (int n : numeros) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
    

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 6 números entre 1 e 60:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            while (numero < 1 || numero > 60 || jaContem(numeros, numero)) {
                if (jaContem(numeros, numero)) {
                    System.out.println("Número já digitado. Tente novamente.");
                } else {
                    System.out.println("Número inválido. Digite um número entre 1 e 60.");
                }
                System.out.print("Número inválido. Digite novamente: ");
                numero = scanner.nextInt();
            }
            numeros.add(numero);
        }
        scanner.close();
        Collections.sort(numeros);
        System.out.println("Números digitados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

    }
}
