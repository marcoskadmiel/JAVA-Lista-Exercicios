package Ruderson;

import java.util.Scanner;

public class RAO06 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO06 - Exercício 6: Múltiplo de 3 e/ou 5");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número inteiro: ");
        int numero = scanner.nextInt();
        
        boolean multiploDe3 = (numero % 3 == 0);
        boolean multiploDe5 = (numero % 5 == 0);
        
        if (multiploDe3 && multiploDe5) {
            System.out.println("O número é múltiplo de 3 E de 5.");
        } else if (multiploDe3) {
            System.out.println("O número é múltiplo APENAS de 3.");
        } else if (multiploDe5) {
            System.out.println("O número é múltiplo APENAS de 5.");
        } else {
            System.out.println("O número não é múltiplo nem de 3 nem de 5.");
        }
        
        scanner.close(); 
    }
}