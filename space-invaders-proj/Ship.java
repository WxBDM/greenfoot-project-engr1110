import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    public static int lives = 3;
    public int shotTimer = 25;
    
    public Ship() {
        GreenfootImage shipImage = new GreenfootImage("Ship.png");
        shipImage.scale(shipImage.getWidth() / 8, shipImage.getHeight() / 8);
        setImage(shipImage);
    }
    public void act() 
    {
        checkCollision();
        handleKeyPress();
        shotTimer--;
    }   
    public void checkCollision() {
        Enemies e = (Enemies) getOneIntersectingObject(Enemies.class);
        if(e != null) {
            getWorld().addObject(new Explosion(), getX(), getY());
            lives--;
            if (lives <= 0) {
                Greenfoot.stop();
            }
            setLocation(400, 550);
        }
    }
    public static int getLives() {
        return lives;
    }
    public void handleKeyPress() {
        checkLeftArrow();
        checkRightArrow();
        checkSpaceBar();
    }
    public void checkLeftArrow() {
         if (Greenfoot.isKeyDown("Left")) {
             move(-4);
            }
    }
    public void checkRightArrow() {
        if (Greenfoot.isKeyDown("Right")) {
            move(4);
        }
    }
    public void checkSpaceBar() {
        if (Greenfoot.isKeyDown("space")) {
            shootBullet();
        }
    }
    public void shootBullet() {
        if (shotTimer < 0) {
        getWorld().addObject(new Bullet(), getX(), getY() - 50);
        Greenfoot.playSound("shotSound.aiff");
        shotTimer = 25;
    }
    }
}
