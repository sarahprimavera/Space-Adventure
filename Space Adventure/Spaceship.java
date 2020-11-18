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
    int speed = 5;
    /**
     * Act - do whatever the Spaceship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.isKeyDown("w"))
       {
           setLocation(getX(),getY()-speed);
           setImage(imageUp);
       }
       if (Greenfoot.isKeyDown("s"))
       {
           setLocation(getX(),getY()+speed);
           setImage(imageDown);
       }
       if (Greenfoot.isKeyDown("a"))
       {
           setLocation(getX()-speed,getY());
           setImage(imageLeft);
       }
       if (Greenfoot.isKeyDown("d"))
       {
           setLocation(getX()+speed,getY());
           setImage(imageRight);
       }
    }   
}
