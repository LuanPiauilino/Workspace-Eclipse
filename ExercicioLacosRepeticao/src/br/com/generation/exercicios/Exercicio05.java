package br.com.generation.exercicios;

/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 5- Crie um programa que leia um n�mero do teclado at� que encontre um
 * n�mero igual a zero. No final, mostre a soma dos n�meros
 * digitados.(DO...WHILE)
*/

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
			int num=0;
			int soma=0;
			
			do {
				System.out.println("Digite um n�mero:");
				num = leia.nextInt();
				soma+=num;
			}while(num !=0);
			System.out.println("A soma dos n�meros digitados � "+ soma);
	}
}
