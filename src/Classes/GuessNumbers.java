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
    public static int _randomNumber() {
        _RANDOMGEN = (int) Math.round(Math.random() * 100); // 1-100
        return _checkIfZero(_RANDOMGEN);
    }

    // Check number if o, ex. 1-9, should be 01-09
    private static int _checkIfZero(int num) {
        int newNum = 0;
        if (num == 0) {
            newNum = _randomNumber();
        } else {
            newNum = num;
        }
        return newNum;

    }

}
