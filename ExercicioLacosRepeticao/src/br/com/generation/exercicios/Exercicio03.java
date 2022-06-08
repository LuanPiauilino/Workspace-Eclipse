package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
 * 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
 * idade for =-99. (WHILE)
 */

import java.util.Scanner;



public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
			int menos21, mais50, idade;
			
			idade=0;
			menos21=0;
			mais50=0;

			while(idade !=-99) {
				System.out.println("Qual a sua idade: ");
				idade = leia.nextInt();
				
				if(idade <=21) {
					menos21++;
				}else if(idade >50) {
					mais50++;
				}else {
					System.out.println("=============================");
					System.out.println("Sua idade não faz parte da pesquisa!!");
					System.out.println("=============================\n");
				}
				System.out.println("O total de pessoas com menos de 21 anos é "+ menos21 														+" e com mais de 50 anos é "+ mais50 +"\n");
				}
	}
}

