package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
* calcule a seguinte express�o:
*
* , onde
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a , b , c , d , r , s; 

		
		System.out.println("Insira tr�s n�meros inteiros e positivos ");
		System.out.println("1� n�mero; ");
		a = leia.nextDouble();
		
		System.out.println("2� n�mero; ");
		b = leia.nextDouble();
		
		System.out.println("3� n�mero; ");
		c = leia.nextDouble();
		
		r = Math.pow(a + b , 2.0);
		s = Math.pow(b + c , 2.0);	
		d = (r + s) / 2 ;

		System.out.println("\nEnt�o D �: " + d + ", e R e S s�o, respectativamente: " + r + " e " + s);

	}

}
