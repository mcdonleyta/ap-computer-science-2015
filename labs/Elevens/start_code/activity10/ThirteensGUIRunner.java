/**
 * This is a class that plays the GUI version of the 13s game.
 * See accompanying documents for a description of how 13s is played.
 */
public class ThirteensGUIRunner {

	/**
	 * Plays the GUI version of 13s.
	 * @param args is not used.
	 */
	public static void main(String[] args) {
		Board board = new ThirteensBoard();
		CardGameGUI gui = new CardGameGUI(board);
		gui.displayGame();
	}
}
