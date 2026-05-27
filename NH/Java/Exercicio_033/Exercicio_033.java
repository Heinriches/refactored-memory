import java.util.Scanner;

class Exercicio_033{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor da casa? ");
		double vlrCasa = sc.nextDouble();
		
		System.out.print("Qual e o seu salario? ");
		double salarUser = sc.nextDouble();
		
		System.out.print("Quantos anos vai ser o prazo? ");
		int anos = sc.nextInt();
		
		int meses = (anos * 12);
		
		double prestacao = (vlrCasa / meses);
		
		if(prestacao > (0.3 * salarUser)){
			System.out.println("30% do salario = " +(0.3 * salarUser));
			System.out.println("PRESTAÇÃO = " +prestacao);
			System.out.println("O empréstimo foi reprovado");
		}else{
			System.out.println("30% do salario = " +(0.3 * salarUser));
			System.out.println("PRESTAÇÃO = " +prestacao);
			System.out.println("O empréstimo foi aprovado");
		}
		
		sc.close();
	}
	
}