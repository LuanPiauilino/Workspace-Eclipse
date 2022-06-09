package br.com.generation.exercicio;
/* Generation Brasil - Java
 * Data: 09/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1. Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma
 * atividade e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int maiorPon=0;
		int pon []= new int[5];
		
		System.out.println("Digite as pontua��es da atividade. ");
		for(int i=0; i<pon.length; i++) {
			System.out.printf("Digite a %d� pontu��o:", (i+1));
			pon[i]= leia.nextInt();
			if(pon[i]>maiorPon) {
			maiorPon= pon[i];
			}
		}
		System.out.println("\n=====================================");
		System.out.println("A maoir pontu��o da atividade �: "+ maiorPon);
		System.out.println("=====================================");
	}
}
