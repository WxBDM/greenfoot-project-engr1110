import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ship class. This is the player.
 * 
 * @author Smells like Team Spirit 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    public static int lives; // number of lives.
    public int shotTimer = 25; // cooldown for shots fired.
    public static int score;
    GameOver GameOver = new GameOver();
    /**
     * Constructor
     */
    public Ship() {
        GreenfootImage shipImage = new GreenfootImage("ship_cropped.png");
        shipImage.scale(shipImage.getWidth() / 8, shipImage.getHeight() / 8);
        setImage(shipImage);
        lives = 3;
        score = 1;
    }
    
    /**
     * Act method.
     */
    public void act() {
        checkAllCollisions();
        handleKeyPress();
        shotTimer++;
        checkLives();
    } 
    
    /**
     * Checks collsion with an enemy and bullet.
     * If colliding with bullet, decrement lives. if it's zero, display "game over".
     * If colliding with enemy, display "game over".
     */
    public void checkAllCollisions() {
        Enemy1 eOne = (Enemy1) getOneIntersectingObject(Enemy1.class);
        Enemy2 eTwo = (Enemy2) getOneIntersectingObject(Enemy2.class);
        Enemy3 eThree = (Enemy3) getOneIntersectingObject(Enemy3.class);
        EnemyBullet b = (EnemyBullet) getOneIntersectingObject(EnemyBullet.class);
        
        // if colliding with bullet, don't end the game.
        if (b != null) {
            getWorld().addObject(new Explosion(), getX(), getY());
            lives--;
            getWorld().removeObject(b); // removes enemy bullet
        }
        
        if(eOne != null || eTwo != null || eThree != null) {
            getWorld().addObject(new Explosion(), getX(), getY());
            lives = 0;
            checkLives();
        }
    }

    /**
     * Returns the number of lives.
     */
    public static int getLives() {
        return lives;
    }
    
    public static int getScoreMinusOne() {
        return score - 1;
    }
    
    public static void updateScore() {
        score++;
    }
    
    public static int getScore() {
        return score;
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
             move(-2);
         }
    }
    
    /**
     * Checks to see if player pressed ther right key. If so, move 4 units right.
     */
    private void checkRightArrow() {
        if (Greenfoot.isKeyDown("Right")) {
            move(2);
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
        if (shotTimer > 100) {
            getWorld().addObject(new Bullet(), getX(), getY() - 50);
            Greenfoot.playSound("shotSound.aiff");
            shotTimer = 50;
        }
    }
    
    public void checkLives() {
        if (lives == 0) {
            this.getWorld().addObject(GameOver, 400, 300);
            getWorld().removeObject(this);
        }
    }
}
