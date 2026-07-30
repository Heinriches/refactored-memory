import java.util.Scanner;

class Exercicio_037{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu salário atual: ");
		double salarAtual = sc.nextDouble();
	
		System.out.print("Sexo(m / f): ");
		String genero = sc.next();
	
		System.out.print("Tempo de empresa: ");
		int tempo = sc.nextInt();
	
		double salarNovo = 0;
		
		if(genero.equalsIgnoreCase("m")){
			if(tempo < 20){
				salarNovo = salarAtual + (salarAtual * 3/100);
			}else if(tempo >= 20 && tempo <= 30){
				salarNovo = salarAtual + (salarAtual * 13/100);
			}else{
					salarNovo = salarAtual + (salarAtual * 25/100);
			}
		}			
					
		if(genero.equalsIgnoreCase("f")){
			if(tempo < 15){
				salarNovo = salarAtual + (salarAtual * 5/100);
			}else if(tempo >= 15 && tempo <= 20){
				salarNovo = salarAtual + (salarAtual * 12/100);
			}else{
					salarNovo = salarAtual + (salarAtual * 23/100);
			}
		}
	
		System.out.println("Seu salario novo é de: " +salarNovo);	
	
		sc.close();
	}
}