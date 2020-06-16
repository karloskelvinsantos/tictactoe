package br.karloskelvin.tictactoe.core;

import br.karloskelvin.tictactoe.Constants;
import br.karloskelvin.tictactoe.ui.UI;

public class Game {

    Board board = new Board();
    Player[] players = new Player[Constants.SYMBOLS_PLAYER.length];

    public void play() {
        UI.printTitleGame();

        board.print();
    }

}
