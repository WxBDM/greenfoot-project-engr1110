import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor {
    int  bullet_cooldown = 0;
    
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
       Actor Enemy1 = getOneIntersectingObject(Enemy1.class);
       Actor Enemy2 = getOneIntersectingObject(Enemy2.class);
       Actor Enemy3 = getOneIntersectingObject(Enemy3.class);
       if (Enemy1!= null || Enemy2 != null || Enemy3 != null || getY() == 0) {
           if (getY() == 0) {
               getWorld().removeObject(this);
           } else {
               if (Enemy1 != null) { getWorld().removeObject(Enemy1); }
               if (Enemy2 != null) { getWorld().removeObject(Enemy2); }
               if (Enemy3 != null) { getWorld().removeObject(Enemy3); }

               getWorld().removeObject(this);
               Ship.updateScore();
           }
       }
       
    }    

    
    private void destroy() {
        getWorld().removeObject(this);
        }
    
    
}
