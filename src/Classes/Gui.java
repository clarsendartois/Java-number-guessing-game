/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

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

}
