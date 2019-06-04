import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		//l�gico do jogador
		int jogador;
		Scanner mao = new Scanner(System.in);
		System.out.println("_____________________");
		System.out.println("_______JoKenPo_______");
		System.out.println("_____________________");
		System.out.println("");
		System.out.println("1. Pedra");
		System.out.println("2. Papel");
		System.out.println("3. Tesoura");
		System.out.print("Digite a op��o desejada: ");
		jogador = mao.nextInt();
		switch (jogador) {
		case 1:
			System.out.println("Jogador escolheu PEDRA");
			break;
		case 2:
			System.out.println("Jogador escolheu PAPEL");
			break;
		case 3:
			System.out.println("Jogador escolheu Tesoura");
			break;
		default:
			System.out.println("Op��o Inv�lida");
			break;
		}
		//L�gica do computador
		//A linha abaixo gera n�meros aleat�rios entre 0 e 2
		//(int) converte para o tipo inteiro (casting)
		//+1 soma 1 ao resultado (1 ou 2 ou 3)
		int computador = (int)(Math.random() * 3);
		switch (computador) {
	case 1:
		System.out.println("Jogador escolheu PEDRA");
		break;
	case 2:
		System.out.println("Jogador escolheu PAPEL");
		break;
	case 3:
		System.out.println("Jogador escolheu Tesoura");
		break;
	}
		//l�gico para determinar o vencedor ou empate
		if (jogador == computador) {
			System.out.println("EMPATE");
		} else {
			if ((jogador == 1 && computador == 3) ||(jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ) {
				System.out.println("Jogador Venceu");
			} else {
				System.out.println("Computador Venceu");			
			}
		}
		mao.close();	
	}

}
