package br.com.generation.exer02;

public class TestaAvi�o {

	public static void main(String[] args) {
		
		Avi�o jatinho = new Avi�o();
		
		jatinho.tamanho = 23;
		jatinho.capacidadeMaxima= 20;
		jatinho.destinoKm= 360;
		jatinho.modelo= "850XP";
		jatinho.marca= "Hawker";
		
		
		System.out.println("================================");		
		System.out.println("       INFORMA��ES DO VOO");
		System.out.println("================================");
		System.out.printf("Modelo da Aeronave: ");
		System.out.println(jatinho.modelo);
		System.out.printf("Marca da AeroNave: ");
		System.out.println(jatinho.marca);
		System.out.printf("Comprimento da Aeronave: ");
		System.out.println(jatinho.tamanho);
		System.out.printf("CapacidadeM�xima da Aeronave: ");
		System.out.println(jatinho.capacidadeMaxima);
		System.out.println("\n================================");
		System.out.println("       INFORMA��ES DO VOO ATUAL");
		System.out.println("================================");
		System.out.printf("Assento sobrando: ");
		jatinho.capacidade(12);
		System.out.println(jatinho.capacidadeMaxima);
		System.out.printf("Dist�ncia total at� o destino: ");
		System.out.println(jatinho.destinoKm +" KM");
		System.out.printf("DIst�ncia faltando at� o destino: ");
		jatinho.distanciaAteFinal(120);
		System.out.println(jatinho.destinoKm +"KM");
	}

}
