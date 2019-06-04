import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;


/**
 * Cálculo Da Média
 * @author Tenório
 */

public class CalculoMedia {

	public static void main(String[] args) {
		double nota1, nota2, media;
		System.out.println("Cálculo Da Média");
		//criado um objeto para entrada de dados
		Scanner leia = new Scanner(System.in);
		//A Linha abaixo configura o separador para ponto
		leia.useLocale(Locale.ENGLISH);
		// criando um objeto para formatar o resultado
		DecimalFormat formatador = new DecimalFormat("#0.0");
		
		System.out.println("Digite a nota1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota2: ");
		nota2 = leia.nextDouble();
		media = (nota1 + nota2) / 2;
		System.out.println("Média: " + formatador.format(media));
		if (media < 5) {
			System.out.println("REPROVADO");
		} else {
			System.out.println("APROVADO");
		}
		
		
		leia.close();
	}
}
