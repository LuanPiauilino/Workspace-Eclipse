package br.com.generation.exer01;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente paciente = new Cliente();
		
		paciente.formulario= 123;
		paciente.nome= "Jo�o Pereira";
		paciente.problema= "Escoliose";
		paciente.hora= true;
		paciente.doutor= "Doutor Eduardo";
		
		System.out.println("***************************************");
		System.out.println("        INFORMA��O DO PACIENTE");
		System.out.println("***************************************");
		System.out.printf("Formul�rio: ");
		System.out.println(paciente.formulario);
		System.out.printf("Nome do Paciente: ");
		System.out.println(paciente.nome);
		System.out.printf("Diagn�stico do Cliente: ");
		System.out.println(paciente.problema);
		System.out.println("***************************************");
		paciente.marcaHorario(paciente.hora);
		paciente.qualDoutor(paciente.doutor);		
	}
}
