import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Main Menu for the game
     * 
     */
    public MainMenu()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        addStars(400);
        menuText();
    }
    /**
     * adding stars
     * inspired by asteroids examples
     */
    private void addStars(int count) {
        GreenfootImage background = getBackground();
        for (int i = 0; i < count; i++){
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            int color = 150 - Greenfoot.getRandomNumber(50);
            background.setColor(new Color(color,color,color));
            background.fillOval(x, y, 2, 2);
        }
    }
    private void menuText(){
       Menu menu= new Menu();
       addObject(menu,400,300);
    }
    public void act(){
        if (Greenfoot.isKeyDown("enter")){
            Level1 level1 = new Level1();
            Greenfoot.setWorld(level1);
        }
    }
}
