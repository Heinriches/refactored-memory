import java.util.Scanner;

class Exercicio_029{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite seu salario: ");
		double salario = sc.nextDouble();
		
		System.out.print("Digite seu tempo de trabalho na empresa: ");
		double tempo = sc.nextDouble();
		
		if(tempo == 3){
			double novoSalar = salario + (salario * 3/100);
			System.out.println("NOVO SALARIO = " +novoSalar);
		}else if(tempo >= 3 && tempo <= 10){
			double novoSalar = salario + (salario * 12.5/100);
			System.out.println("NOVO SALARIO = " +novoSalar);
		}else if(tempo >= 10){
			double novoSalar = salario + (salario * 20/100);
			System.out.println("NOVO SALARIO = " +novoSalar);
		}
		sc.close();
	}
	
}