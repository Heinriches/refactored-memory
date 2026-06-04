import java.util.Scanner;

class Exercicio_036{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas de atividade voce teve por mes? ");
		double horas = sc.nextDouble();
		
		double pts;
		
		if(horas <= 10){
			pts = (horas * 2);
		}else if(horas > 10 && horas <= 20){
			pts = (horas * 5);
		}else{
			pts = (horas * 10);
		}
		
		double din = (pts * 0.05);
		
		System.out.println("PONTOS = " +pts);
		
		System.out.println("DINHEIRO = " +din);
		
		sc.close();
	}
	
}