package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
			
			int impar=0, par=0;
			
			
			System.out.println("Digite 10 números:");
			
			for(int num=0, contagem=1; contagem<=10; num++, contagem++) {
				System.out.println("Digite "+ (contagem) + "º número:");
				num = leia.nextInt();
				
				if(num%2==0) {
					par++;
				}else {
					impar++;
				}
			}
			System.out.println("Dos 10 números, "+ par +" são par e "+ impar +" são ímpar.");
	}
}

