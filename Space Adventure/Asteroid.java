import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Asteroid that acts as an obstacle
 * 
 * @author Hawad and Sarah
 */
public class Asteroid extends SmoothMover
{
    /**
     * Act - do whatever the Asteroid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 2;
    public Asteroid(int rotation,int startSpeed) {
        setRotation(rotation);
        speed=startSpeed;
    }
    public void act() 
    {
        move(speed);
        removeIfAtEdge();
    }
}
