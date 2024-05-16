package models;

import java.util.List;
import java.util.PrimitiveIterator;

public class Game {
    private Board board;
    List<Player> players;
    private List<Cell> moves;
    private GameStatus gameStatus;
    private int nextPlayerTurn;
    private Player winner;


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Cell> getMoves() {
        return moves;
    }

    public void setMoves(List<Cell> moves) {
        this.moves = moves;
    }

    public int getNextPlayerTurn() {
        return nextPlayerTurn;
    }

    public void setNextPlayerTurn(int nextPlayerTurn) {
        this.nextPlayerTurn = nextPlayerTurn;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

}
