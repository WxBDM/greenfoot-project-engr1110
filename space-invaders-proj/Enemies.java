import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The enemies class - does stuff that reflects enemy characteristics such as
 *  movement, shooting, and killing player upon impact.
 * 
 * @author Smells Like Team Spirit 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    public static int score = 0; // the score of the player
    
    /**
     * Constructor - sets the initial enemies image. MyWorld sets the enemies on map.
     */
    public Enemies() {
        GreenfootImage enemyImage = new GreenfootImage("robot_cropped.png");
        resetScore();
    }
    
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        move(1);
        checkIntersecting();
        shoot(); // if not polished for beta - comment out.
    }
    
    /**
     * Checks for any intersecting bullets. If the bullet intersects with enemy,
     *  delete the enemey and add a point. The bullet is coming from player.
     */
    private void checkIntersecting() {
        Bullet b = (Bullet) getOneIntersectingObject (Bullet.class);
        if (b != null) {
            getWorld().removeObject(b);
            getWorld().removeObject(this);
            score++; //updates score
        }
    }
    
    /**
     * Generates a random number and determines whether to shoot or not.
     */
    private void shoot() {
        // Future update: Get the current player location and have bullet head towards
        //  that location.
        
        int randomNumber = Greenfoot.getRandomNumber(500);
        
        // Note that the enemies, when shooting, will make themselves dissapear.
        // Therefore, we can either modify the bullet class to see which
        //  actor is shooting, or create a new class specifically for the enemies.
        if (randomNumber == 0) {
            getWorld().addObject(new EnemyBullet(), getX(), getY() + 50);
            Greenfoot.playSound("shotSound.aiff");
        }
    }
    
    /**
     * Returns the current score of the player.
     */
    public static int getScore() {
        return score;
    }
    
    private int resetScore() {
        return score = 0;
    }
}
