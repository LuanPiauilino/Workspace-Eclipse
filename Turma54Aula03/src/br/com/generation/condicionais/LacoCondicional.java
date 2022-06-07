package br.com.generation.condicionais;
/* Generation Brasil- Java
 * Data: 07/06/2022
 * Aluno: Luan Piauilino
 */

import java.util.Scanner;

//Laços Condicionais
public class LacoCondicional {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		double nota1, nota2, media, soma;
		
		System.out.println("Digite a 1º nota do aluno: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a 2º nota do aluno: ");
		nota2 = leia.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		if(media >9.0) {
			System.out.println("Aprovado com louvores!!"+ "\nMédia"+ media );
		}
		else if(media >=6.0) {
			System.out.println("Aprovado!!"+ "\\nMédia: "+ media);
		}else if(media >3.0 && media <6.0){
			System.out.println("Recuperação!!"+ "\nMédia: "+ media);
		}else {
			System.out.println("Reprovado!!"+ "\nMédia"+ media);
		}
	
	}

}
