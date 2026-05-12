import java.util.Scanner;

class Exercicio_008
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma distância, em metros: ");
		double dist = sc.nextDouble();
		
		System.out.printf("A distância de %d m corresponde a: \n");
		System.out.println((dist / 1000) +"Km.");
		System.out.println((dist * 100) +"cm.");
		System.out.println((dist * 1000) +"mm.");
		
		
		sc.close();
	}
}