package br.com.generation.exer04;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 4) Crie uma classe funcionario e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto funcionario, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
 */
public class Funcionario {
	
	String nome;
	String cargo;
	double salario;
	
	void trabalhando() {
		System.out.println("Est� trabalhando...");
	}
	void cargoHoraria(int horas) {
		if(horas>=120) {
			System.out.println("O FUNCION�RIO J� BATEU A CARGA HOR�RIA DO M�S.");
		}else {
			System.out.println("O FUNCION�RIO N�O BATEU A CARGA HOR�RIA DO M�S.");
		}
	}

}
