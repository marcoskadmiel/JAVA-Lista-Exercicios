package Ruderson;

import java.util.Scanner;

public class RAO30 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO30 - Exercício 30: Menu até escolher sair");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        String opcao = "";
        
        while ( !opcao.equalsIgnoreCase("sair") ) { 
            
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver Mensagem");
            System.out.println("2. Ver Hora");
            System.out.println("Digite 'sair' para terminar.");
            System.out.print("Escolha uma opção: ");
            
            opcao = scanner.nextLine();
            
            if (opcao.equals("1")) {
                System.out.println("Opção 1 escolhida: Olá, Ruderson!");
            } else if (opcao.equals("2")) {
                System.out.println("Opção 2 escolhida: Hora de estudar Java!");
            } else if (opcao.equalsIgnoreCase("sair")) {
                System.out.println("Saindo do programa...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}