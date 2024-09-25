public class PrecedenciaOperadoresAtribuicao{
	public static void main(String[] args){
		int numero = 5;

		System.out.println("Pré-incremento (++var)");
		++numero;
		System.out.println("Resutado: " + numero);
		System.out.println("Pós-incremento (var++)");
		numero++;
		System.out.println("Resutado: " + numero);
		System.out.println("Pré-decremento (--var)");
		--numero;
		System.out.println("Resutado: " + numero);
		System.out.println("Pós-decremento (var--)");
		numero--;
		System.out.println("Resutado: " + numero);

	}
}