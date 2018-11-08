import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor {
    public Bullet() {
        GreenfootImage bulletImage = new GreenfootImage("Bullet.png");
        bulletImage.scale(bulletImage.getWidth() / 5, bulletImage.getHeight() / 5);
        setImage(bulletImage);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       int y = getY();
       y = y-2;
       setLocation(getX(), y);
       
       if (getY() == 0) {
           destroy();
        }
    }    
    
    private void destroy() {
        ((MyWorld) getWorld()).ShootSet(1);
        getWorld().removeObject(this);
    }
}  
