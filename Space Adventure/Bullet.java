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
        checkCollisions();
    }
    /**
     * Checks if its touching an asteroid or Ufo and removes it
     */
    private void checkCollisions() {
        if (this.getWorld() != null) {
            Asteroid asteroid = (Asteroid) getOneIntersectingObject(Asteroid.class);
            if (asteroid != null) {
                getWorld().removeObject(asteroid);
                getWorld().removeObject(this);
                // add points
            }
        }
        if (this.getWorld() != null) {
            Ufo ufo = (Ufo) getOneIntersectingObject(Ufo.class);
            if (ufo != null) {
                getWorld().removeObject(ufo);
                getWorld().removeObject(this);
                // add points
            }
        }
    }
}
