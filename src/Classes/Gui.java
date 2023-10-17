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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
public class Gui {
    // Center JFRAME
    public static void _centerFrame(JFrame frame) {
        Rectangle rec = frame.getBounds();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((dim.width - rec.width) / 2, (dim.height - rec.height) / 2);
    }

    // Assign icon to Frame
    public void setIconFrame(JFrame frame) {
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Asset/logo.png")));
    }

    // Allowing integer only when user enter his/her guessed number
    public static void _integerOnly(KeyEvent evt) {
        // Get the character
        char _character = evt.getKeyChar();
        // Check user input
        if (Character.isDigit(_character)
                || _character == KeyEvent.VK_SPACE
                || _character == KeyEvent.VK_DELETE
                || _character == KeyEvent.VK_SLASH) {
        } else {
            evt.consume();
            // Creating beep notification sound
            Toolkit.getDefaultToolkit().beep();
        }

    }

    // Creating prompt message
    public static void _message(String message, int errorType) {
        switch (errorType) {
            case 0:
                JOptionPane.showMessageDialog(null, message, "ERROR", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, message, "SUCCESS", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, message, "WARING", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                break;
        }
    }

    // Create and update best score or highest score
    private static String patFileBestScore = System.getProperty("user.dir") + "/src/GUI/bestscore.ini";

    // Get the current best score
    public static int getCurrentBestScore() {
        int bestScore;
        String line, newLine = "";
        try {
            // Reading file and get the content
            BufferedReader buff = new BufferedReader(new FileReader(patFileBestScore));
            while ((line = buff.readLine()) != null) {
                newLine = line;

            }
        } catch (FileNotFoundException e) {
        } catch (IOException ex) {
            Logger.getLogger(Gui.class.getName()).log(Level.SEVERE, null, ex);
        }

        // Here we get the value bestScore[0] from index [ and ] using substring
        bestScore = Integer.parseInt(newLine.substring(newLine.indexOf("[") + 1, newLine.indexOf("]")));
        return bestScore;
    }

    // Check for new score and write to the existing file
    public static void setNewBestScore(String newContent) {
        try {
            File fileToUpdate = new File(patFileBestScore);
            try (FileWriter fileWrite = new FileWriter(fileToUpdate)) {
                fileWrite.write(newContent);
                fileWrite.close();
            }
        } catch (Exception e) {
        
        }
    }
}
