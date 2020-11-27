import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet class for enemy
 * 
 * @author Hawad
 * @version 1.0
 */
public class EnemyBullet extends SmoothMover
{
    private int speed = 5;
    /**
     * Act - do whatever the EnemyBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(speed);
        removeIfAtEdge();
    }    
}
