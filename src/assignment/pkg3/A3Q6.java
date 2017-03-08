/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author debia7331
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // making a new city
        City kw = new City();

        // making a new robot 
        RobotSE bob = new RobotSE(kw, 0, 1, Direction.SOUTH);

        // show things
        kw.showThingCounts(true);

        // making things
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);

        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        
        // making bob move onto the path
        bob.move();

        while (bob.canPickThing()) {

            bob.turnLeft();
            bob.pickAllThings();

            while (bob.countThingsInBackpack() > 0) {
                bob.move();
                bob.putThing();
            }
            bob.turnAround();

            while (bob.canPickThing()) {
                bob.move();
            }
            bob.turnLeft();
            bob.move();

        }
    }
}
