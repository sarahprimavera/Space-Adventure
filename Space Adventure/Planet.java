import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Planet extends SmoothMover
{
    public void checkIfNextLevel() {
        // if reached left
        if (getX() == 0) {
            // show the next level
            MyWorld world = (MyWorld) getWorld();
            world.nextLevel();
            // remove this planet
            getWorld().removeObject(this);
        }
    }
}
