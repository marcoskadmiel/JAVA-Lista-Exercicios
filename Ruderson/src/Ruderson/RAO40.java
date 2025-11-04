package Ruderson;

import java.util.Scanner;

public class RAO40 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO40 - Exercício 40: Ler números e mostrar o maior");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int numero;
        // Começa o 'maior' com o menor valor possível
        int maiorNumero = Integer.MIN_VALUE; 
        
        System.out.println("\nDigite números positivos. Digite um negativo para parar.");
        
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();
            
            // Só compara se o número for positivo
            if (numero >= 0) {
                if (numero > maiorNumero) {
                    maiorNumero = numero; // Atualiza o maior
                }
            }
            
        } while (numero >= 0); [cite_start]// Repete enquanto o número for positivo (ou zero) [cite: 133]
        
        // Verifica se algum número positivo foi digitado
        if (maiorNumero == Integer.MIN_VALUE) {
            System.out.println("Nenhum número positivo foi digitado.");
        } else {
            [cite_start]System.out.println("O maior número positivo digitado foi: " + maiorNumero); [cite: 134]
        }
        
        scanner.close();
    }
}