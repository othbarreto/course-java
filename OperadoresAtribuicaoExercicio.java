public class OperadoresAtribuicaoExercicio{
	public static void main(String[] args){
		int numero = 5;

		int adicao = numero += 2;
		int subtracao = (numero -= 2);
		int multiplicacao = numero *= 4;
		int divisao = numero /= 2;

		System.out.println("Adição: " + adicao);
		System.out.println("Adição: " + subtracao);
		System.out.println("Adição: " + multiplicacao);
		System.out.println("Adição: " + divisao);
	}
}