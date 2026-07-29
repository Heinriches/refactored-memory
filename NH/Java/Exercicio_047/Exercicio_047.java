class Exercicio_047{
	
	public static void main(String[] args){
		
		int soma = 0; 
		
		for(int i = 500; i >= 0; i -= 50){
			System.out.print(i + " ");
			soma += i;
		}
			System.out.println("EXPRESSÃO = " +soma);
	}
	
}