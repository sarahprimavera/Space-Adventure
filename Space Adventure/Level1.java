import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level 1 class
 * Spawn Asteroids
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public class Level1 extends World
{
    int score;
    boolean gameOver=false;
    GreenfootSound gfs=new GreenfootSound("levelmusic.wav");
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);
        background.fill();
        addStars(400);
        score=0;
        prepare();
        showScore();
    }
    /**
     * using act to add asteroids
     */
    public void act(){
        if (Greenfoot.getRandomNumber(100)<25){
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+45,1),Greenfoot.getRandomNumber(800),31);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+135,1),769, Greenfoot.getRandomNumber(600));
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+225,1),Greenfoot.getRandomNumber(800),569);
            }
            if (Greenfoot.getRandomNumber(100)<2){
                addObject(new Asteroid(Greenfoot.getRandomNumber(90)+315,1),31,Greenfoot.getRandomNumber(600));
            }
        }
        
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
        //music for levels
        gfs.setVolume(30);
        gfs.playLoop();
        //background for score so it appears clearly
        ScoreBackground scoreBackground = new ScoreBackground();
        addObject(scoreBackground,50,575);
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
            int color = 150 - Greenfoot.getRandomNumber(50);
            background.setColor(new Color(color,color,color));
            background.fillOval(x, y, 2, 2);
        }
    }
    public void addScore(int points){
        if (!gameOver)
            score=score+points;
        showScore();
    }
    public void showScore(){
        showText("Score: "+score,50,575);
    }
    public int getScore(){
        return score;
    }
}
