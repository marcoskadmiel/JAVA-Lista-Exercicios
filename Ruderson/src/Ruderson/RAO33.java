package Ruderson;

import java.util.Scanner;

public class RAO33 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO33 - Exercício 33: Menu com opção de sair");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Mensagem");
            System.out.println("2 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextInt();
            
            if (opcao == 1) {
                [cite_start]System.out.println("Você escolheu a mensagem!"); [cite: 115]
            }
            
        } while (opcao != 2); [cite_start]// Repete enquanto a opção for diferente de 2 [cite: 113, 116]
        
        System.out.println("Saindo do programa...");
        
        scanner.close();
    }
}