import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ufo class that shoots projectiles towards player
 * 
 * @author Hawad Ahmad
 */
public class Ufo extends SmoothMover
{
    GreenfootImage image1 = new GreenfootImage("ufo1.png");
    GreenfootImage image2 = new GreenfootImage("ufo2.png");
    private int i = 0;
    private int speed = 3;
    private boolean shouldMoveRight = true;
    int reloadTime = 10;
    int reloadCount = reloadTime;
    /**
     * Act - do whatever the Ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        animate();
        moveAround();
        shoot();
    } 
    /**
     * this function will animate the ufo
     */ 
    private void animate() {
        if (i == 30)
            setImage(image2);
        else if (i == 60) {
            setImage(image1);
            i = 0;
        }
        i++;
    }
    /**
     * This function moves the ufo from left to right
     */
    private void moveAround() {
        if (shouldMoveRight) {
            move(speed);
            if (getX() > 550)
                shouldMoveRight = false;
        }
        else {
            move(-speed);
            if (getX() < 50)
                shouldMoveRight = true;
        }
    }
    /*
     * This function shoots towards the spaceship
     */
    private void shoot() {
        if (reloadCount >= reloadTime) {
            Spaceship player;
            for (int i = 0; i < 3; i++) { // shoot 3 times
                player = getWorld().getObjects(Spaceship.class).get(0);
                // get the spaceship location
                int playerX = player.getX();
                int playerY = player.getY();
                // add bullet and go towards the spaceship
                EnemyBullet b = new EnemyBullet();
                getWorld().addObject(b, getX(), getY());
                b.turnTowards(playerX+i*8, playerY+i*8);
            }
            // reset the reload
            reloadCount = 0;
        }
    }
}
