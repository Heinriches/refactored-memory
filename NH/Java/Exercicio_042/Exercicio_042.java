import java.util.Scanner;

class Exercicio_042{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite um valor: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++){
			System.out.print(i + " ");
		}
			System.out.print("Acabou!");
		
		sc.close();
	}
}