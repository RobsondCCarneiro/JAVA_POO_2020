import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá mundo!");
		double x = 10.35784;
		
		//Esta daqui imprime por completo a variavel
		System.out.println(x);
		
		//Enquanto essa daqui escolhe duas casas decimais para a variavel x
		System.out.printf("%.2f\n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.3f\n", x);
		
		//Cocatenando na saida
		System.out.println("RESULTADO = "+x+" METROS");
		
		//Agora com o printf para ter o valor arrendondado
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		
		/*	%f - ponto flutuante
		 * 	%d - inteiro
		 * 	%s - texto
		 * 	%n - Quebra de linha
		 * */
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f %n" , nome, idade, renda);
	}

}
