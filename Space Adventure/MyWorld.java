import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Spaceship spaceship = new Spaceship();
        addObject(spaceship,61,182);
        spaceship.setLocation(50,372);
        spaceship.setLocation(294,245);
        spaceship.setLocation(301,221);
        Spaceship spaceship2 = new Spaceship();
        addObject(spaceship2,369,238);
        removeObject(spaceship);
        spaceship2.setLocation(298,231);
    }
}
