import java.util.Scanner;

class Exercicio_024{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual distância você quer percorrer? ");
		double distancia = sc.nextDouble();
		
		if(distancia > 200){
			double preco = (distancia * 0.45);
			System.out.println("O valor do preço a pagar sera de: " +preco);
		}else{
			double preco = (distancia * 0.50);
			System.out.println("O valor do preço a pagar sera de: " +preco);
		}
		
		
		sc.close();
	}

	
}