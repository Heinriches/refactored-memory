import java.util.Scanner;

class Exercicio_012{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o preço do produto: ");
		double preco = sc.nextDouble();
		
		double valor_desconto = (preco * 5/100);
		
		double novo_valor = preco - (valor_desconto);
		
		System.out.println("PREÇO PROMOCIONAL = " +novo_valor);
		
		sc.close();
	}
	
}