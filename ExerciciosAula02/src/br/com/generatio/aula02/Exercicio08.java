package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 
* 
* 8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a
* percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
* Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
* escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao
* consumidor.
 */

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int valorFabrica , porDistribuidor , porImpostos 
		, carroComDistribuidor , carroComImpostos , precoTotal;

		porDistribuidor = 28;
		porImpostos = 45;
		
		System.out.println("Qual o valor de fábrica do carro: ");
		valorFabrica = leia.nextInt();

		carroComDistribuidor = (valorFabrica * porDistribuidor) / 100;
		carroComImpostos = (valorFabrica * porImpostos) / 100;

		precoTotal = valorFabrica + carroComDistribuidor + carroComImpostos;

		System.out.println("\nO valor total do carro será: " + precoTotal);
	}

}
