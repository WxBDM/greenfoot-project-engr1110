import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemies extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemies() {
        GreenfootImage enemyImage = new GreenfootImage("robot.png");
        int score = 0;
    }
    
    public void act() {
        move(1);
        checkIntersecting();
    }
    /**
     * Checks for any intersecting Bullets. If the bullet intersects,
     *  then delete the enemey and add a point.
     */
    private void checkIntersecting() {
        Bullet b = (Bullet) getOneIntersectingObject (Bullet.class);
        if (b != null) {
            getWorld().removeObject(b);
            getWorld().removeObject(this);
        }
    }
}
