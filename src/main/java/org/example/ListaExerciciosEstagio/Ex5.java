package org.example.ListaExerciciosEstagio;

import java.util.Scanner;

public class Ex5 {

    static String inverterString(String str){

        String reverso = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reverso += str.charAt(i);
        }

        return  reverso;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("inverta sua string aqui: ");
        String input = scanner.nextLine();

        String reverterString = inverterString(input);

        System.out.println("String invertida: " + reverterString);

        scanner.close();
    }
}
