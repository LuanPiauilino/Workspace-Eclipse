package br.com.generation.exer01;
/* Generation Brasil - Java
 * Data: 10/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1) Crie uma classe cliente e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto cliente, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
 */
public class Cliente {
	
	int formulario;
	String nome;
	String problema;
	boolean hora;
	String doutor;
	
	void marcaHorario(boolean horario ) {
		System.out.println("          HOR�RIO MARCADO");
	}
	void qualDoutor(String medico) {
	     System.out.println("O medico do paciente � o "+ medico);
	}
	

}
