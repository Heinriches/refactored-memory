import java.util.Scanner;

class Exercicio_023{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu sexo (m / f): ");
		String sexo = sc.nextLine();
		
		System.out.println("Qual é o valor da sua(s) compra(s): ");
		double valor = sc.nextDouble();
		
		if(sexo.equals("m")){
			double desconto = valor - (valor * 5/100);
			System.out.printf("%s, seu preço com desconto é de R$%.2f \n" ,nome ,desconto);
		}else{
			double desconto = valor - (valor * 13/100);
			System.out.printf("%s, seu preço com desconto é de R$%.2f \n" ,nome ,desconto);
		}
		
		sc.close();
		
	}
	
}