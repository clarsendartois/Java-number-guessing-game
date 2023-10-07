/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author darto
 */
public class GuessNumbers {

    private static int _RANDOMGEN = 0;

    // Create a random number
    public static int _RANDOMGEN() {
        _RANDOMGEN = (int) Math.round(Math.random() * 100); // 1-100
        return _RANDOMGEN;
    }

}
