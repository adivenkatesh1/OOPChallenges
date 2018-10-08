/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import becker.robots.*;

/**
 *
 * @author Adi Venkatesh
 */
public class Robot2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City newmarket = new City();
        Robot bob = new Robot(newmarket, 2, 4, Direction.EAST,
                0);
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.move();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
    }

}
