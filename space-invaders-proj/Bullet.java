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
       if (Enemy1!= null || getY() == 0) 
       {
       World myWorld = getWorld();
       myWorld. removeObject(Enemy1);
       MyWorld MyWorld= (MyWorld)myWorld;
       Counter counter = MyWorld.getCounter(); 
       counter.addScore();
       getWorld().removeObject(Enemy1);
       getWorld().removeObject(this);
       return; 
    }

       if (bullet_cooldown <= 5) 
       {
           int y = getY();
           y = y-2;
           setLocation(getX(), y);
           Actor actor = getOneIntersectingObject(Enemy1.class);
           getWorld().removeObject(actor);
           return;
        }
          if (getY() == 0) 
          {
               destroy();
            }
            
        else; 
        {
           bullet_cooldown++;
       }

    }    

    
    private void destroy() {
        ((MyWorld) getWorld()).ShootSet(1);
        getWorld().removeObject(this);
        }
    
    
}
