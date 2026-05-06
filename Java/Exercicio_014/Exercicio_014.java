import java.util.Scanner;

class Exercicio_014{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade km percorridos: ");
		double distancia = sc.nextDouble();
		
		System.out.println("Quantos dias voce andou com o carro alugado: ");
		int corrida = sc.nextInt();
		
		double totalpagar = (corrida * 90) + (distancia * 0.20);
		
		System.out.println("O preço total a pagar é: " +totalpagar);
		
		sc.close();
	}
	
}