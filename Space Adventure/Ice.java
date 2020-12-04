import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ice planet
 * 
 * @author Hawad Ahmad and Sarah Primavera
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
