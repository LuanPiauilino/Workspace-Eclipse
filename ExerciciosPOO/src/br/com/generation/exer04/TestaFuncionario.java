package br.com.generation.exer04;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 4) Crie uma classe funcionario e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto funcionario, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */
import java.util.Scanner;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Funcionario func01 = new Funcionario();
		
		func01.nome= "João";
		func01.cargo= "Estágiario";
		func01.salario= 3000.00;

		
		System.out.printf("Informações do funcionário: ");
		System.out.println(func01.nome);
		System.out.println("==========================================\n");
		System.out.printf("Cargo: ");
		System.out.println(func01.cargo);
		System.out.println("Salário: ");
		System.out.println(func01.salario);
		func01.trabalhando();
		System.out.println("==========================================\n");
		
		System.out.printf("Quantas horas esse Funcionário trabalhou: ");
		func01.cargoHoraria(leia.nextInt());
	}

}
