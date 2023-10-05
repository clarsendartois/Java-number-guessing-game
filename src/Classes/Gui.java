/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Toolkit;
import javax.swing.JFrame;

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

    
}
