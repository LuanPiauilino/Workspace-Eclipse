package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 
* 
* 5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
* aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
* respectivamente.
 */

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int nota1 , nota2 , nota3 , prova1 , prova2, prova3 , media;
		
		System.out.println("insira suas notas: ");
		System.out.println("1� nota: ");
		nota1 = leia.nextInt();
		
		System.out.println("2� nota: ");
		nota2 = leia.nextInt();
		
		System.out.println("3� nota: ");
		nota3 = leia.nextInt();

		prova1 = nota1 * 2;
		prova2 = nota2 * 3;
		prova3 = nota3 * 5;

		media = (prova1 + prova2 + prova3) / 10;

		System.out.println("A m�dia final �: "+ media);
	}

}
