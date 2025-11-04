package Ruderson;

import java.util.Scanner;

public class RAO25 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO25 - Exercício 25: Tabuada com while");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\nDigite um número para ver a tabuada: ");
        int numero = scanner.nextInt();
        
        System.out.println("--- Tabuada do " + numero + " (com while) ---");
        
        int i = 1; 
        
        while (i <= 10) { 
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++; 
        }
        
        scanner.close();
    }
}