import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main player class
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public class Spaceship extends SmoothMover
{
    private int speed = 5;
    private int rotationSpeed = 5;
    private int reloadTime = 10;
    private int reloadCount = reloadTime;
    private boolean poweredUp = false;
    private SimpleTimer timer = new SimpleTimer();
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       listenKeyboard();
       checkIfTouchingAsteroid();
       checkIfTouchingStar();
       checkIfTouchingUfo();
       checkIfTouchingEnemyBullet();
       // if the timer has passed 5 seconds, stop the powerup
       if (timer.millisElapsed() > 5000) {
           reloadTime = 10;
           poweredUp = false;
       }
       reloadCount++;
    }
    /**
     * Move the spaceship by looking at which keys are pressed
     */
    private void listenKeyboard() {
        if (Greenfoot.isKeyDown("w"))
       {
           move(speed);
       }
       if (Greenfoot.isKeyDown("s"))
       {
           move(speed);
       }
       if (Greenfoot.isKeyDown("a"))
       {
           setRotation(getRotation()-rotationSpeed);
       }
       if (Greenfoot.isKeyDown("d"))
       {
           setRotation(getRotation()+rotationSpeed);
       }
       if (Greenfoot.isKeyDown("space"))
       {
           shoot();
       }
    }
    /**
     * create new bullet with the spaceships direction
     */
    private void shoot() {
        if (reloadCount >= reloadTime) {
            Greenfoot.playSound("shoot.wav");
            getWorld().addObject(new Bullet(getRotation()), getX(), getY());
            reloadCount = 0;
        }
    }
    /**
     * Reduce points if touched an asteroid
     */
    private void checkIfTouchingAsteroid() {
        Asteroid asteroid = (Asteroid) getOneIntersectingObject(Asteroid.class);
        if (asteroid != null) {
            if (getWorld() instanceof Level1){
                    Level1 level1=(Level1)getWorld();
                    level1.addScore(-10);
                    Greenfoot.playSound("explosion.wav");
                    getWorld().removeObject(asteroid);
                }
            if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    level2.addScore(-10);
                    Greenfoot.playSound("explosion.wav");
                    getWorld().removeObject(asteroid);
            }
            if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    level3.addScore(-10);
                    Greenfoot.playSound("explosion.wav");
                    getWorld().removeObject(asteroid);
            }
        }
    }
    /**
     * If touched a star, give a faster reload speed
     */
    private void checkIfTouchingStar() {
        Star star = (Star) getOneIntersectingObject(Star.class);
        if (star != null) {
            // remove the star
            getWorld().removeObject(star);
            // set a shorter reload speed
            reloadTime = 5;
            poweredUp = true;
            // star timer
            timer = new SimpleTimer();
            timer.mark();
        }
    }
    /**
     * If touched by a Ufo, reduce points
     */
    private void checkIfTouchingUfo() {
        Ufo ufo = (Ufo) getOneIntersectingObject(Ufo.class);
        if (ufo != null) {
            if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    level2.addScore(-20);
                    Greenfoot.playSound("explosion.wav");
                    getWorld().removeObject(ufo);
            }
            if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    level3.addScore(-20);
                    Greenfoot.playSound("explosion.wav");
                    getWorld().removeObject(ufo);
            }
        }
    }
    /**
     * If touched by enemy bullet, reduce points
     */
    private void checkIfTouchingEnemyBullet() {
        EnemyBullet eBullet = (EnemyBullet) getOneIntersectingObject(EnemyBullet.class);
        if (eBullet != null) {
            if (getWorld() instanceof Level2){
                    Level2 level2=(Level2)getWorld();
                    level2.addScore(-10);
                    Greenfoot.playSound("hitbybullet.wav");
                    getWorld().removeObject(eBullet);
            }
            if (getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    level3.addScore(-10);
                    Greenfoot.playSound("hitbybullet.wav");
                    getWorld().removeObject(eBullet);
            }
        }
    }
}
