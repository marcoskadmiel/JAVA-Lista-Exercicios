package Ruderson;

public class RAO28 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO28 - Exercício 28: Soma dos pares entre 1 e 100");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 
        
        int somaPares = 0;
        int i = 1;
        
        while (i <= 100) {
            if (i % 2 == 0) { 
                somaPares = somaPares + i;
            }
            i++;
        }
        
        System.out.println("\nA soma de todos os números pares entre 1 e 100 é: " + somaPares);
    }
}