package br.com.generation.exer06;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 6) Crie uma classe banco e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto banco, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

public class Banco {
	
	String nome;
	String conta;
	String agencia;
	double saldo;
	
	
	void depositar(double valor) {
		double soma=0;
		soma= saldo + valor;
		saldo= soma;
		System.out.println("O seu saldo é: "+ saldo);
	}
	void sacar(double valor) {
		double subtracao;
		subtracao= saldo - valor;
		saldo= subtracao;
		System.out.println("O seu saldo é: "+ saldo);
	}

}
