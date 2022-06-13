package br.com.generation.exer05;
/* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 5) Crie uma classe patinete e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto patinete, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 *//* Generation Brasil - Java
 * Data: 12/06/2022
 * Aluno: Luan Piauilino
 * 
 * 6) Crie uma classe banco e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto banco, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */
public class patinete {

	String cor;
	String modelo;
	String tipo;
	double preco;
	
	void estoque(int tamanho) {
		if(tamanho<=10) {
			System.out.printf("Ainda tem esse patinete em estoque...");	
		}else if(tamanho>30) {
			System.out.printf("Ainda tem muito estoque, dê um desconto.");
		}else {
			System.out.printf("Venda no preço normal");
		}
	}
	void modificaPreco(double valor) {
		double desconto;
		desconto= (preco * valor)/100;
		preco-= desconto;
		System.out.println("O valor do produto será: "+ preco);
	}
}
