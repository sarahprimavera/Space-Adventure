import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spaceship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spaceship extends Actor
{
    GreenfootImage imageUp = new GreenfootImage("spaceship_up.png");
    GreenfootImage imageDown = new GreenfootImage("spaceship_down.png");
    GreenfootImage imageLeft = new GreenfootImage("spaceship_left.png");
    GreenfootImage imageRight = new GreenfootImage("spaceship_right.png");
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.isKeyDown("up"))
       {
           setLocation(getX(),getY()-1);
           setImage(imageUp);
       }
       if (Greenfoot.isKeyDown("down"))
       {
           setLocation(getX(),getY()+1);
           setImage(imageDown);
       }
       if (Greenfoot.isKeyDown("left"))
       {
           setLocation(getX()-1,getY());
           setImage(imageLeft);
       }
       if (Greenfoot.isKeyDown("right"))
       {
           setLocation(getX()+1,getY());
           setImage(imageRight);
       }
    }   
}
