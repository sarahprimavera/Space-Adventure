import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Earth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Earth extends Planet
{
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double speed = -0.5;
    public void act() 
    {
        move(speed);
        checkIfNextLevel();
    }
}
