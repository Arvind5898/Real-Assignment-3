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
public class A3Q52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // making a city 
        City kw = new City();

        // making a robot 
        RobotSE bob = new RobotSE(kw, 3, 3, Direction.EAST);

        // making new Things
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);
        new Thing(kw, 3, 3);

        // making labels for the things
        kw.showThingCounts(true);

        // making bob pick up and place things 
        while (bob.canPickThing()) {
            bob.pickThing();
            bob.move();
            bob.putThing();
            bob.turnAround();
            bob.move();
            bob.turnAround();
        }
        // making bob execute his final move
        bob.move();

    }
}
