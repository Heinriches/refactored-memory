import java.util.Scanner;

class Exercicio_026{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int n1 = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		int n2 = sc.nextInt();
		
		if(n1 > n2){
			System.out.println("O primeiro valor é o maior.");
		}else if(n2 > n1){
			System.out.println("O segundo valor é o maior.");
		}else{
			System.out.println("Não existe valor maior, os dois são iguais.");
		}
		
		sc.close();
	
	}
	
}