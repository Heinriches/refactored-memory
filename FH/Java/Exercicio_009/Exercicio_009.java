import java.util.Scanner;

class Exercicio_009
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Digite o valor de sua carteira, em Reais: ");
		double carteira = sc.nextDouble();
		
		System.out.printf("Este valor equivale a U$%,.2f. \n" ,(carteira / 3.45));
				
		sc.close();
	}
}