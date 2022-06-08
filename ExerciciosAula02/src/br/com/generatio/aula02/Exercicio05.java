package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 
* 
* 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
* aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
* respectivamente.
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int nota1 , nota2 , nota3 , prova1 , prova2, prova3 , media;
		
		System.out.println("insira suas notas: ");
		System.out.println("1º nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("2º nota: ");
		nota2 = leia.nextInt();
		
		System.out.println("3º nota: ");
		nota3 = leia.nextInt();

		prova1 = nota1 * 2;
		prova2 = nota2 * 3;
		prova3 = nota3 * 5;

		media = (prova1 + prova2 + prova3) / 10;

		System.out.println("A média final é: "+ media);
	}

}
