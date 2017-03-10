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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // making a city 
        City kw = new City();

        // making a robot 
        RobotSE bob = new RobotSE(kw, 3, 3, Direction.SOUTH);

        // making new walls
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.WEST);
        new Wall(kw, 3, 0, Direction.SOUTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 1, 0, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);

        // making bob escape
        while (bob.frontIsClear()) {
            bob.move();
        }
        while (!bob.frontIsClear()) {
            bob.turnLeft();

            if (bob.frontIsClear()) {
                bob.move();
                bob.turnRight();

            }
        }
        bob.move();

    }
}
