package br.com.generation.exer02;
/* Generation Brasil - Java
 * Data: 10/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto avi�o, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
 */
public class Avi�o {
	
	int tamanho;
	int capacidadeMaxima;
	int destinoKm;
	String modelo;
	String marca;
	
	
	void capacidade(int capacidadeSobrando){
		capacidadeMaxima = capacidadeMaxima - capacidadeSobrando;
	}
	void distanciaAteFinal(int faltandoKm) {
		destinoKm= destinoKm - faltandoKm;
	}

}
