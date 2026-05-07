import java.util.Scanner;

class Exercicio_020{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = sc.nextInt();
		
		if(num % 2 == 0){
			System.out.println("Este número é par: ");
		}else{
			System.out.println("Este número é ímpar: ");
		}
		
		sc.close();
		
	}
	
}