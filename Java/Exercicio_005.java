import java.util.Scanner;

class Exercicio_005{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nota 1: ");
		double nota1 = sc.nextDouble();
		
		System.out.println("Nota 2: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		System.out.println("A media entre " +nota1 +" e " +nota2 +" e igual a " +media);
		
		sc.close();
	}
	
}