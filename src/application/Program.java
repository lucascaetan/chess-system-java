package application;


import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessPosition;
import chess.chessMatch;
import chess.chessPiece;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		chessMatch chessMatch = new chessMatch();
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				chessPiece capturedPiece = chessMatch.performChessMove(source, target);
			}
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
			catch (InputMismatchException e) {
				System.out.println(e.getMessage());
				sc.nextLine();
			}
		}
	}
}

