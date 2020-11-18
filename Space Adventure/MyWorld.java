import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int level = 1;
    public MyWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        addStars(350);
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        // add the spaceship in the middle
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, getWidth()/2, getHeight()/2);
        // add earth in top right corner
        Earth earth = new Earth();
        addObject(earth, getWidth(), earth.getImage().getHeight()/2);
    }
    
    /**
     * Draw a nmuber of stars for the background
     * Inspired by the asteroids example
     */
    private void addStars(int count) {
        GreenfootImage background = getBackground();
        for (int i = 0; i < count; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            background.setColor(Color.WHITE);
            background.fillOval(x, y, 2, 2);
        }
    }
    public void nextLevel(){
        level++;
        // if we are at level 2, show the ice planet
        if (level == 2) {
            Ice ice = new Ice();
            addObject(ice, 800, ice.getImage().getHeight()/2);
        }
        // if we are at level 3, show the lava planet
        else if (level == 3) {
            Lava lava = new Lava();
            addObject(lava, 800, lava.getImage().getHeight()/2);
        }
        // if we are at level 4, it means that the game is over
    }
}
