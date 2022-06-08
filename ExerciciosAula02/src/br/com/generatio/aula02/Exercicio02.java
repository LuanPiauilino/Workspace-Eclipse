package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 
* 2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
* expressa em anos, meses e dias.
 */

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade , ano , mes , dia , anos , meses , dias;

		ano = 365;
		mes = 30;
		dia = 1;
		
		System.out.println("Insira sua idade em dias: ");
		idade = leia.nextInt();
		
		anos = idade / ano;
		meses = (idade % ano) / mes;
		dias = (idade % ano) % mes;

		System.out.println("\nSua idade em anos, meses e dias é: " 
		+ anos + " anos, " + meses + " meses e " + dias + " dias!");

	}

}
