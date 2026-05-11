import java.util.Scanner;

class Exercicio_015{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("DIAS TRABALHADOS: ");
		int dias = sc.nextInt();
		
		double vlrhora = 25;
		
		double ganho = (8 * dias) * vlrhora;
		
		System.out.println("VALOR = " +ganho);
		
		sc.close();
	}
	
}