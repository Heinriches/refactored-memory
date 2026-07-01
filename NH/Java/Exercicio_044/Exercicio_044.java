import java.util.Scanner;

class Exercicio_044{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		int ini = sc.nextInt();
		
		System.out.print("Digite o ultimo valor: ");
		int ulti = sc.nextInt();
		
		System.out.print("Digite o incremento valor: ");
		int incre = sc.nextInt();
		
		/*
		if(ini > ulti){
			for(int i = ini; i >= ulti; i += incre){
				System.out.print(i + " ");
			}
		}else if(ini < ulti){
			for(int i = ini; i <= ulti; i -= incre){
				System.out.print(i + " ");
			}
		}else{
			System.out.print(ulti);
		}
		*/
		
		for(int i = ini; i <= ulti; i += incre){
			System.out.print(i + " ");
		}
			System.out.print("Acabou!");
			
		sc.close();
	}
	
}