package br.com.generation.exercicio;
/* Generation Brasil - Java
 * Data: 09/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
 * que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
 * imprima a média aritmética dos lançamentos, contabilize e apresente também
 * quantas foram as ocorrências da maior pontuação.
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
			System.out.printf("Resultado do %dº lançamento: ", (i+1));
			System.out.println(dado[i]);
			
			if(dado[i]==6) {
				contaLanca++;
			}
			
			somaLanca+=dado[i];
			mediaLanca= somaLanca/10;
		}
		
		System.out.println("\n=====================================");
		System.out.println(
		"A média dos lançamentos dos foi "+ mediaLanca +" e foram lançado "+ contaLanca+" o maior número");
		System.out.println("=====================================");
	}

}
