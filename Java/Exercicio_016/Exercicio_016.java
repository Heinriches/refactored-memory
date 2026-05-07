import java.util.Scanner;

class Exercicio_016{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos cigarros voce fuma por dia: ");
		int cigdia = sc.nextInt();
		
		System.out.print("A quantos anos voce fuma?: ");
		int ans = sc.nextInt();
		
		int tempo = 10;
		
		int minprdidos = (((tempo * cigdia) * 365) * ans);
		
		int diasprdidos = ((minprdidos / 60) / 24);
		
		System.out.println("Voce perdera " +diasprdidos + " dias se continuar fumando");
		
		sc.close();
	}
	
}