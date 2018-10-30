import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    public int lives = 3;
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Ship() {
        GreenfootImage shipImage = new GreenfootImage("Ship.png");
        shipImage.scale(shipImage.getWidth() / 8, shipImage.getHeight() / 8);
        setImage(shipImage);
    }
    public void act() 
    {
        handleKeyPress();
    }   
    public void checkCollision() {
        /**Enemies e = (Enemies) getOneIntersectingObject(Enemies.class);
        if(e != null) {
            getWorld().removeObject(this);
            lives--;
        }*/
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
        getWorld().addObject(new Bullet(), getX(), getY() - 50);
    }
}
