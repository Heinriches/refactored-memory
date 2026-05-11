import java.util.Scanner;

class Exercicio_013{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu salario: ");
		double salario = sc.nextDouble();
		
		double novosalario = salario + (salario * 15/100);
		
		System.out.println("Seu novo salario é: " +novosalario);
		
	}
	
}