package br.com.generation.exer07;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 7) Crie uma classe paciente e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto paciente, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
 */


public class TestaPaciente {

	public static void main(String[] args) {

 paciente cliente= new paciente();
		
 		cliente.formulario= 123;
 		cliente.nome= "Jo�o Pereira";
 		cliente.problema= "Escoliose";
 		cliente.hora= true;
 		cliente.doutor= "Doutor Eduardo";
		
		System.out.println("***************************************");
		System.out.println("        INFORMA��O DO PACIENTE");
		System.out.println("***************************************");
		System.out.printf("Formul�rio: ");
		System.out.println(cliente.formulario);
		System.out.printf("Nome do Paciente: ");
		System.out.println(cliente.nome);
		System.out.printf("Diagn�stico do Cliente: ");
		System.out.println(cliente.problema);
		System.out.println("***************************************");
		cliente.marcaHorario(cliente.hora);
		cliente.qualDoutor(cliente.doutor);	

	}

}
