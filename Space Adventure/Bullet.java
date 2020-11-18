import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends SmoothMover
{
    int speed = 10;
    public Bullet(int rotation){
        setRotation(rotation);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        removeIfAtEdge();
    }   
    /*
     * Check if the bullet is at a border, if so remove from the world
     */
    private void removeIfAtEdge() {
        // if at left border
        if (getX() < 0 + getImage().getWidth()/2)
            getWorld().removeObject(this);
        // right border
        else if (getX() > getWorld().getWidth() - getImage().getWidth()/2)
            getWorld().removeObject(this);
        // top border
        else if (getY() < 0 + getImage().getWidth()/2)
            getWorld().removeObject(this);
        else if (getY() > getWorld().getHeight() - getImage().getWidth()/2)
            getWorld().removeObject(this);
    }
}
