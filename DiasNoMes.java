public class DiasNoMes{
	public static void main(String[] args){
		var mes = "Fevereiro";

		switch (mes){
		case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> System.out.println("O mês de: " + mes + " tem 31 dias.");
		case "Abril", "Junho", "Setembro", "Novembro" -> System.out.println("O mês de: " + mes + " tem 30 dias.");
		case "Fevereiro" -> System.out.println("O mês de: " + mes + " tem 28 dias (considerando um ano não bissexto). ");
		default -> System.out.println("Mês desconhecido.");
		}
	}
}