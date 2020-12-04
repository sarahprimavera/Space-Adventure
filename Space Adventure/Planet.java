import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Planet class that automaticaly loads next level
 * 
 * @author Hawad Ahmad and Sarah Primavera
 */
public abstract class Planet extends SmoothMover
{
    private boolean gameOver = false;
    /**
     * Checks the position of the planet. If located at left border, 
     * load next level
     */
    public void checkIfNextLevel() {
        // if reached left
        if (getX() == 0 && !gameOver) {
            gameOver = true;
            if (getWorld() instanceof Level1){
                Level1 level1=(Level1)getWorld();
                getWorld().showText("You lose: "+level1.getScore(),400,300);
                getWorld().showText("Press enter to restart level 1",400,350);
                getWorld().showText("Press m to go back to main menu",400,400);
                if (Greenfoot.isKeyDown("enter")){
                    level1 = new Level1();
                    Greenfoot.setWorld(level1);
                }
                if (Greenfoot.isKeyDown("m")){
                    MainMenu mainmenu = new MainMenu();
                    Greenfoot.setWorld(mainmenu);
                }
            }
            if (getWorld() instanceof Level2){
                Level2 level2=(Level2)getWorld();
                getWorld().showText("You lose: "+level2.getScore(),400,300);
                getWorld().showText("Press enter to restart level 2",400,350);
                getWorld().showText("Press m to go back to main menu",400,400);
                if (Greenfoot.isKeyDown("enter")){
                    level2 = new Level2();
                    Greenfoot.setWorld(level2);
                }
                if (Greenfoot.isKeyDown("m")){
                    MainMenu mainmenu = new MainMenu();
                    Greenfoot.setWorld(mainmenu);
                }
            }
            if (getWorld() instanceof Level3){
                Level3 level3=(Level3)getWorld();
                getWorld().showText("You lose: "+level3.getScore(),400,300);
                getWorld().showText("Press enter to restart level 3",400,350);
                getWorld().showText("Press m to go back to main menu",400,400);
                if (Greenfoot.isKeyDown("enter")){
                    level3 = new Level3();
                    Greenfoot.setWorld(level3);
                }
                if (Greenfoot.isKeyDown("m")){
                    MainMenu mainmenu = new MainMenu();
                    Greenfoot.setWorld(mainmenu);
                }
            }
        }
        else{
            if (getWorld() instanceof Level1) {
                Level1 level1=(Level1)getWorld();
                if (level1.getScore()==100){
                    Level2 level2 = new Level2();
                    Greenfoot.setWorld(level2);
                }
            }
            else if (getWorld() instanceof Level2){
                Level2 level2=(Level2)getWorld();
                if (level2.getScore()==200){
                    Level3 level3 = new Level3();
                    Greenfoot.setWorld(level3);
                }
            }
            else{
                if(getWorld() instanceof Level3){
                    Level3 level3=(Level3)getWorld();
                    if (level3.getScore()==300){
                        getWorld().showText("You win!!",400,300);
                        Greenfoot.stop();
                    }
                }
            }
        }
    }
}

