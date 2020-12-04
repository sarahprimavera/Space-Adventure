import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Star class that gives power ups to player
 * 
 * @author Hawad Ahmad
 */
public class Star extends SmoothMover
{
    private int speed = 5;
    public Star(int rotation) {
        setRotation(rotation);
    }
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        removeIfAtEdge();
    }    
}
