import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ice extends Planet
{
    /**
     * Act - do whatever the Ice wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double speed = -0.35;
    public void act() 
    {
        move(speed);
        checkIfNextLevel();
    }    
}
