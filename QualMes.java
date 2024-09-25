public class QualMes{
	public static void main(String[] args){
		char mes = 1;

		switch (mes){
		case 1 -> System.out.println("Janeiro.");
		case 2 -> System.out.println("Fevereiro.");
		default -> System.out.println("Mês fora do range");
			
		}
	}
}