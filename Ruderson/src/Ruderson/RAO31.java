package Ruderson;

public class RAO31 {

    public static void main(String[] args) {
        
        System.out.println("************************************************");
        System.out.println("* Aluno: Ruderson Alves Oliveira - RA: 0023898"); 
        System.out.println("* Classe RAO31 - Exercício 31: Contar de 1 a 10");
        System.out.println("************************************************");
        System.out.println("abaixo o restante do código "); 
        
        System.out.println("\nContando de 1 a 10 com do-while:");
        
        int i = 1;
        
        // O 'do-while' executa o bloco de código PRIMEIRO
        // e SÓ DEPOIS verifica a condição.
        do {
            System.out.println(i);
            i++;
        } while (i <= 10); // Condição checada no final
    }
}