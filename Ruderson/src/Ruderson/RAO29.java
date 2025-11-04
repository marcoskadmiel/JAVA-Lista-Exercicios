package Ruderson;

import java.util.Scanner;

public class RAO29 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO29 - Exercício 29: Contar dígitos de um número");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        int numeroOriginal = numero; 
        int contadorDigitos = 0;
        
        if (numero == 0) {
            contadorDigitos = 1;
        } else {
            while (numero > 0) {
                numero = numero / 10; 
                contadorDigitos++;
            }
        }
        
        System.out.println("O número " + numeroOriginal + " tem " + contadorDigitos + " dígito(s).");
        
        scanner.close();
    }
}