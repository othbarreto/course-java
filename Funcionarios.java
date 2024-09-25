public class Funcionarios{
	String nome;
	String cargo;
	int idade;

	//Construtor Default:
	Funcionarios(){
	}

	//Sobrecarga de Construtores. (É uma sobrecarga, quando temos construtores com parametros diferentes e quando são mais que dois.)

	//Construtor Explicito:
	Funcionarios(String nome, String cargo, int idade){
		this.nome = nome;
		this.cargo = cargo;
		this.idade = idade;
	}

	Funcionarios(String nomeInit){
		nome = nomeInit;
	}


	public static void main(String[] args){

		//Funcionario feito com o Construtor Default:

		Funcionarios funcionarioUm = new Funcionarios();

		funcionarioUm.nome = "Thiago Barreto";
		funcionarioUm.cargo = "Técnico em Suporte de Sistemas";
		funcionarioUm.idade = 22;

		System.out.println("Nome: " + funcionarioUm.nome + " Cargo: " + funcionarioUm.cargo + " Idade: " + funcionarioUm.idade);

		//Funcionario feito com o Construtor Explicito:

		Funcionarios funcionarioDois = new Funcionarios("Matheus Karrielle", "Analista em Suporte e Infra", 22);

		System.out.println("Nome: " + funcionarioDois.nome + " Cargo: " + funcionarioDois.cargo + " Idade: " + funcionarioDois.idade);

		Funcionarios funcionarioTres = new Funcionarios("Luiz Paulo");

		System.out.println("Nome: " + funcionarioTres.nome + " Cargo: " + funcionarioTres.cargo + " Idade: " + funcionarioTres.idade);
	}
}