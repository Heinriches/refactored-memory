import java.util.Scanner;

class Exercicio_025{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o comprimento do segmento a: ");
		int a = sc.nextInt();
		
		System.out.print("Digite o comprimento do segmento b: ");
		int b = sc.nextInt();
		
		System.out.print("Digite o comprimento do segmento c: ");
		int c = sc.nextInt();
		
		if(a < (b + c)){
			if(b < (a + c)){
				if(c < (a + b)){
					System.out.println("É possivel formar um triângulo com essas retas");
				}else{
					System.out.println("Não é possivel formar um triângulo com essas retas");
				}
			}else{
				System.out.println("Não é possivel formar um triângulo com essas retas");
			}
			
		}else{
			System.out.println("Não é possivel formar um triângulo com essas retas");
		}
		
		sc.close();
	}
	
	
}