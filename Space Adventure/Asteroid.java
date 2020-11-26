import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
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
