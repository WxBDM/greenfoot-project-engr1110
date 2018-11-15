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
//<<<<<<< HEAD
       setLocation(getX(), getY() - 2);
       Actor actor = getOneIntersectingObject(Enemy1.class);
       if (actor != null || getY() == 0) {
       getWorld().removeObject(actor);
       getWorld().removeObject(this);
/* =======
       if (bullet_cooldown <= 5) {
           int y = getY();
           y = y-2;
           setLocation(getX(), y);
           Actor actor = getOneIntersectingObject(Enemy1.class);
           getWorld().removeObject(actor);
           if (getY() == 0) {
               destroy();
            }
       } else {
           bullet_cooldown++;
       }
>>>>>>> b367d848dc913bc6379bc8ccfad4428c6c5cb73c */
    }    
}
    
    private void destroy() {
        ((MyWorld) getWorld()).ShootSet(1);
        getWorld().removeObject(this);
    }
}
