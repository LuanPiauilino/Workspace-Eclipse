package br.com.generation.condicionais;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		//Escolha Caso
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva uma letra: ");
		char letra = leia.next().charAt(0);
		
		switch(letra) {
			case 'a', 'A', 'n':
				System.out.println("Annie");
			break;
			case 'f':
				System.out.println("Felipe");
			break;
			default:
				System.out.println("Opção inválida");
			break;
		}
			
	}

}
