package br.karloskelvin.tictactoe.core;

import br.karloskelvin.tictactoe.Constants;
import br.karloskelvin.tictactoe.ui.UI;

import java.util.Arrays;

public class Board {
    char[][] matrix;

    public Board() {
        matrix = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];
        clear();
    }

    public void clear() {
        for (char[] chars : matrix) {
            Arrays.fill(chars, ' ');
        }

    }

    public void print() {
        UI.printNewLine();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                UI.printTextWithNoNewLine(String.valueOf(matrix[i][j]));
                if (j < matrix[i].length - 1) {
                    UI.printTextWithNoNewLine(" | ");
                }
            }
            UI.printNewLine();

            if (i < matrix.length - 1) {
                UI.printText("-------");
            }
        }
    }

    public boolean isFull() {
        for (char[] linha : matrix) {
            for (char coluna : linha) {
                if (coluna == ' ') {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean play(Player player, Move move) {
        matrix[move.line][move.column] = player.symbol;

        //TODO Checar se o jogador ganhou
        return false;
    }
}
