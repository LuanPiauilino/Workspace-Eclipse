package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 4- Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
 * psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
 * era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
 * agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
 * pessoas, calcule e mostre: (WHILE)
 * o n�mero de pessoas calmas;
 * o n�mero de mulheres nervosas;
 * o n�mero de homens agressivos;
 * o n�mero de outros calmos;
 * o n�mero de pessoas nervosas com mais de 40 anos;
 * o n�mero de pessoas calmas com menos de 18 anos.
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
			System.out.println("\nQual � seu sexo:(1-Feminino)(2-Masculino)(3-OUtros)");
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
		System.out.println("o n�mero de pessoas calmas � "+ calma);
		System.out.println("o n�mero de mulheres nervosas � "+ mulherNer);
		System.out.println("o n�mero de homens agressivos � "+ homemAgr);
		System.out.println("o n�mero de outros calmos � "+ outrosCal);
		System.out.println("o n�mero de pessoas calmxs com menos de 18 anos � "+ menosCal);
		System.out.println("o n�mero de pessoas nervosxs com mais de 40 anos � "+ maisNer);
	}
}
