import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 600, 1);
        addObject(new Ship(), 400, 550);
        
        //super(800, 600, 1);

        // show the enemies.
        for (int i = 100; i <= 300; i = i + 50){
            for (int j = 100; j <= 700; j = j + 50) {
                addObject(new Enemies(), j, i);
            }
        }
        
        // set the order in which goes on top.
        setPaintOrder(Ship.class, Enemies.class, MyWorld.class);
        
        // add the player to the world. Class: ship.
        //addObject(new Ship(), 750, 900);

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
