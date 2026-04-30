import java.util.Scanner;

class Exercicio_007{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double num = sc.nextDouble();
			
		System.out.println("O dobro de " +num +" é " +(num * 2));
		
		System.out.println("A terça parte  de " +num +" é " +(num / 3));
			
			
		sc.close();
		
	}
	
}