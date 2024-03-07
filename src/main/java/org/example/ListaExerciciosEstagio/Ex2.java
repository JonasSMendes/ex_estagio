package org.example.ListaExerciciosEstagio;

import java.util.Scanner;

public class Ex2 {


    static boolean Fibonacci(int n) {
        int a = 0;
        int b = 1;

        if (n == 0 || n == 1)
            return true;


        while (b <= n) {
            int temp = a + b;
            a = b;
            b = temp;
            if (b == n)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para verificar se ele pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (Fibonacci(numero))
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        else
            System.out.println(numero + " não pertence à sequência de Fibonacci.");

        scanner.close();
    }
}
