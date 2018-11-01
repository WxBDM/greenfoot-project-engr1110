import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld<T> extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public <T> MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 600, 1);
        addObject(new Ship(), 400, 550);
<<<<<<< HEAD
        
        //super(800, 600, 1);
=======
        addObject(new Bullet(), 400, 300);
<<<<<<< HEAD

       
=======
        
        // show how many enemies. All enemies start in the upper left.
        int num_rows = 5;
        int num_columns = 5;
>>>>>>> 3f89dea14832225ae1c4e71b84470d14dbbbc8cb
>>>>>>> acc9db0f09f68b2f310a89ae1a3d57f769921b52

        // show the enemies.
        for (int i = 100; i <= (num_rows + 1) * 50; i = i + 50){
            for (int j = 100; j <= (num_columns + 1) * 50; j = j + 50) {
                Actor actor = new Enemies(){};
                actor.turn(90);
                addObject(actor, j, i);
            }
        }
        
        // set the order in which goes on top.
        setPaintOrder(Ship.class, Enemies.class, MyWorld.class);
<<<<<<< HEAD
        
        // add the player to the world. Class: ship.
        //addObject(new Ship(), 750, 900);
=======
>>>>>>> 3f89dea14832225ae1c4e71b84470d14dbbbc8cb

    }
    public void act() {
         scroll();
    }
    public void scroll() {
        GreenfootImage background = getBackground();
        getBackground().drawImage(background, 0, -1);
        getBackground().drawImage(background, 0, background.getHeight()-1);
    }
}
