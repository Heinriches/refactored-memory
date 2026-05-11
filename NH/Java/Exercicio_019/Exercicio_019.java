import java.util.Scanner;

class Exercicio_019{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Digite a primeira nota: ");
		double nota1 = sc.nextDouble();
		
		System.out.print("Digite a segunda nota: ");
		double nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2)/2;
		
		if(media > 7.0){
			System.out.println("NOME DO ALUNO = " +nome);
			System.out.println("MÉDIA = " +media);
			System.out.println("O aluno teve um bom aproveitamento.");
		}
		else{
			System.out.println("NOME DO ALUNO = " +nome);
			System.out.println("MÉDIA = " +media);
			System.out.println("O aluno não teve um bom aproveitamento.");
		}
	}
	
}