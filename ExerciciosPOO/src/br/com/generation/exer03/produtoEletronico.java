package br.com.generation.exer03;
/* Generation Brasil - Java
 * Data: 11/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1) Crie uma classe produto eletr�nico e apresente os atributos e m�todos referentes
 * esta classe, em seguida crie um objeto produto eletr�nico, defina as instancias deste
 * objeto e apresente as informa��es deste objeto no console.
 */
public class produtoEletronico {
	
	String aparelho;
	String modelo;
	String marca;
	int preco;
	int entrega;
	
	void entregaExpressa(int entrega) {
		if(entrega==1){
			System.out.println("O PRODUTO SER� EM ENTREGUE COM O TRANSPORTE EXPRESSO");
		}else if(entrega==2){
			System.out.println("O PRODUTO SER� EM ENTREGUE COM O TRANSPORTE NORMAL");	
		}else {
			System.out.println("S� TEMOS ESSAS DUAS FORMAS DE ENTREGA");
		}
		
	}
	void pagamento(int vezPagamento){
		if(vezPagamento>6 && vezPagamento<=12) {
			int precoAcrescimo;
			precoAcrescimo= (preco * 35)/100;
			preco+=precoAcrescimo;
			System.out.printf("O pre�o do seu Produto ficar�: ");
			System.out.println(preco);
		}else if(vezPagamento>1 && vezPagamento <=6) {
			int precoAcrescimo;
			precoAcrescimo= (preco * 20)/100;
			preco+=precoAcrescimo;
			System.out.printf("O pre�o do seu Produto ficar�: ");
			System.out.println(preco);
		}else if(vezPagamento==1){
			int precoDesconto;
			precoDesconto= (preco * 5)/100;
			preco-=precoDesconto;
			System.out.printf("O pre�o do seu Produto ficar�: ");
			System.out.println(preco);
		}else {
			System.out.println("PARCELAMENTO LIMITE: AT� 12 VEZES!!");
		}
	}
}
