package br.com.generatio.aula02;
/* Generation Brasil - Java 
* Data: 06/06/2022
* Aluno: Luan Piauilino
* 
* 
* 8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
* percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
* Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
* escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
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
		
		System.out.println("Qual o valor de f�brica do carro: ");
		valorFabrica = leia.nextInt();

		carroComDistribuidor = (valorFabrica * porDistribuidor) / 100;
		carroComImpostos = (valorFabrica * porImpostos) / 100;

		precoTotal = valorFabrica + carroComDistribuidor + carroComImpostos;

		System.out.println("\nO valor total do carro ser�: " + precoTotal);
	}

}
