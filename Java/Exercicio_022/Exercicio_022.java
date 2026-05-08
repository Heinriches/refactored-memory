import java.lang.Math;
import java.util.Scanner;

class Exercicio_022{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano que você nasceu: ");
		int ano_nasci = sc.nextInt();
		
		int ano_atual = 2026;
		
		int idade = (ano_atual - ano_nasci);
		
		int alistamento =(idade - 18);
		
		
		
		if(idade <= 18){
			System.out.print("Falta " +Math.abs(alistamento) +" anos para o alistamento");
		}else{
			System.out.print("Já se passaram " +alistamento +" anos do alistamento");
		}
		
		sc.close();
		
	}
	
}