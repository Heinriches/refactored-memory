import java.util.Scanner;

class Exercicio_011{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de a: ");
		int a = sc.nextInt();
		
		System.out.print("Digite o valor de b: ");
		int b = sc.nextInt();
		
		System.out.print("Digite o valor de c: ");
		int c = sc.nextInt();
		
		int delta = (b * b) - (4 * a * c);
		
		System.out.println("DELTA = " +delta);
		
		sc.close();
		
	}
	
}