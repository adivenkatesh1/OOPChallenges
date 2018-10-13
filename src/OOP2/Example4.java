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
public class Example4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fraction f =  new Fraction(3,4);
        Fraction g = new Fraction(-1,2);
        Fraction h = f.plus(g);
        System.out.println(f + " + (" + g + ") = " + h);
  
    }
    
}
