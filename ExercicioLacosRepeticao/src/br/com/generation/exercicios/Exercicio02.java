package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
			
			int impar=0, par=0;
			
			
			System.out.println("Digite 10 n�meros:");
			
			for(int num=0, contagem=1; contagem<=10; num++, contagem++) {
				System.out.println("Digite "+ (contagem) + "� n�mero:");
				num = leia.nextInt();
				
				if(num%2==0) {
					par++;
				}else {
					impar++;
				}
			}
			System.out.println("Dos 10 n�meros, "+ par +" s�o par e "+ impar +" s�o �mpar.");
	}
}

