import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Planet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Planet extends SmoothMover
{
    private static int level = 1;
    public void checkIfNextLevel() {
        // if reached left
        if (getX() == 0) {
            // show the next level
            if (level == 1) {
                Level2 level2 = new Level2();
                Greenfoot.setWorld(level2);
                level++;
            }
            else if (level == 2){
                Level3 level3 = new Level3();
                Greenfoot.setWorld(level3);
                level++;
            }
        }
    }
}
