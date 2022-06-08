package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
*
*
* 6. Construa um programa em c que, tendo como dados de entrada dois pontos
* quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
* que efetua tal cálculo é:
 */

import java.util.Scanner;
import java.lang.Math;

public class Exercicio06 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		double x1 , x2 , y1 , y2 , d , potenciaX , potenciaY;

		
		System.out.println("Digite o x1: ");
		x1 = leia.nextDouble();
		
		System.out.println("Digite o x2: ");
		x2 = leia.nextDouble();
		
		System.out.println("Digite o y1: ");
		y1 = leia.nextDouble();
		
		System.out.println("Digite o y2: ");
		y2 = leia.nextDouble();

		
		potenciaX = Math.pow(x2 + x1, 2.0);
		potenciaY = Math.pow(y2 + y1, 2.0);
		d = Math.sqrt (potenciaX + potenciaY);
		
		System.out.println("A distância entres os dois pontos é: " + d);
	}

}
