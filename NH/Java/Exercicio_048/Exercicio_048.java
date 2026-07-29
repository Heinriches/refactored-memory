import java.util.Scanner;

class Exercicio_048{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int num = 0;
		
		for(int i = 7; i > 0; i--){
			System.out.print("Digite um numero: ");
			num = sc.nextInt();			
			soma += num;
		}
		System.out.println("SOMA = " +soma);
		sc.close();
	}
	
}