import java.util.Scanner;

class Exercicio_021{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();
		
		if(ano % 4 == 0){
			System.out.print("O ano é bissexto: ");
		}else{
			System.out.print("O ano não é bissexto: ");
	}
	}

}