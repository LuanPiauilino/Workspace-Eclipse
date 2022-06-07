package br.com.generation.lacos;
/* Generation Brasil - Java
* Data: 07/06/2022
* Aluno: Luan Piauilino
* 
* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
* número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
* ímpar exiba o número elevado ao quadrado.
*/

import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double numero, numeroRaiz, numeroElevado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número:"));

		if(numero%2==0) {
			numeroRaiz = Math.sqrt(numero);	
			JOptionPane.showMessageDialog(null,"O número é par e "
												+ "sua raiz quadrada é"+ numeroRaiz);
		}else {
			numeroElevado = Math.pow(numero, 2.0);
			JOptionPane.showMessageDialog(null,"O número é ímpar e "
												+ "ele elevado ao quadrado é "+ numeroElevado);
			
		}
	}

}
