public class AlunoAprovadoReprovado{
	public static void main(String[] args){
		int nota1 = 10;
		int nota2 = 10;
		int frequencia = 80;

		if ((nota1 + nota2)/2 >= 7 && frequencia >= 75){
			System.out.println("Aluno aprovado.");
		} else {
			System.out.println("Aluno reprovado.");
		}
	}
}