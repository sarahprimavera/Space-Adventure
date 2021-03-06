import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main menu class
 * 
 * @author Sarah Primavera
 */
public class MainMenu extends World
{
    GreenfootSound gfs=new GreenfootSound("mainmenu.wav");
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
        prepare();
        playSound(true);
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
    /**
     * adding text to menu
     */
    private void menuText(){
        Menu menu= new Menu();
        addObject(menu,400,300);
    }
    /**
     * options to go either to instructions, credits or level 1
     */
    public void act(){
        if (Greenfoot.isKeyDown("enter")){
            Level1 level1 = new Level1();
            gfs.stop();
            Greenfoot.setWorld(level1);
        }
        if (Greenfoot.isKeyDown("i")){
            Instructions intstructions = new Instructions();
            Greenfoot.setWorld(intstructions);
        }
        if (Greenfoot.isKeyDown("c")){
            Credits credits = new Credits();
            Greenfoot.setWorld(credits);
        }
    }
    /**
     * used to play background music
     */
    public void playSound(boolean play){
        if (play==true){
            gfs.play();
        }
        else{
            gfs.stop();
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Spaceship spaceship = new Spaceship();
        addObject(spaceship,171,270);
        Earth earth = new Earth();
        addObject(earth,342,271);
        Ice ice = new Ice();
        addObject(ice,474,272);
        Lava lava = new Lava();
        addObject(lava,604,278);
    }
}
