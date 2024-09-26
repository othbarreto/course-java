class SalaDeAula {
	static int totalAlunos;

	public static void adicionarAluno(){
		totalAlunos++;
	}

	public static void exibirTotalAlunos(){
		System.out.println("O total de alunos é: " + totalAlunos);
	}
}

public class TesteSalaDeAula{
	public static void main(String[] args){
		SalaDeAula sala1 = new SalaDeAula();

		sala1.adicionarAluno();
		sala1.adicionarAluno();
		sala1.adicionarAluno();

		sala1.exibirTotalAlunos();

	}	
}