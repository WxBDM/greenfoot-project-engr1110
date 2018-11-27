import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor {
    //int bullet_cooldown = 0;
    
    public Bullet() {
        GreenfootImage bulletImage = new GreenfootImage("bullet_cropped.png");
        bulletImage.scale(bulletImage.getWidth() / 5, bulletImage.getHeight() / 5);
        setImage(bulletImage);
    }
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

       setLocation(getX(), getY() - 2);
       Actor actor = getOneIntersectingObject(Enemy1.class);
       if (actor != null || getY() == 0) {
       getWorld().removeObject(actor);
       getWorld().removeObject(this);
    }    
}
    
    private void destroy() {
        ((MyWorld) getWorld()).ShootSet(1);
        getWorld().removeObject(this);
    }
}
