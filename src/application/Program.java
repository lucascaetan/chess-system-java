package application;


import java.util.Scanner;

import chess.ChessPosition;
import chess.chessMatch;
import chess.chessPiece;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		chessMatch chessMatch = new chessMatch();
		
		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			chessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}
	}

}

