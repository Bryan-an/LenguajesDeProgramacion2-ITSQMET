/*
 * Validate
 */
package business;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Bryan Andagoya
 */
public class Validate {

    public static void allowLettersAndDigits(KeyEvent event) {
        char character = event.getKeyChar();

        if (!Character.isLetterOrDigit(character)) {
            event.consume();
        }
    }

    public static void allowLettersAndSpaces(KeyEvent event) {
        char character = event.getKeyChar();

        if (!(Character.isLetter(character) || Character.isSpaceChar(character))) {
            event.consume();
        }
    }
    
    public static void allowLetters(KeyEvent event) {
        char character = event.getKeyChar();

        if (!Character.isLetter(character)) {
            event.consume();
        }
    }
    
    public static void allowDigits(KeyEvent event) {
        char character = event.getKeyChar();

        if (!Character.isDigit(character)) {
            event.consume();
        }
    }

}
