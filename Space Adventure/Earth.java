import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Earth planet
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public class Earth extends Planet
{
    private double speed = -0.5;
    /**
     * Act - do whatever the Earth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        checkIfNextLevel();
    }
}
