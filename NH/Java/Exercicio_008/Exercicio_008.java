import java.util.Scanner;

class Exercicio_008{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite  uma distancia  em metros: ");
		double metros = sc.nextDouble();
		
		System.out.println("A distancia de " +metros);
		
		System.out.println((metros / 1000) +" Km");
		
		System.out.println((metros * 100) +" cm");
		
		System.out.println((metros * 1000) +" mm");
		
		sc.close();
	}
	
}
