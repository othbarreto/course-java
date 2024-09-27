class Pessoa{
	public String nome;
	private int idade;
	protected String endereco;
	String telefone;

	public Pessoa(String nome, int idade, String endereco, String telefone){
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public int getIdade(){
		return idade;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public String getEndereco(){
		return endereco;
	}

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}

	public String getTelefone(){
		return telefone;
	}

	public void setTelefone(String telefone){
		this.telefone = telefone;
	}

}

public class AplicacaoPessoa{
	public static void main(String[] args){

		Pessoa pessoaUm = new Pessoa("Thiago Barreto", 22, "São Vicente - SP", "13991879219");

		//Metodo GET para pegar informações de metodos protegidos ou não.

		System.out.println("Nome: " + pessoaUm.nome + " Idade: " + pessoaUm.getIdade() + " Endereço: " + pessoaUm.getEndereco() + " Telefone:" + pessoaUm.getTelefone());

		//Metodo SET para setar/alterar informações de metodos protegidos ou não.

		pessoaUm.setEndereco("Santos - SP");

		System.out.println("Nome: " + pessoaUm.nome + " Idade: " + pessoaUm.getIdade() + " Endereço: " + pessoaUm.getEndereco() + " Telefone:" + pessoaUm.getTelefone());

	}
}