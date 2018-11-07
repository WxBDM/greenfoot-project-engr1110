import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ship class. This is the player.
 * 
 * @author Smells like Team Spirit 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    public static int lives = 3; // number of lives.
    public int shotTimer = 25; // cooldown for shots fired.
    public int respawnTime = 0; // cooldown for respawn.
    
    /**
     * Constructor
     */
    public Ship() {
        GreenfootImage shipImage = new GreenfootImage("Ship.png");
        shipImage.scale(shipImage.getWidth() / 8, shipImage.getHeight() / 8);
        setImage(shipImage);
    }
    
    /**
     * Act method.
     */
    public void act() {
        checkCollisionEnemy();
        handleKeyPress();
        shotTimer--;
    } 
    
    /**
     * Checks collsion with an enemy.
     */
    public void checkCollisionEnemy() {
        Enemies e = (Enemies) getOneIntersectingObject(Enemies.class);
        if(e != null) {
            getWorld().addObject(new Explosion(), getX(), getY());
            lives--;
            if (lives == 0) {
                Greenfoot.setWorld(new MyWorld()); // resets game
                lives = 3; // resets lives
                Greenfoot.stop(); // stops the game from looping
            }
            setLocation(400, 550); // resets the location of player
        }
    }
    
    /**
     * Returns the number of lives.
     */
    public static int getLives() {
        return lives;
    }
    
    /**
     * Checks to see if any of the buttons are pressed - space, right or left.
     */
    private void handleKeyPress() {
        checkLeftArrow();
        checkRightArrow();
        checkSpaceBar();
    }
    /**
     * Checks to see if the player pressed the left key. If so, move 4 units left.
     */
    private void checkLeftArrow() {
         if (Greenfoot.isKeyDown("Left")) {
             move(-4);
         }
    }
    
    /**
     * Checks to see if player pressed ther right key. If so, move 4 units right.
     */
    private void checkRightArrow() {
        if (Greenfoot.isKeyDown("Right")) {
            move(4);
        }
    }
    
    /**
     * checks to see if user pressed the space bar. If so, shoot the bullet.
     */
    private void checkSpaceBar() {
        if (Greenfoot.isKeyDown("space")) {
            shootBullet();
        }
    }
    
    /**
     * This method shoots the bullet.
     */
    private void shootBullet() {
        if (shotTimer < 0) {
            getWorld().addObject(new Bullet(), getX(), getY() - 50);
            Greenfoot.playSound("shotSound.aiff");
            shotTimer = 25;
        }
    }
}
