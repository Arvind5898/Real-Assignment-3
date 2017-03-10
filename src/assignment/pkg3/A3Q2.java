/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author debia7331
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // making a city
        City kw = new City();

        // creating a robot 
        RobotSE bob = new RobotSE(kw, 0, 3, Direction.WEST);

        // creating walls
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);

        // making bob move using a loop 
        for (int i = 0; i < 8; i = i + 1) {
            bob.move();
            bob.move();
            bob.move();
            bob.turnLeft();
        }

    }

}
