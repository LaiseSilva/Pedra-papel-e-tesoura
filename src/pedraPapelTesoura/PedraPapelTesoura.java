package pedraPapelTesoura;

import java.util.Random;
import java.util.Scanner;

public class PedraPapelTesoura {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Random computador = new Random();
		
		int opcao1, sorteioComputador; 
		String comp,jogador = "";

		System.out.println("********PEDRA, PAPEL E TESOURA********");
		System.out.println("Papel = 1");
		System.out.println("Pedra = 2");
		System.out.println("Tesoura = 3");

		System.out.print("Qual opção você escolhe? ");
		opcao1 = leitor.nextInt();
		leitor.close();

		sorteioComputador = computador.nextInt(3) + 1;
		
		if (opcao1 == 1) {
			jogador = "Você escolheu papel";
			System.out.println(jogador);
		}else if (opcao1 == 2) {
			jogador = "Você escolheu pedra";
			System.out.println(jogador);
		}else {
			jogador = "Você escolheu tesoura";
			System.out.println(jogador);
		}
		

		if (sorteioComputador == 1) {
			comp = "O computador escolheu papel";
			System.out.println(comp);
		}else if (sorteioComputador == 2) {
			comp = "O computador escolheu pedra";
			System.out.println(comp);
		}else {
			comp = "O computador escolheu tesoura";
			System.out.println(comp);
		}
		

		if (opcao1 >= 4) {
			System.out.println("Escolha uma das opções acima, por favor.");

		} else if (sorteioComputador == 3 & opcao1 == 1 || sorteioComputador == 1 & opcao1 == 3) {
			if (sorteioComputador == 3 & opcao1 == 1) {
				System.out.println("O computador venceu!!");
			} else {
				System.out.println("Você venceu!!");
			}

		} else if (sorteioComputador == 2 & opcao1 == 3 || sorteioComputador == 3 & opcao1 == 2) {
			if (sorteioComputador == 2 & opcao1 == 3) {
				System.out.println("O computador venceu!!");
			} else {
				System.out.println("Você venceu!!");
			}

		} else if (sorteioComputador == 1 & opcao1 == 2 || sorteioComputador == 2 & opcao1 == 1) {
			if (sorteioComputador == 1 & opcao1 == 2) {
				System.out.println("O computador venceu!!");
			} else {
				System.out.println("Você venceu!!");
			}

		} else {
			System.out.println("DEU EMPATE!!");
		}

	}

}
