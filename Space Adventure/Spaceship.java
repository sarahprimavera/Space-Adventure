import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends SmoothMover
{
    int speed = 5;
    int reloadTime = 10;
    int reloadCount = reloadTime;
    boolean poweredUp = false;
    SimpleTimer timer = new SimpleTimer();
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
    /*
     * Move the spaceship by looking at which keys are pressed
     */
    private void listenKeyboard() {
        if (Greenfoot.isKeyDown("w"))
       {
           setRotation(-90);
           move(speed);
       }
       if (Greenfoot.isKeyDown("s"))
       {
           setRotation(90);
           move(speed);
       }
       if (Greenfoot.isKeyDown("a"))
       {
           setRotation(-180);
           move(speed);
       }
       if (Greenfoot.isKeyDown("d"))
       {
           setRotation(0);
           move(speed);
       }
       if (Greenfoot.isKeyDown("space"))
       {
           shoot();
       }
    }
    /*
     * create new bullet with the spaceships direction
     */
    private void shoot() {
        if (reloadCount >= reloadTime) {
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
            // replace this with removing points
            Greenfoot.stop();
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
            // replace this with removing points
            Greenfoot.stop();
        }
    }
    /*
     * If touched by enemy bullet, reduce points
     */
    private void checkIfTouchingEnemyBullet() {
        EnemyBullet eBullet = (EnemyBullet) getOneIntersectingObject(EnemyBullet.class);
        if (eBullet != null) {
            // replace this with removing points
            Greenfoot.stop();
        }
    }
}
