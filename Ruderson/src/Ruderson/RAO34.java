package Ruderson;

import java.util.Scanner;

public class RAO34 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO34 - Exercício 34: Pedir senha até acertar");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1111;
        int tentativa;
        
        do {
            System.out.print("\nDigite a senha (números): ");
            tentativa = scanner.nextInt();
            
            if (tentativa != senhaCorreta) {
                System.out.println("Senha incorreta.");
            }
            
        } while (tentativa != senhaCorreta); [cite_start]// Continua pedindo até acertar [cite: 118]
        
        [cite_start]System.out.println("Acesso liberado!"); [cite: 118]
        
        scanner.close();
    }
}