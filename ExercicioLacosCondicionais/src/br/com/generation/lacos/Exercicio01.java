package br.com.generation.lacos;
/* Generation Brasil - Java
 * Data: 07/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
 */

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, maiorNumero;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite tr�s n�meros inteiro:"
																+ "\nDigite 1� n�mero:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2� n�mero:"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3� n�mero:"));

		if(numero1 > numero2 && numero1 > numero3) {
			maiorNumero = numero1;
		}else if(numero2 > numero1 && numero2 > numero3){
			maiorNumero = numero2;
		}else if(numero3 > numero1 && numero3 > numero2) {
			maiorNumero = numero3;
		}else {
			JOptionPane.showMessageDialog(null, "Op��o inv�lida!!");
		}
	}

}
