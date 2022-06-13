package br.com.generation.heranca;
/* Generation Brasil - Java
 * Data: 13/06/2022
 * Aluno: Luan Piauilino
 * 
 * * Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
 * comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
 * características de forma que tudo o que for comum a todos os animais fique na classe
 * Animal:
 */

public class TestaHeranca {

	public static void main(String[] args) {
		
		Cavalo cav1 = new Cavalo();
		
		cav1.setNome("Pé de Pano");
		cav1.setIdade(3);
		cav1.setSom("IIIRRRÍ");
		cav1.setHabilidade("Corre");
		
		System.out.printf("nome: ");
		System.out.println(cav1.getNome());
		System.out.printf("Idade: ");
		System.out.println(cav1.getIdade());
		System.out.printf("Emiti o som: ");
		System.out.println(cav1.getSom());
		System.out.println("O que ele faz: ");
		System.out.println(cav1.getHabilidade());
		System.out.println("===============================\n");
		
		Cachorro dog1 = new Cachorro();
		
		dog1.setNome("Usopp");
		dog1.setIdade(8);
		dog1.setSom("AUAU");
		dog1.setCorrer("Corre");
		
		System.out.printf("nome: ");
		System.out.println(dog1.getNome());
		System.out.printf("Idade: ");
		System.out.println(dog1.getIdade());
		System.out.printf("Emiti o som: ");
		System.out.println(dog1.getSom());
		System.out.println("O que ele faz: ");
		System.out.println(dog1.getCorrer());
		System.out.println("===============================\n");
		
		Preguica preg1 = new Preguica();
		
		preg1.setNome("Sid");
		preg1.setIdade(20);
		preg1.setSom("DOOM");
		preg1.setSubir("Sube em árvore.");
		
		System.out.printf("nome: ");
		System.out.println(preg1.getNome());
		System.out.printf("Idade: ");
		System.out.println(preg1.getIdade());
		System.out.printf("Emiti o som: ");
		System.out.println(preg1.getSom());
		System.out.println("O que ele faz: ");
		System.out.println(preg1.getSubir());
		System.out.println("===============================\n");
	}

}
