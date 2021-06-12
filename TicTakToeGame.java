package com.bridgelabz;

import java.util.Scanner;

public class TicTakToeGame {
public static char player = ' ';
public  static char computer = ' ';
	char[] board = new char[10];

	public void createBoard() {
		for (int i = 1; i < board.length; i++) {

			board[i] = ' ';
		}
	}

	public  void chooseinput() {
		

		Scanner scan = new Scanner(System.in);
		System.out.println(" Enter the input you want");
		char input = scan.next().charAt(0);

		if (input == 'x' || input == 'X' ) {
			System.out.println(" you have choosen x as your input ");
			player = input;
			computer = 'O';

		}

		else if (input == 'o' || input == 'O') {
			System.out.println(" you have choosen o as your input as " );
			player = input;
			computer = 'O';

		}
		else {
			System.out.println(" please enter a valid input ");
		}

	}

	public static void main(String[] args) {

		TicTakToeGame obj = new TicTakToeGame();
		obj.createBoard();
		obj.chooseinput();

	}

}
