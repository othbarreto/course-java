class Livro {
	public String titulo;
	private String autor;
	protected int anoPublicacao;
	double preco;

	public String exibirInformacoes(){
		return "Titulo: " + titulo + " Autor: " + autor + " Ano de Publicacão: " + anoPublicacao + " Preço: " + preco;
	}

	public Livro(){
		this.titulo = "Desconhecido";
		this.autor = "Desconhecido";
		this.anoPublicacao = 0;
		this.preco = 0.0;

		System.out.println(exibirInformacoes());
	}
	public Livro(String titulo, String autor){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = 0;
		this.preco = 0.0;

		System.out.println(exibirInformacoes());
	}
	public Livro(String titulo, String autor, int anoPublicacao, double preco){
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;

		System.out.println(exibirInformacoes());
	}
}

public class Aplicacao{
	public static void main(String[] args){

		Livro livroUm = new Livro();

		Livro livroDois = new Livro("1984", "Pedro Palma");

		Livro livroTres = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 49.90);
	}
}