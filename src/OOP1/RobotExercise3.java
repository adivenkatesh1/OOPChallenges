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
public class RobotExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City newmarket = new City();

        Wall w1 = new Wall(newmarket, 3, 1, Direction.WEST);
        Wall w2 = new Wall(newmarket, 3, 1, Direction.NORTH);
        Wall w3 = new Wall(newmarket, 3, 2, Direction.NORTH);
        Wall w4 = new Wall(newmarket, 3, 3, Direction.NORTH);
        Wall w5 = new Wall(newmarket, 3, 3, Direction.EAST);
        Wall w6 = new Wall(newmarket, 3, 3, Direction.SOUTH);
        Wall w7 = new Wall(newmarket, 3, 2, Direction.SOUTH);

        Thing t1 = new Thing(newmarket, 2, 1);
        Thing t2 = new Thing(newmarket, 2, 3);
        Thing t3 = new Thing(newmarket, 3, 4);

        Robot adi = new Robot(newmarket, 3, 0, Direction.NORTH, 0);
        adi.setColor(Color.RED);
        adi.setLabel("Adi");

        adi.move();
        adi.turnLeft();
        adi.turnLeft();
        adi.turnLeft();
        adi.move();
        adi.pickThing();
        adi.move();
        adi.move();
        adi.pickThing();
        adi.move();
        adi.turnLeft();
        adi.turnLeft();
        adi.turnLeft();
        adi.move();
        adi.pickThing();
        adi.move();
        adi.turnLeft();
        adi.turnLeft();
        adi.turnLeft();
        adi.move();
        adi.move();
        adi.move();
        adi.turnLeft();
        adi.turnLeft();
        adi.turnLeft();
        adi.move();
        adi.putThing();
        adi.turnLeft();
        adi.turnLeft();
        adi.turnLeft();
        adi.move();
        adi.putThing();
        adi.move();

    }

}
