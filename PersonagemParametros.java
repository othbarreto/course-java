class Personagem{
	String nome;
	int nivelPoder;

	public Personagem(String nome, int nivelPoder){
		this.nome = nome;
		this.nivelPoder = nivelPoder;
	}

	public void tentarAumentarNivelPoder(int nivelPoder){
		nivelPoder += 10;
	}

	public void mudarNome(Personagem personagem){
		personagem.nome = "Guerreiro";
	}

	public void aumentaNivelPoder(){
		this.nivelPoder =+ 10;
	}
}

public class PersonagemParametros{
	public static void main(String[] args){

		Personagem personagem = new Personagem("Thiago", 5);

		System.out.println("Antes de TENTAR aumentar poder:" + personagem.nivelPoder);

		personagem.tentarAumentarNivelPoder(personagem.nivelPoder);

		System.out.println("Depois de TENTAR aumentar poder:" + personagem.nivelPoder);

		System.out.println("Antes de mudar o nome:" + personagem.nome);

		personagem.mudarNome(personagem);

		System.out.println("Depois de mudar o nome:" + personagem.nome);

		System.out.println("Antes de aumentar poder:" + personagem.nivelPoder);

		personagem.aumentaNivelPoder();

		System.out.println("Depois de aumentar poder:" + personagem.nivelPoder);

	}
}