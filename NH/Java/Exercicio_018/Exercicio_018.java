import java.util.Scanner;

class Exercicio_018{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano que você nasceu: ");
		int ano_nascimento = sc.nextInt();
		
		int ano_atual = 2026;
		
		int idade = (ano_atual - ano_nascimento);
		
		if(idade >= 18){
			System.out.println("Você pode ir votar.");
		}else{
			System.out.println("Você não pode votar.");
		}
		
		sc.close();
	}
	
}