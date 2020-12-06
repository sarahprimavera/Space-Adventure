import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet class that acts as an bullet projectile for player (Spaceship)
 * 
 * @author Hawad Ahmad
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
                showExplosion();
                if (getWorld() instanceof Level1){
                    Level1 level1=(Level1)getWorld();
                    Greenfoot.playSound("explosion2.wav");
                    level1.addScore(10);
                }
                if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    Greenfoot.playSound("explosion2.wav");
                    level2.addScore(10);
                }
                if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    Greenfoot.playSound("explosion2.wav");
                    level3.addScore(10);
                }
                getWorld().removeObject(asteroid);
                getWorld().removeObject(this);
            }
        }
        if (this.getWorld() != null) {
            Ufo ufo = (Ufo) getOneIntersectingObject(Ufo.class);
            if (ufo != null) {
                showExplosion();
                if (getWorld() instanceof Level1){
                    Level1 level1=(Level1)getWorld();
                    Greenfoot.playSound("explosion2.wav");
                    level1.addScore(30);
                }
                if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    Greenfoot.playSound("explosion2.wav");
                    level2.addScore(30);
                }
                if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    Greenfoot.playSound("explosion2.wav");
                    level3.addScore(30);
                }
                getWorld().removeObject(ufo);
                getWorld().removeObject(this);
            }
        }
    }
    /**
     * This method will add the explosion actor
     */
    private void showExplosion() {
        getWorld().addObject(new Explosion(), getX(), getY());
    }
}
