package br.com.generation.exer04;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 4) Crie uma classe funcionario e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto funcionario, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */
public class Funcionario {
	
	String nome;
	String cargo;
	double salario;
	
	void trabalhando() {
		System.out.println("Está trabalhando...");
	}
	void cargoHoraria(int horas) {
		if(horas>=120) {
			System.out.println("O FUNCIONÁRIO JÁ BATEU A CARGA HORÁRIA DO MÊS.");
		}else {
			System.out.println("O FUNCIONÁRIO NÃO BATEU A CARGA HORÁRIA DO MÊS.");
		}
	}

}
