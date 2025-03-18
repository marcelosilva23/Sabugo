package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Text;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Instructions implements KeyboardHandler {

    private Rectangle instructionBox;
    private Text[] instructionTexts;
    private Keyboard keyboard;

    public Instructions() {

        instructionBox = new Rectangle(10, 10, 400, 150);
        instructionBox.setColor(Color.WHITE);
        instructionBox.fill();


        instructionTexts = new Text[5];
        instructionTexts[0] = new Text(20, 30, "Press SPACE to paint");
        instructionTexts[1] = new Text(20, 50, "Press S to save");
        instructionTexts[2] = new Text(20, 70, "Press C to clear");
        instructionTexts[3] = new Text(20, 90, "Press L to load");
        instructionTexts[4] = new Text(20, 110, "Press 1-4 to change color");


        for (Text text : instructionTexts) {
            text.setColor(Color.BLACK);
            text.draw();
        }


        keyboard = new Keyboard(this);
        KeyboardEvent keyboardEventEnter = new KeyboardEvent();
        keyboardEventEnter.setKey(10);
        keyboardEventEnter.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(keyboardEventEnter);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == 10) {
            closeInstructions();
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    private void closeInstructions() {

        instructionBox.delete();
        for (Text text : instructionTexts) {
            text.delete();
        }
    }
}