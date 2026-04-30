import java.util.Scanner;

class Exercicio_006{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int num = sc.nextInt();
		
		System.out.println("O antecessor de " +num +" é " +(num - 1));
		
		System.out.println("O sucessor de " +num +" é " +(num + 1));
		
		sc.close();
	}
	
}