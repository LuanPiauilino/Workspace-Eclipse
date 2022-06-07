package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
*
* 3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
* expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */ 

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		int hora , minutos , segundos , horaEvento , minutoEvento , segundoEvento;

		hora = 3600;
		minutos = 60;

		System.out.println("Tem de duração do evento em segundos: ");
		segundos = leia.nextInt();

	   	horaEvento = segundos / hora;
	   	minutoEvento = (segundos % hora) / minutos;
	   	segundoEvento = (segundos % hora) % minutos;
	   	
		System.out.println("\nO tempo de duração do envento foi: " + horaEvento 
		+ " horas, " + minutoEvento + " minutos e " + segundoEvento + " segundos!");

	}

}
