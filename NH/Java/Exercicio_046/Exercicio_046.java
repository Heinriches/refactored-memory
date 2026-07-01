class Exercicio_046{
	
	public static void main(String[] args){
		
		int soma = 0;
		
		for(int i = 6; i <= 100; i += 2){
			System.out.print(i + " ");
			soma += i;
		}
			System.out.println("SOMA = " +soma);
	}
	
}