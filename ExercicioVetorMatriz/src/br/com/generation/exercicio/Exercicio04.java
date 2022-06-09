package br.com.generation.exercicio;
/* Generation Brasil - Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
 * em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
 * diagonal, ou seja, diagonal principal.
 */

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int soma= 0;
		int somaDiagonal= 0;
		
		System.out.println("    Complete a matriz    ");
		System.out.println("============================");
		
		for(int l=0; l<matriz.length; l++) {
			for(int c=0; c<matriz[l].length; c++) {
				System.out.print("Digite um número: ");
				matriz[l][c]= leia.nextInt();
				soma+= matriz[l][c];
				somaDiagonal= matriz[0][0]+matriz[1][1]+matriz[2][2];
			}
		}
		System.out.println("\n==================================");
		System.out.println(
				"A soma da matriz é "+ soma +" e a soma da diagona principal é "+ somaDiagonal);
		System.out.println("==================================");
	}

}
