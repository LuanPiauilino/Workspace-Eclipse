package br.com.generation.exer02;

public class TestaAvião {

	public static void main(String[] args) {
		
		Avião jatinho = new Avião();
		
		jatinho.tamanho = 23;
		jatinho.capacidadeMaxima= 20;
		jatinho.destinoKm= 360;
		jatinho.modelo= "850XP";
		jatinho.marca= "Hawker";
		
		
		System.out.println("================================");		
		System.out.println("       INFORMAÇÕES DO VOO");
		System.out.println("================================");
		System.out.printf("Modelo da Aeronave: ");
		System.out.println(jatinho.modelo);
		System.out.printf("Marca da AeroNave: ");
		System.out.println(jatinho.marca);
		System.out.printf("Comprimento da Aeronave: ");
		System.out.println(jatinho.tamanho);
		System.out.printf("CapacidadeMáxima da Aeronave: ");
		System.out.println(jatinho.capacidadeMaxima);
		System.out.println("\n================================");
		System.out.println("       INFORMAÇÕES DO VOO ATUAL");
		System.out.println("================================");
		System.out.printf("Assento sobrando: ");
		jatinho.capacidade(12);
		System.out.println(jatinho.capacidadeMaxima);
		System.out.printf("Distância total até o destino: ");
		System.out.println(jatinho.destinoKm +" KM");
		System.out.printf("DIstância faltando até o destino: ");
		jatinho.distanciaAteFinal(120);
		System.out.println(jatinho.destinoKm +"KM");
	}

}
