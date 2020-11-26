import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ufo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ufo extends SmoothMover
{
    GreenfootImage image1 = new GreenfootImage("ufo1.png");
    GreenfootImage image2 = new GreenfootImage("ufo2.png");
    private int i = 0;
    private int speed = 3;
    private boolean shouldMoveRight = true;
    /**
     * Act - do whatever the Ufo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        animate();
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
    // this function will animate the ufo
    private void animate() {
        if (i == 30)
            setImage(image2);
        else if (i == 60) {
            setImage(image1);
            i = 0;
        }
        i++;
    }
}
