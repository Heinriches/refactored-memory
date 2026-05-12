import java.util.Scanner;

class Exercicio_008
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma distância, em metros: ");
		double dist = sc.nextDouble();
		
		System.out.printf("A distância de %f m corresponde a: \n" ,dist);
		System.out.printf("%,.2f Km. \n" ,(dist / 1000));
		System.out.printf("%,.2f cm. \n" ,(dist * 100));
		System.out.printf("%,.2f mm. \n" ,(dist * 1000));
		
		
		sc.close();
	}
}