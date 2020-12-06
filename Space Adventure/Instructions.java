import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends World
{

    /**
     * Constructor for objects of class Instructions.
     * 
     */
    public Instructions()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        addStars(400);

        prepare();
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
    public void act(){
        if (Greenfoot.isKeyDown("enter")){
            Level1 level1 = new Level1();
            Greenfoot.setWorld(level1);
        }
        if (Greenfoot.isKeyDown("m")){
            MainMenu mainmenu = new MainMenu();
            mainmenu.playSound(false);
            Greenfoot.setWorld(mainmenu);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        InstructionsText instructionsText = new InstructionsText();
        addObject(instructionsText,400,300);
    }
}
