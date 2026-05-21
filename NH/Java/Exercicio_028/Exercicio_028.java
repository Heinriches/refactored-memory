import java.util.Scanner;

class Exercicio_028{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		double area = (altura * largura);
		
		if(area < 100){
			System.out.printf("ÁREA = %.2f - TERRENO POPULAR \n" ,area);
		}else if(area >= 100 && area <= 500){
			System.out.printf("ÁREA = %.2f - TERRENO MASTER \n" ,area);
		}else{
			System.out.printf("ÁREA = %.2f - TERRENO VIP \n" ,area);
		}
		
		sc.close();
	}
	
}