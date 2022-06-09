package br.com.generation.exercicio;
/* Generation Brasil - Java
 * Data: 09/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2. Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa
 * que gere um vetor com os lan�amentos, escreva esse vetor. A seguir determine e
 * imprima a m�dia aritm�tica dos lan�amentos, contabilize e apresente tamb�m
 * quantas foram as ocorr�ncias da maior pontua��o.
 */

import java.util.Random;


public class Exercicio02 {

	public static void main(String[] args) {
	
		Random lanca = new Random();
		
		int[] dado = new int[10];
		int contaLanca=0;
		int mediaLanca=0;
		int somaLanca=0;
		
		for(int i=0; i<dado.length; i++) {
			dado[i]= lanca.nextInt(7);			
			System.out.printf("Resultado do %d� lan�amento: ", (i+1));
			System.out.println(dado[i]);
			
			if(dado[i]==6) {
				contaLanca++;
			}
			
			somaLanca+=dado[i];
			mediaLanca= somaLanca/10;
		}
		
		System.out.println("\n=====================================");
		System.out.println(
		"A m�dia dos lan�amentos dos foi "+ mediaLanca +" e foram lan�ado "+ contaLanca+" o maior n�mero");
		System.out.println("=====================================");
	}

}
