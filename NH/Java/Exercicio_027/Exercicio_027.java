import java.util.Scanner;

class Exercicio_027{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		double n1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double n2 = sc.nextDouble();
		
		double media = (n1 + n2)/2;
		
		if(media <= 4.9){
			System.out.printf("MÉDIA = %.2f - REPROVADO \n" ,media);
		}else if(media >= 5.0 && media <= 6.9){
			System.out.printf("MÉDIA = %.2f - RECUPERAÇÃO \n" ,media);
		}else{
			System.out.printf("MÉDIA = %.2f - APROVADO \n" ,media);
		}
		
		sc.close();
	}

}