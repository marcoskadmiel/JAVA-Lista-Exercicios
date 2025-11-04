package Ruderson;

import java.util.Scanner;

public class RAO35 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO35 - Exercício 35: Número positivo obrigatório");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        double numero;
        
        [cite_start]// Pede o número pelo menos uma vez [cite: 122]
        do {
            System.out.print("\nDigite um número POSITIVO: ");
            numero = scanner.nextDouble();
            
            if (numero <= 0) {
                System.out.println("Valor inválido. O número deve ser maior que zero.");
            }
            
        } while (numero <= 0); [cite_start]// Repete se o número não for positivo [cite: 122]
        
        System.out.println("Número válido digitado: " + numero);
        
        scanner.close();
    }
}