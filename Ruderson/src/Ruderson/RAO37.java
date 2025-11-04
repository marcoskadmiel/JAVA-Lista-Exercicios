package Ruderson;

import java.util.Scanner;

public class RAO37 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO37 - Exercício 37: Soma até o número ser múltiplo de 10");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;
        
        System.out.println("\nDigite números. O programa para quando um múltiplo de 10 for digitado.");
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            if (numero % 10 != 0) { // Se NÃO for múltiplo de 10
                [cite_start]soma = soma + numero; [cite: 126]
            }
            
        } while (numero % 10 != 0); [cite_start]// Repete ENQUANTO não for múltiplo de 10 [cite: 126]
        
        System.out.println("Múltiplo de 10 digitado. A soma dos anteriores é: " + soma);
        
        scanner.close();
    }
}