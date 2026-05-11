import java.util.Scanner;

class Exercicio_010{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite a largura: ");
		double largura = sc.nextDouble();
		
		double area = (altura * largura);
		
		double litros = (area / 2);
		
		System.out.println("Area a ser pintada: " +area +"m²");
		
		System.out.println("Quantidade de tinta necessária: " +litros +"L");
		
		
		sc.close();
	}
	
}