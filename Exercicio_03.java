import java.util.Scanner;

class Exercicio_03{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		
		
		System.out.println("Nome do funcionario: ");
		String nome = sc.nextLine();
		
		System.out.println("Salario: ");
		double salario = sc.nextDouble();
		
		System.out.println("O funcionário " +nome +" tem um salário de " +salario +" em Junho.");
		
		sc.close();
	}
	
}