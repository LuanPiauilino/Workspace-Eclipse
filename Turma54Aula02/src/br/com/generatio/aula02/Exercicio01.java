package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino 
* 
* 
* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
*  
* dias e mostre-a expressa apenas em dias.
 */

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano, mes, meses, dias, anos, anosEmDias, mesesEmDias, totalDias;

		ano = 365;
		mes = 30;
		
		System.out.println("Fale quantos anos tem: ");
		anos = leia.nextInt();
		
		System.out.println("Quantos Meses: ");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias: ");
		dias = leia.nextInt();


		anosEmDias = anos * ano;
		mesesEmDias = meses * mes;
		
		totalDias = anosEmDias + mesesEmDias + dias;

		System.out.println("Você Viveu o total de: " + totalDias + " dias!");
	}

}
