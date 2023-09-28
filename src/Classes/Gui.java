/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author darto
 */
public class Gui {// start

    // Center JFRAME
    public static void _centerFrame(JFrame frame) {// start
        Rectangle rec = frame.getBounds();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width - rec.width) / 2, (dim.height - rec.height) / 2);
    }// end

    // Assign icon to Frame
    public void setIconFrame(JFrame frame) {// start
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/logo.png")));
    }// end

    // allowing interger only when user enter his/her guessing number
    public static void _intergerOnly(KeyEvent evt) {// start
        // get the character
        char _character = evt.getKeyChar();
        // check user input
        if (Character.isDigit(_character)
                || _character == KeyEvent.VK_SPACE
                || _character == KeyEvent.VK_DELETE
                || _character == KeyEvent.VK_SLASH) {

        } else {
            evt.consume();
            // creating beep notification sound
            Toolkit.getDefaultToolkit().beep();

        }

    }// end

    // Creating prompt message
    public static void _message(String message, int errorTye) {// start

        switch (errorTye) {
            case 0:
                JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, message, "WARNING", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;

        }
    }// end

    // create and update best score or highest score
    // dir
    private static String patFileBestScore = System.getProperty("user.dir") + "/src/GUI/bestscore.ini";

    // get the current best score
    public static int getCurrentBestScore() {

        int bestScore;
        String line, newLine = "";
        try {
            // reading fiel and get the content.
            BufferedReader buff = new BufferedReader(new FileReader(patFileBestScore));
            while ((line = buff.readLine()) != null) {
                newLine = line;
            }
        } catch (FileNotFoundException e) {

        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Here we get the value bestScore[0] form index [ and ] using subtring
        bestScore = Integer.parseInt(newLine.substring(newLine.indexOf("[") + 1, newLine.indexOf("]")));
        return bestScore;
    }
}// end class
