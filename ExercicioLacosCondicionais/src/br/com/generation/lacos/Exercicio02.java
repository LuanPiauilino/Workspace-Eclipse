package br.com.generation.lacos;
/* Generation Brasil - Java
 * Data: 07/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */

import javax.swing.JOptionPane;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numero1, numero2, numero3, maiorValor, meioValor, menorValor;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite tr�s n�meros inteiro:"
				+ "\nDigite 1� n�mero:"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite 2� n�mero:"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 3� n�mero:"));

		if(numero1 > numero2 && numero2 > numero3 && numero1 > numero3) {
			maiorValor = numero1;
			meioValor = numero2;
			menorValor = numero3;
		}else if(numero1 > numero2 && numero1 > numero3 && numero3 > numero2) {
				maiorValor = numero1;
				meioValor = numero3;
				menorValor = numero2;
		}else if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
			maiorValor = numero2;
			meioValor = numero1;
			menorValor = numero3;
		}else if(numero2 > numero1 && numero2 > numero3 && numero3 > numero1) {
			maiorValor = numero2;
			meioValor = numero3;
			menorValor = numero1;
		}else if(numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
			maiorValor = numero3;
			meioValor = numero1;
			menorValor = numero2;
		}else if(numero3 > numero1 && numero3 > numero2 && numero2 > numero1) {
			maiorValor = numero3;
			meioValor = numero2;
			menorValor = numero3;
		}else if(numero1 == numero2 && numero2 == numero3) {
			JOptionPane.showMessageDialog(null, "Como o valor dos n�meros � o mesmo"
												+ ", ent�o n�o tem uma ordem crescente.");
		}else {
			JOptionPane.showMessageDialog(null, "Op��o inv�lida");
		}
	}
}
