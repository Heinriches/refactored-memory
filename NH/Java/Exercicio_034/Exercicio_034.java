import java.util.Scanner;

class Exercicio_034{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		
		double IMC = (peso / (altura * altura));
		
		if(IMC < 18.5){
		   System.out.printf("IMC = %.2f \n" ,IMC);
		   System.out.println("Abaixo do peso");
		}else if(IMC >= 18.5 && IMC <= 25){
			System.out.printf("IMC = %.2f \n" ,IMC);
			System.out.println("Peso ideal");
		}else if(IMC >= 25 && IMC <= 30){
			System.out.printf("IMC = %.2f \n" ,IMC);
			System.out.println("Sobrepeso");
		}else if(IMC >= 30 && IMC <= 40){
			System.out.printf("IMC = %.2f \n" ,IMC);
			System.out.println("Obesidade");
		}else{
			System.out.printf("IMC = %.2f \n" ,IMC);
			System.out.println("Obesidade mórbida");
		}
		
		sc.close();
	}


}