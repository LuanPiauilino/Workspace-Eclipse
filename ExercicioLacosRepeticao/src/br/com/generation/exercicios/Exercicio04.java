package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 4- Uma empresa desenvolveu uma pesquisa para saber as características
 * psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 * pessoas, calcule e mostre: (WHILE)
 * o número de pessoas calmas;
 * o número de mulheres nervosas;
 * o número de homens agressivos;
 * o número de outros calmos;
 * o número de pessoas nervosas com mais de 40 anos;
 * o número de pessoas calmas com menos de 18 anos.
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int pessoas=0;
		int idade=0;
		int maisNer=0;
		int menosCal=0;
		int outrosCal=0;
		int mulherNer=0;
		int homemAgr=0;
		int sexo =0;
		int temp=0;
		int calma=0;
		
		
		while(pessoas <=4) {
			System.out.println("Responda as perguntas da pesquisa");
			System.out.println("\nQual a sua idade:");
			idade = leia.nextInt();
			System.out.println("\nQual é seu sexo:(1-Feminino)(2-Masculino)(3-OUtros)");
			sexo = leia.nextInt();
			System.out.println("Marque o seu temperamento:(1-calmx)(2-nervosx)(3-agressivx)");
			temp = leia.nextInt();
			
			if(temp ==1) {
				calma++;
			}

			
			if(idade>40 && temp ==2) {
				maisNer++;
			}else if(idade <18 && temp==1){
				menosCal++;
			}
			
			
			if(sexo ==1 && temp ==3){
				mulherNer++;
			}else if(sexo ==2 && temp ==3) {
				homemAgr++;
			}else if(sexo ==3 && temp ==1){
				outrosCal++;
			}
		}
		System.out.println("o número de pessoas calmas é "+ calma);
		System.out.println("o número de mulheres nervosas é "+ mulherNer);
		System.out.println("o número de homens agressivos é "+ homemAgr);
		System.out.println("o número de outros calmos é "+ outrosCal);
		System.out.println("o número de pessoas calmxs com menos de 18 anos é "+ menosCal);
		System.out.println("o número de pessoas nervosxs com mais de 40 anos é "+ maisNer);
	}
}
