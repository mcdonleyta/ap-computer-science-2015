package battleship;

/**
 * Created by jsdsp on 2/11/16.
 */
class Player {
    private String name;
    Board board;
    Player(String _name) {
        name = _name;
        board = new Board();
        board.populate();
    }

    boolean didLose() {
        return board.boats.isEmpty();
    }

    String getName() {
        return name;
    }

}
