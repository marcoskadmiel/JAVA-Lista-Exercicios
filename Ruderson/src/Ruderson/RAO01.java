package Ruderson; 

import java.util.Scanner; 

public class RAO01 { 

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO01 - Exercício 1: Número positivo ou negativo");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número inteiro: ");
        int numero = scanner.nextInt(); 
        
        if (numero > 0) {
            System.out.println("O número " + numero + " é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO.");
        }
        
        scanner.close(); 
    }
}