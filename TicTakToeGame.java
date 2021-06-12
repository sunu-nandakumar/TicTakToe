package com.bridgelabz;

public class TicTakToeGame {

	
char [] board = new char [10];

public  void createBoard() {
	for(int i =1; i<board.length;i++) {
		
		board[i] = ' ';
	}
}
	
	public static void main(String[] args) {
		
		TicTakToeGame obj = new TicTakToeGame();
		obj.createBoard();
	
	}

}
