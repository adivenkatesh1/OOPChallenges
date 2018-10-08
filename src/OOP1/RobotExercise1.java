/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import becker.robots.*;
import java.awt.Color;

/**
 *
 * @author Adi Venkatesh
 */
public class RobotExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City newmarket = new City();

        Robot jeff = new Robot(newmarket, 3, 0, Direction.EAST, 0);
        Robot mike = new Robot(newmarket, 3, 6, Direction.WEST, 0);
        jeff.setColor(Color.red);
        jeff.setLabel("Jeff");
        mike.setColor(Color.yellow);
        mike.setLabel("Mike");
        jeff.move();
        mike.move();
        jeff.move();
        mike.move();
        jeff.move();
        mike.move();

    }

}
