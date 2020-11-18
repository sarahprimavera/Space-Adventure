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
    /*
     * checks if the level ended. If this object is at the border
     
    private void checkIfNextLevel() {
        // if reached left
        if (getX() == 0) {
            // show the next level
            MyWorld world = (MyWorld) getWorld();
            world.nextLevel();
            // remove this planet
            getWorld().removeObject(this);
        }
    }*/
}
