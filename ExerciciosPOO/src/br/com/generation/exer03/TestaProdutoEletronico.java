package br.com.generation.exer03;
/* Generation Brasil - Java
 * Data: 11/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1) Crie uma classe produto eletrônico e apresente os atributos e métodos referentes
 * esta classe, em seguida crie um objeto produto eletrônico, defina as instancias deste
 * objeto e apresente as informações deste objeto no console.
 */
import java.util.Scanner;

public class TestaProdutoEletronico {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		produtoEletronico celular = new produtoEletronico();
		
		celular.modelo= "Iphone 13";
		celular.marca= "Apple";
		celular.aparelho= "Smartphone";
		celular.preco= 10000;
		celular.entrega= 1;
		
		System.out.println("       INFORMAÇÕES DO PRODUTO\n");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.printf("\nTipo de Produto: ");
		System.out.println(celular.aparelho);
		System.out.printf("Modelo do Produto: ");
		System.out.println(celular.modelo);
		System.out.printf("Marca do Produto: ");
		System.out.println(celular.marca);
		System.out.printf("Preço do Produto: ");
		System.out.println(celular.preco);
		System.out.println("====================================");
		System.out.printf("Quantas vezes você pagará seu produto:");
		celular.pagamento(leia.nextInt()); 
		System.out.println("====================================");
		System.out.printf("Tipo de Entrega: \n1-Entrega Expressa \n2Entrega Normal\n ");
		celular.entregaExpressa(celular.entrega);

	}

}
