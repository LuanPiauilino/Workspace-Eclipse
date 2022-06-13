package br.com.generation.exer05;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 5) Crie uma classe patinete e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto patinete, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

import java.util.Scanner;

public class TestaPatinete {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		patinete pat1 = new patinete();
		
		pat1.cor= "Verde";
		pat1.tipo= "Infatil";
		pat1.modelo= "Barbie";
		pat1.preco= 500.0;
		
		
		
		System.out.println("Informações do Produto.");
		System.out.println("===============================\n");
		System.out.printf("Modelo: ");
		System.out.println(pat1.modelo);
		System.out.printf("Cor: ");
		System.out.println(pat1.cor);
		System.out.printf("Tipo: ");
		System.out.println(pat1.tipo);
		System.out.printf("\nPreço do Produto: ");
		System.out.println(pat1.preco);
		
		
		System.out.println("===============================\n");
		System.out.println("Quantidade em estoque: ");
		pat1.estoque(leia.nextInt());
		System.out.println("===============================\n");
		System.out.println("Qual vai ser o desconto: ");
		pat1.modificaPreco(leia.nextDouble());
	}

}
