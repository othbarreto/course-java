public class Carro{
	String marca;
	String modelo;
	String cor;
	int ano;

	//Construtor Default:
	Carro(){
	}

	//Construtores Explicitos:

	Carro(String marcaInit, String modeloInit, String corInit){
		marca = marcaInit;
		modelo = modeloInit;
		cor = corInit;
	}

	Carro(String marcaInit, String modeloInit, String corInit, int anoInit){
		marca = marcaInit;
		modelo = modeloInit;
		cor = corInit;
		ano = anoInit;
	}

	public static void main(String[] args){

		Carro carroUm = new Carro();
		carroUm.marca = "Renault";
		carroUm.modelo = "Kwid";
		carroUm.cor = "Branco";
		carroUm.ano = 2016;

		System.out.println("Marca: " + carroUm.marca + " Modelo: " + carroUm.modelo + " Cor: " + carroUm.cor + " Ano: " + carroUm.ano);
		

		Carro carroDois = new Carro("Chevrolet", "Cobalt", "Verde");

		System.out.println("Marca: " + carroDois.marca + " Modelo: " + carroDois.modelo + " Cor: " + carroDois.cor + " Ano: " + carroDois.ano);


		Carro carroTres = new Carro("Porshe", "Cayenne", "Preto", 2024);

		System.out.println("Marca: " + carroTres.marca + " Modelo: " + carroTres.modelo + " Cor: " + carroTres.cor + " Ano: " + carroTres.ano);
	}
}