package Ruderson;

public class RAO13 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO13 - Exercício 13: Soma dos 100 primeiros números");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 
        
        int soma = 0;
        
        for (int i = 1; i <= 100; i++) {
            soma = soma + i; 
        }
        
        System.out.println("\nA soma dos números de 1 até 100 é: " + soma);
    }
}