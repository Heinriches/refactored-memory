import java.util.Scanner;

class Exercicio_004{
	
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		int num1 = sc.nextInt();
		
		System.out.println("Digite outro valor: ");
		int num2 = sc.nextInt();
		
		int somatorio = (num1 + num2);
		
		System.out.println("A soma entre " +num1 +" e " +num2 +" é igual a " +somatorio +".");
	}
	
}