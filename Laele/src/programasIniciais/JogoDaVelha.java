package programasIniciais;


import java.lang.reflect.Executable;
import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char[][] tabuleiro = { { 'X', 'X', 'X' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
		int cont = 0;
		int jogada = 0;
		while (!vitoria(tabuleiro).equals("Vitoria X") || !vitoria(tabuleiro).equals("Vitoria O")) {
			if (cont != 9) {
				for(int i = 0; i < 3; i++) {
					System.out.printf("[ |%c|%c|%c| ] \n",tabuleiro[i][0],tabuleiro[i][1],tabuleiro[i][2]);
				}
				cont++;
				jogada = teclado.nextInt();
			} else {
				break;
			}
		}
		
		System.out.println(vitoria(tabuleiro));
		teclado.close();
	}

	private static String vitoria(char[][] tabuleiro) {
		if (vitoriaLinha(tabuleiro).equals("X")) {
			return "Vitoria X";
		}
		if (vitoriaColuna(tabuleiro).equals("O")) {
			return "Vitoria O";
		}
		return "0";
	}
	
	private static String vitoriaLinha(char[][] tabuleiro) {
		int pontosX = 0;
		int pontosO = 0;
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[0][i] == 'X') {
				pontosX++;
			}
			if (tabuleiro[0][i] == 'O') {
				pontosO++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[1][i] == 'X') {
				pontosX++;
			}
			if (tabuleiro[1][i] == 'O') {
				pontosO++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[2][i] == 'X') {
				pontosX++;
			}
			if (tabuleiro[2][i] == 'O') {
				pontosO++;
			}
		}

		if (pontosX == 3) {
			return "X";
		} else {
			if (pontosO == 3) {
				return "O";
			} else {
				return "0";
			}
		}
	}

	private static String vitoriaColuna(char[][] tabuleiro) {
		int pontosX = 0;
		int pontosO = 0;
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == 'X') {
				pontosX++;
			}
			if (tabuleiro[i][0] == 'O') {
				pontosO++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][1] == 'X') {
				pontosX++;
			}
			if (tabuleiro[i][1] == 'O') {
				pontosO++;
			}
		}
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][2] == 'X') {
				pontosX++;
			}
			if (tabuleiro[i][2] == 'O') {
				pontosO++;
			}
		}

		if (pontosX == 3) {
			return "X";
		} else {
			if (pontosO == 3) {
				return "O";
			} else {
				return "0";
			}
		}
	}

}
