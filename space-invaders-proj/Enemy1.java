import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Enemy1() {
        GreenfootImage enemy1Image = new GreenfootImage("enemy1.gif");
    }
    protected void shootBullet() {
        if (Greenfoot.getRandomNumber(1000) < 2) {
            getWorld().addObject(new EnemyBullet(), getX(), getY());
        }
    }
    public void act() {
        move(1);
        shootBullet();
        setLocation(getX(), getY());
        if (getX() == 650) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 125) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 100) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 150) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 651) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 175) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 99) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 200) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 652) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 225) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 98) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 250) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 653) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 275) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 97) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 300) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 654) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 325) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 96) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 350) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 655) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 375) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 95) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 400) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 656) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 425) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 94) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 450) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 657) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 475) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 93) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 500) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 658) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 525) {
            setLocation(getX(), getY());
            setRotation(180);
        }
    }
}

