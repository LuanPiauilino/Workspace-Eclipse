package br.com.generation.lacos;
/* Generation Brasil - Java
* Data: 07/06/2022
* Aluno: Luan Piauilino
* 
* 4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
* n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
* �mpar exiba o n�mero elevado ao quadrado.
*/

import javax.swing.JOptionPane;
import java.lang.Math;

public class Exercicio04 {

	public static void main(String[] args) {
		
		double numero, numeroRaiz, numeroElevado;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero:"));

		if(numero%2==0) {
			numeroRaiz = Math.sqrt(numero);	
			JOptionPane.showMessageDialog(null,"O n�mero � par e "
												+ "sua raiz quadrada �"+ numeroRaiz);
		}else {
			numeroElevado = Math.pow(numero, 2.0);
			JOptionPane.showMessageDialog(null,"O n�mero � �mpar e "
												+ "ele elevado ao quadrado � "+ numeroElevado);
			
		}
	}

}
