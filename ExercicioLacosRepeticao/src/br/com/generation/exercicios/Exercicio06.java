package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 6- Escrever um programa que receba v�rios n�meros inteiros no teclado. E no
final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)
*/

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			double num=0.0;
			double cont=-1.0;
		    double mediaM=0.0;
			double multiplo=0.0;
			
			do {
				System.out.println("Digite um n�mero:");
				num = leia.nextInt();
				if(num%3==0) {
					cont++;
					multiplo+=num;
				}
				mediaM = multiplo/ cont;
			}while(num !=0);
			System.out.println("A m�dia dos n�meros multiplos por 3 � "+ mediaM);
	}
}

