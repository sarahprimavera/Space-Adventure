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
                if (getWorld() instanceof Level1){
                    Level1 level1=(Level1)getWorld();
                    level1.addScore(10);
                }
                if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    level2.addScore(10);
                }
                if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    level3.addScore(10);
                }
                getWorld().removeObject(asteroid);
                getWorld().removeObject(this);
            }
        }
        if (this.getWorld() != null) {
            Ufo ufo = (Ufo) getOneIntersectingObject(Ufo.class);
            if (ufo != null) {
                if (getWorld() instanceof Level1){
                    Level1 level1=(Level1)getWorld();
                    level1.addScore(30);
                }
                if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    level2.addScore(30);
                }
                if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    level3.addScore(30);
                }
                getWorld().removeObject(ufo);
                getWorld().removeObject(this);
            }
        }
    }
}
