package br.com.generation.lacos;
/* Generation Brasil - Java
* Data: 07/06/2022
* Aluno: Luan Piauilino
* 
* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
* categoria ela se encontra:
* 10-14 infantil
* 15-17 juvenil
* 18-25 adulto
*/

import javax.swing.JOptionPane;

public class Exercicio03 {

	public static void main(String[] args) {
	
		int idade;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));

		if(idade>=18 && idade<=25) {
			JOptionPane.showMessageDialog(null,"Você está na categoria Adulto!");
		}else if(idade>=15) {
			JOptionPane.showMessageDialog(null,"Você está na categoria Juvenil!");
		}else if(idade>=10) {
			JOptionPane.showMessageDialog(null,"Você está na categoria Infantil!");
		}else {
			JOptionPane.showMessageDialog(null,"Ainda não criamos uma categoria para sua idade!");
		}
	}

}
