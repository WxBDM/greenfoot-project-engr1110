import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    
    // global variables for lives and score.
    int score = 0;
    public static int num_lives = 3;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        // add in ship and bullet. Bullet is located under the ship and will 
        // "respawn" when it is shot. The bullet at all times moves with the ship.
        addObject(new Ship(), 400, 550);
        //addObject(new Bullet(), 400, 550);
        
        // show how many enemies. All enemies start in the upper left.
        int num_rows = 5;
        int num_columns = 5;

        // show the enemies.
        for (int i = 100; i <= (num_rows + 1) * 50; i = i + 50){
            for (int j = 100; j <= (num_columns + 1) * 50; j = j + 50) {
                Actor actor = new Enemies(){};
                actor.turn(90);
                addObject(actor, j, i);
            }
        }
        
        // set the order in which goes on top.
        setPaintOrder(Ship.class, Enemies.class, MyWorld.class);
        
        
        showText("Score: " + score, 60, 42);
    }
    
    public void act() {
         scrollBackground();
         showText("Lives: " + Ship.getLives(), 60, 20);
    }
    
    /**
     * Scrolls the background to simulate the ship moving through space.
     */
    public void scrollBackground() {
        GreenfootImage background = getBackground();
        getBackground().drawImage(background, 0, -1);
        getBackground().drawImage(background, 0, background.getHeight() - 1);
    }
    
}
