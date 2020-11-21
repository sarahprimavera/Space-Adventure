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
            Level1 level1 = (Level1) getWorld();
            level1.nextLevel();
            // remove this planet
            getWorld().removeObject(this);
        }
    }
}
