package br.com.generation.telasamigaveis;

import javax.swing.JOptionPane;

public class TelasAmigaveis {

	public static void main(String[] args) {
	
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro:"));
		
		if(numero %4==0 && numero %5==0) {
			JOptionPane.showMessageDialog(null, "0 n�mero "+ numero+ "� divisivel por 4 e 5");
		}else {
			JOptionPane.showMessageDialog(null, "0 n�mero "+ numero+ "n�o � divisivel por 4 e 5");
		}
		
	}

}
