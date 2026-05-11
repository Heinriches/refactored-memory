import java.util.Scanner;

class Exercicio_017{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A qual velocidade você dirigia?: ");
		double vel = sc.nextDouble();
		
		int lim = 80;
		
		int multa = 5;
		
		if(vel > lim){
			double pagar = ((vel - lim) * 5);
			System.out.println("Você foi multado");
			System.out.println("MULTA = " +pagar);
		}else{
			System.out.println("Não há multa a pagar");
		}
		
		
		sc.close();
	}

}