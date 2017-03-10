/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author debia7331
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // making a city 
        City kw = new City();

        // making a robot 
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        // creating new things 
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        // creating new walls
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);

        // commanding bob to commence a serpentine shape within the walls (starting on the first line)
        while (bob.frontIsClear()) {
            bob.move();
            // bob will pick any things up
            if (bob.canPickThing()) {
                bob.pickAllThings();
            }
            if (!bob.frontIsClear()) {
                bob.turnRight();
                bob.move();
                bob.turnLeft();
                // bob will pick any things up
                if (bob.canPickThing()) {
                    bob.pickAllThings();
                }
            }
        }
        // bob is now on the second line facing a wall therefore he will turnaround and continue
        while (!bob.frontIsClear()) {
            bob.turnAround();
            bob.move();
            // bob will pick any things up
            if (bob.canPickThing()) {
                bob.pickAllThings();
            }
        }
        // commanding bob to travel horizontally across the second line of the 'box'
        while (bob.frontIsClear()) {
            bob.move();
            // bob will pick any things up
            if (bob.canPickThing()) {
                bob.pickAllThings();
            }
            // once the front is not clear on the second line bob will now move to the final line
            if (!bob.frontIsClear()) {
                bob.turnLeft();
                bob.move();
                bob.turnLeft();
                // bob will pick any things up
                if (bob.canPickThing()) {
                    bob.pickAllThings();
                }
                break;
            }
        }
        // commanding bob to travel horizontally across the third (final) line wihtin the 'box'
        while (bob.frontIsClear()) {
            bob.move();
            // bob will pick any things up
            if (bob.canPickThing()) {
                bob.pickAllThings();
            }

            if (!bob.frontIsClear()) {
                bob.turnAround();
                break;
            }

        }
        // commanding bob to retrace his steps horizontally along the third (final) line within the 'box'
        while (bob.frontIsClear()) {
            bob.move();

            if (!bob.frontIsClear()) {
                bob.turnRight();
                break;
            }
        }
        // commanding bob to travel vertically back to his original position
        while (bob.frontIsClear()) {
            bob.move();
            if (!bob.frontIsClear()) {
                bob.turnRight();
                break;
            }

        }
    }
}
