package com.bridgelabz;

import java.util.Scanner;

public class TicTakToeGame {
	public static char player = ' ';
	public static char computer = ' ';

	public static void main(String[] args) {

		TicTakToeGame obj = new TicTakToeGame();
		obj.createBoard();
		Scanner scan = new Scanner(System.in);
		char player = chooseInput(scan);
		char computer = (player == 'X') ? 'O' : 'X';
		System.out.println(player + " is your choosen value " );

	}

	public void createBoard() {
		char[] board = new char[10];
		for (int i = 1; i < board.length; i++) {

			board[i] = ' ';
		}
	}

	public static char chooseInput(Scanner scan) {
		System.out.println(" Enter the input value you want : ");
		return scan.next().toUpperCase().charAt(0);

	}

}
