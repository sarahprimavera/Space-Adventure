import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Lava planet
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public class Lava extends Planet
{
    /**
     * Act - do whatever the Lava wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double speed = -0.16;
    public void act() 
    {
        move(speed);
        checkIfNextLevel();
    }    
}
