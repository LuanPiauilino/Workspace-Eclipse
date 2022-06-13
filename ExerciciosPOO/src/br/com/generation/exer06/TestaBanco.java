package br.com.generation.exer06;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 6) Crie uma classe banco e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto banco, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */

import java.util.Scanner;

public class TestaBanco {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Banco cliente1 = new Banco();
		
		cliente1.nome= "Matheus da Silva";
		cliente1.conta= "1234";
		cliente1.agencia= "123456-0";
		cliente1.saldo= 2137.98;
		int acao;
		int depoSaca;

		
		System.out.println("        EXTRATO DA CONTA");
		System.out.printf("Conta: ");
		System.out.printf(cliente1.conta);
		System.out.printf("       Agência: ");
		System.out.printf(cliente1.agencia);
		System.out.printf("\nNome: ");
		System.out.println(cliente1.nome);
		System.out.println("======================================");
		System.out.println("======================================");
		System.out.println("======================================");
		System.out.printf("Saldo: ");
		System.out.println(cliente1.saldo);
		System.out.println("======================================\n");
		
		System.out.println("Vai querer fazer mais alguma ação?\n1-Sim\n2-Não");
		acao= leia.nextInt();

		if(acao==1) {
			System.out.println("Você quer depositar ou sacar?\n1-Depositar\n2-Sacar");
			depoSaca= leia.nextInt();
			if(depoSaca==1) {
				System.out.println("Quantos você quer depositar?");
				cliente1.depositar(leia.nextDouble());
				System.out.println("======================================");
				System.out.println("Boa Tarde, "+ cliente1.nome);
			}else if(depoSaca==2) {
				System.out.println("Quantos você quer sacar?");
				cliente1.sacar(leia.nextDouble());
				System.out.println("======================================");
				System.out.println("Boa Tarde, "+ cliente1.nome);
			}else {
				System.out.println("Valor inválido");
				System.out.println("======================================");
				System.out.println("Boa Tarde, "+ cliente1.nome);
			}
		}else {
			System.out.println("======================================");
			System.out.println("Boa Tarde, "+ cliente1.nome);
		}
	}

}
