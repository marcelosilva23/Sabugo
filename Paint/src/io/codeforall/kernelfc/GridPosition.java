package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class GridPosition {

    private int row;
    private int col;
    private static final int CELL_SIZE = 50;
    private static final int PADDING = 10;
    private Rectangle rectangle;

    public void Position(int col, int row, Rectangle rectangle){
        this.col = col;
        this.row = row;
        this.rectangle = rectangle;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int rowToY(int row) {
        return PADDING + CELL_SIZE * row;
    }

    public int colToX(int col) {
        return PADDING + CELL_SIZE * col;
    }


}
