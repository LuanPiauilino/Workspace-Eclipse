package br.com.generation.exercicios;
/*Generation Brasil- Java
 * Data: 08/06/2022
 * Aluno: Luan Piauilino
 * 
 * 1- Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)
 */
public class Exercicio01 {

	public static void main(String[] args) {
	
		for(int num=1000; num<2000; num++) {
			if(num%11==5) {
				System.out.println(num);
			}
		}

	}

}
