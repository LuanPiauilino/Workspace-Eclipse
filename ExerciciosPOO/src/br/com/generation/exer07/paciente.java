package br.com.generation.exer07;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 7) Crie uma classe paciente e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto paciente, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
 */
public class paciente {

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
