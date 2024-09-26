
public class Produto{
	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nomeInit, double precoInit, int quantidadeEmEstoqueInit){
		nome = nomeInit;
		preco = precoInit;
		quantidadeEmEstoque = quantidadeEmEstoqueInit;
	}

	public void exibirInformacoes(){
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço do produto: " + preco);
		System.out.println("Quantidade do produto em estoque: " + quantidadeEmEstoque);
	}

	public static void main(String[] args){

		Produto produtoUm = new Produto("Coca-cola", 15.00, 50);
		Produto produtoDois = new Produto("Cream Cracker", 5.00, 50);

		produtoUm.exibirInformacoes();
		produtoDois.exibirInformacoes();
	}
}