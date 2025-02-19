package io.codeforall.bootcamp.gfx.simplegfx;

import io.codeforall.bootcamp.grid.GridDirection;
import io.codeforall.bootcamp.grid.position.AbstractGridPosition;
import io.codeforall.bootcamp.grid.position.GridPosition;
import io.codeforall.bootcamp.grid.GridColor;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid simpleGfxGrid;

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        simpleGfxGrid = grid;
        //throw new UnsupportedOperationException();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        rectangle = new Rectangle(col * grid.cellSize + SimpleGfxGrid.PADDING ,row * grid.cellSize + SimpleGfxGrid.PADDING,20,20);
        show();
        simpleGfxGrid = grid;
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        rectangle.fill();

        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {
        super.moveInDirection(direction, distance);
        //throw new UnsupportedOperationException();
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {
        super.setColor(color);
        Color thisColor = null;
        switch (color){
            case RED -> thisColor = Color.RED;
            case BLUE -> thisColor = Color.BLUE;
            case GREEN -> thisColor = Color.GREEN;
            case MAGENTA -> thisColor = Color.MAGENTA;
            case NOCOLOR -> thisColor = null;
        }
        rectangle.setColor(thisColor);
        //throw new UnsupportedOperationException();
    }
}
