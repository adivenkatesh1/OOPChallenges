/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP2;

/**
 *
 * @author Adi Venkatesh
 */
public class MixedFraction extends Fraction {
    
    int whole;

    public MixedFraction() {
        super();
        whole = 0;
    }

    public MixedFraction(int w, int num, int den) {
        super(num, den);
        whole = w;
    }

    public String toString() {
        return (whole + "  " + num + " / " + den);
    }
}
