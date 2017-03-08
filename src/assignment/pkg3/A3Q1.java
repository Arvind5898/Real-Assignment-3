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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating a city 
        City kw = new City();
        
        // Creating a robot 
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);
        
        // Creating a wall
        new Wall(kw, 1, 5, Direction.EAST);
        
        // Creating a new thing
        new Thing(kw, 1, 6);
        
        // Making bob stop using a while loop
        while(bob.frontIsClear()){
            bob.move();
            
        }
    }
}
