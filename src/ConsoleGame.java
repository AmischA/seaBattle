import board.*;
import players.*;
import ships.*;

public class ConsoleGame {
	private GameBoard board;
	private Player player;
	private Computer computer;

	public void startConsoleGame() {
		GameBoard board = new GameBoard();
		
		Ship oneDeckShip = OneDeckShip.buildShip(new BoardCell('A', 9));
		
		Ship twoDeckShip = TwoDeckShip.buildShip(new BoardCell('A', 1), new BoardCell('A', 0));
		
		Ship threeDeckShip = ThreeDeckShip.buildShip(new BoardCell('F', 2), new BoardCell('F', 1), 
														new BoardCell('F', 3));
		
		Ship fourDeckShip = FourDeckShip.buildShip(new BoardCell('D', 5), new BoardCell('E', 5), 
									 new BoardCell('G', 5), new BoardCell('F', 5));
		
		board.addShipToBoard(oneDeckShip);
		board.addShipToBoard(twoDeckShip);
		board.addShipToBoard(threeDeckShip);
		board.addShipToBoard(fourDeckShip);
		
		System.out.println(board);
	}
}
