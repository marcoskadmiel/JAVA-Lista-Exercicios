package Ruderson;

import java.util.Scanner;

public class RAO10 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO10 - Exercício 10: Ano bissexto");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um ano (ex: 2024): ");
        int ano = scanner.nextInt();
        
        boolean bissexto = false;
        
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            bissexto = true;
        }
        
        if (bissexto) {
            System.out.println("O ano " + ano + " é BISSEXTO.");
        } else {
            System.out.println("O ano " + ano + " NÃO é bissexto.");
        }
        
        scanner.close(); 
    }
}