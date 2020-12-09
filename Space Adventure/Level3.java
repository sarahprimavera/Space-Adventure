import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 3 class
 * Spawns Asteroids, Ufos and Stars
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public class Level3 extends World
{
    int score;
    boolean gameOver=false;
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        score=0;
        prepare();
        setStars(400);
        showScore();
    }
    /**
     * using act to add asteroids, Ufo's and stars
     */
    public void act(){
        // spawn asteroid
        if (Greenfoot.getRandomNumber(100)<25){
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+45,3),Greenfoot.getRandomNumber(800),31);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+135,3),769, Greenfoot.getRandomNumber(600));
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+225,3),Greenfoot.getRandomNumber(800),569);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+315,3),31,Greenfoot.getRandomNumber(600));
            }
        }
        // spawn Ufo's
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
        // spawn Stars
        if (Greenfoot.getRandomNumber(100)<7){
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Star(Greenfoot.getRandomNumber(90)+45),Greenfoot.getRandomNumber(800),31);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Star(Greenfoot.getRandomNumber(90)+135),769, Greenfoot.getRandomNumber(600));
            }
            if (Greenfoot.getRandomNumber(100)<2){
               addObject(new Star(Greenfoot.getRandomNumber(90)+225),Greenfoot.getRandomNumber(800),569);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Star(Greenfoot.getRandomNumber(90)+315),31,Greenfoot.getRandomNumber(600));
            }
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() {
        
        Lava lava = new Lava();
        addObject(lava, 800, lava.getImage().getHeight()/2);
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
            int color = 100 + Greenfoot.getRandomNumber(70);
            background.setColor(new Color(255,color,color));
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
