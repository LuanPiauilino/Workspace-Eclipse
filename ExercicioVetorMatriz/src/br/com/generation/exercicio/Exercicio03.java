package br.com.generation.exercicio;
/*Generation Brasil - Java
 * Data: 09/06/2022
 * Aluno: Luan Piauilino
 * 
 * 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
 *
 * a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
 * das matrizes N1 e N2;
 * b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
 * posição das matrizes N1 e N2.
 */

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] n1 = new int[2][2];
		int[][] n2 = new int[2][2];
		int[][] m1 = new int[2][2];
		int[][] m2 = new int[2][2];
		
		System.out.println("Dados da matriz N1");
		for(int l=0; l<n1.length; l++) {
			for(int c=0; c<n1[l].length; c++) {
			System.out.printf("Resultado da %d º coluna: ", (n1[l][c]+1));
			n1[l][c]= leia.nextInt();
			}
			System.out.println();
		}
		System.out.println("Dados da matriz N2");
		for(int l=0; l<n2.length; l++) {
			for(int c=0; c<n2[l].length; c++) {
				System.out.printf("Resultado da %d º coluna: ", (n2[l][c]+1));
				n2[l][c]= leia.nextInt();
			}
			System.out.println();
		}
		System.out.println("\n===================================");
		System.out.println("Soma dos dados da matriz N1 e N2");
		System.out.println("\n===================================");
		
		for(int l=0; l<m1.length; l++) {
			for(int c=0; c<m1[l].length; c++) {
				m1[l][c]= n1[l][c]+ n2[l][c];
				System.out.printf("%d  | ", (m1[l][c]+1));
			}
			System.out.println();
		}
		System.out.println("\n===================================");
		System.out.println("Diferença dos dados da matriz N1 e N2");
		System.out.println("\n===================================");
		
		for(int l=0; l<m2.length; l++) {
			for(int c=0; c<m2[l].length; c++) {
				m2[l][c]= n1[l][c]- n2[l][c];
				System.out.printf("%d  | ", m2[l][c]);
			}
			System.out.println();
		}
	}
}


