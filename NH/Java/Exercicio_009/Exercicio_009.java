import java.util.Scanner;

class Exercicio_009{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto você tem na carteira, em reais? ");
		double carteira = sc.nextDouble();
		
		double compra = (carteira / 3.45);
		
		System.out.println("Com este dinheiro, você pode comprar " +compra +" dólares");
		
		sc.close();		
	}
	
}