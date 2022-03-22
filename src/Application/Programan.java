package Application;

import chess.ChessMatch;

public class Programan {

	public static void main(String[] args) {
	
	ChessMatch chessMatch = new ChessMatch();
	UI.printBoard(chessMatch.getPieces());
		
	}

}
