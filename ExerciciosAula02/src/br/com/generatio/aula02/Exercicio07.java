package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 
* 
* 7. Um sistema de equações lineares do tipo:
*
* , pode ser resolvido segundo mostrado abaixo :
*
* Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
* valores de x e y.
 */

import java.util.Scanner;
import java.io.*;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int a , b , c , d , e , f , x ,y;
		
		System.out.println("informe os coeficientes:\na: ");
		a = leia.nextInt();

		System.out.println("b: ");
		b = leia.nextInt();
		
		System.out.println("c: ");
		c = leia.nextInt();
		
		System.out.println("d: ");
		d = leia.nextInt();
		
		System.out.println("e: ");
		e = leia.nextInt();
		
		System.out.println("f: ");
		f = leia.nextInt();
		

		x = (((c * e) - (b * f)) / ((a * e) - (b * d))); 
		y = (((a * f) - (c * d)) / ((a * e) - (b * d)));

		System.out.println("\nOs valores de x e y são: " + x + " e " + y);
	}

}
