import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        setStars(350);
        prepare();
    }
    /**
     * using act to add asteroids and ufo's
     */
    public void act(){
        if (Greenfoot.getRandomNumber(100)<25){
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+45,2),Greenfoot.getRandomNumber(800),31);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+135,2),769, Greenfoot.getRandomNumber(600));
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+225,2),Greenfoot.getRandomNumber(800),569);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+315,2),31,Greenfoot.getRandomNumber(600));
            }
        }
        if (Greenfoot.getRandomNumber(100)<10){
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Ufo(),Greenfoot.getRandomNumber(800),31);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Ufo(),769, Greenfoot.getRandomNumber(600));
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Ufo(),Greenfoot.getRandomNumber(800),569);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Ufo(),31,Greenfoot.getRandomNumber(600));
            }
        }
    }
    private void prepare() {
        Ice ice = new Ice();
        addObject(ice, 800, ice.getImage().getHeight()/2);
        // add the spaceship in the middle
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, getWidth()/2, getHeight()/2);
    }
    /**
     * adding stars to the background
     * inspired by asteroid example
     */
    private void setStars(int count) {
        GreenfootImage background = getBackground();
        for (int i = 0; i < count; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            int color = 150 - Greenfoot.getRandomNumber(50);
            background.setColor(new Color(color,color,color));
            background.fillOval(x, y, 2, 2);
        }
    }
}
