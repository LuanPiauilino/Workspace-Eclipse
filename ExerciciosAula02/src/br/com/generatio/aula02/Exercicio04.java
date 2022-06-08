package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
* calcule a seguinte expressão:
*
* , onde
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double a , b , c , d , r , s; 

		
		System.out.println("Insira três números inteiros e positivos ");
		System.out.println("1º número; ");
		a = leia.nextDouble();
		
		System.out.println("2º número; ");
		b = leia.nextDouble();
		
		System.out.println("3º número; ");
		c = leia.nextDouble();
		
		r = Math.pow(a + b , 2.0);
		s = Math.pow(b + c , 2.0);	
		d = (r + s) / 2 ;

		System.out.println("\nEntão D é: " + d + ", e R e S são, respectativamente: " + r + " e " + s);

	}

}
