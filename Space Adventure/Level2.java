import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 2 class
 * Spawn Asteroids and Ufos
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public class Level2 extends World
{
    int score;
    boolean gameOver=false;
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        setStars(350);
        score=0;
        prepare();
        showScore();
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
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        Ice ice = new Ice();
        addObject(ice, 800, ice.getImage().getHeight()/2);
        // add the spaceship in the middle
        Spaceship spaceship = new Spaceship();
        addObject(spaceship, getWidth()/2, getHeight()/2);
        //background for score so it appears clearly
        ScoreBackground scoreBackground = new ScoreBackground();
        addObject(scoreBackground,50,575);
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
            int color = 100 + Greenfoot.getRandomNumber(151);
            background.setColor(new Color(0,color,color));
            background.fillOval(x, y, 2, 2);
        }
    }
    /**
     * using this method to add or remove score
     */
    public void addScore(int points){
        if (!gameOver)
            score=score+points;
        showScore();
    }
    /**
     * using this method to show the score at the bottom
     */
    public void showScore(){
        showText("Score: "+score,50,575);
    }
    /**
     * getter for score field
     */
    public int getScore(){
        return score;
    }
}
