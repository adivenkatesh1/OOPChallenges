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
public class Robot3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
City newmarket = new City();
Wall w1 = new Wall(newmarket, 3, 1, Direction.WEST);
Wall w2 = new Wall(newmarket, 3, 1, Direction.SOUTH);
Wall w3 = new Wall(newmarket, 4, 2, Direction.EAST);
Thing t1 = new Thing(newmarket, 2, 3);
Thing t2 = new Thing(newmarket, 6, 1);
Robot bob = new Robot(newmarket, 2, 4, Direction.EAST, 0);
bob.setColor(Color.blue);
bob.setLabel("Bob");
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
