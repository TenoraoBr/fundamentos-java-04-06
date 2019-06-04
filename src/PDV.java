import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import java.text.DecimalFormat;



public class PDV {

	public static void main(String[] args) {
		//Date -> trabalhar com Data
		Date data = new Date();
		//Formatar a data
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
			DecimalFormat resultado = new DecimalFormat("#0.00");
			double total,desconto,totalDesconto;
			Scanner leia = new Scanner(System.in);
		System.out.println(formatador.format(data));
		System.out.println("=============");
		System.out.println("=== PDV ===");
		System.out.println("=============");
		System.out.println("");
		System.out.println("Valor Total: ");
		total = leia.nextDouble();
		System.out.println("Desconto em %");
		desconto = leia.nextDouble();
		totalDesconto = total - (desconto * total) /100;
		System.out.println("Total com Desconto: " + resultado.format(totalDesconto));
		System.out.println("____________________");
		System.out.println("");
		System.out.println("Valor Pago:");
		System.out.println("Troco:");
		leia.close();
	
	}
}

