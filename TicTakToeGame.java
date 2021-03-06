package com.bridgelabz;

import java.util.Scanner;

public class TicTakToeGame {
	

	public static void main(String[] args) {

		TicTakToeGame obj = new TicTakToeGame();
		char[] board = TicTakToeGame.createBoard();
		Scanner scan = new Scanner(System.in);
		char player = chooseInput(scan);
		char computer = (player == 'X') ? 'O' : 'X';
		System.out.println(player + " is your choosen value ");
		System.out.println(" enter the position you want place the input");
		
		placePeice(board , player );
		


	}

	public static char[] createBoard() {
		char[] board = new char[10];

		for (int i = 1; i < board.length; i++) {

			board[i] = ' ';
		}
		return board;
	}

	public static char chooseInput(Scanner scan) {
		System.out.println(" Enter the input value you want : ");
		return scan.next().toUpperCase().charAt(0);

	}

	public static void showBoard(char[] board) {

		System.out.println(board[1] + " | " + board[2] + " | " + board[3]);
		System.out.println("---------- ");
		System.out.println(board[4] + " | " + board[5] + " | " + board[6]);
		System.out.println("---------- ");
		System.out.println(board[7] + " | " + board[8] + " | " + board[9]);

	}

	public static void placePeice(char[] board , char player) {
		Scanner pos = new Scanner(System.in);
		int position = pos.nextInt();
		
		if (board[position] == ' ') {
			board[position] = player;
			showBoard(board);
			
			}
		else {
			System.out.println(" enter another position ");
		}
		
	}
}
