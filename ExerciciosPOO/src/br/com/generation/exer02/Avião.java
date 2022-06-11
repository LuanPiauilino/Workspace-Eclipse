package br.com.generation.exer02;
/* Generation Brasil - Java
 * Data: 10/06/2022
 * Aluno: Luan Piauilino
 * 
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto avião, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */
public class Avião {
	
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
