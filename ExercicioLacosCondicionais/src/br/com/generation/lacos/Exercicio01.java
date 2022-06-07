package br.com.generation.lacos;
/* Generation Brasil - Java
 * Data: 07/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
 */

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, maiorNumero;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite três números inteiro:"
																+ "\nDigite 1º número:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2º número:"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3º número:"));

		if(numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
		}else if(numero2 > numero1 && numero2 > numero3){
			maiorNumero = numero2;
		}else if(numero3 > numero1 && numero3 > numero2) {
			maiorNumero = numero3;
		}else {
			JOptionPane.showMessageDialog(null, "Opção inválida!!");
		}
	}

}
