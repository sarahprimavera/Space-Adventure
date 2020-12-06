import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Class that animates an explosion
 * 
 * @author Hawad Ahmad
 */
public class Explosion extends Actor
{
    private int counter = 2;
    private int i;
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (i == 5){
           if (counter < 11) {
            setImage(new GreenfootImage("explosion"+counter+".png"));
            i = 0;
            counter++;
           }
           else
                getWorld().removeObject(this);
        }
        i++;
    }    
}
