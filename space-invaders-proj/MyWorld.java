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
        addObject(new Ship(), 140, 700);
        // First row
        addObject(new Enemies(), 100, 100);
        addObject(new Enemies(), 150, 100);
        addObject(new Enemies(), 200, 100);
        addObject(new Enemies(), 250, 100);
        addObject(new Enemies(), 300, 100);
        addObject(new Enemies(), 350, 100);
        addObject(new Enemies(), 400, 100);
        addObject(new Enemies(), 450, 100);
        addObject(new Enemies(), 500, 100);
        addObject(new Enemies(), 550, 100);
        addObject(new Enemies(), 600, 100);
        addObject(new Enemies(), 650, 100);
        addObject(new Enemies(), 700, 100);
        
        //Second Row
        addObject(new Enemies(), 100, 150);
        addObject(new Enemies(), 150, 150);
        addObject(new Enemies(), 200, 150);
        addObject(new Enemies(), 250, 150);
        addObject(new Enemies(), 300, 150);
        addObject(new Enemies(), 350, 150);
        addObject(new Enemies(), 400, 150);
        addObject(new Enemies(), 450, 150);
        addObject(new Enemies(), 500, 150);
        addObject(new Enemies(), 550, 150);
        addObject(new Enemies(), 600, 150);
        addObject(new Enemies(), 650, 150);
        addObject(new Enemies(), 700, 150);
        
        //Third Row
        addObject(new Enemies(), 100, 200);
        addObject(new Enemies(), 150, 200);
        addObject(new Enemies(), 200, 200);
        addObject(new Enemies(), 250, 200);
        addObject(new Enemies(), 300, 200);
        addObject(new Enemies(), 350, 200);
        addObject(new Enemies(), 400, 200);
        addObject(new Enemies(), 450, 200);
        addObject(new Enemies(), 500, 200);
        addObject(new Enemies(), 550, 200);
        addObject(new Enemies(), 600, 200);
        addObject(new Enemies(), 650, 200);
        addObject(new Enemies(), 700, 200);
        
        //Fourth Row
        addObject(new Enemies(), 100, 250);
        addObject(new Enemies(), 150, 250);
        addObject(new Enemies(), 200, 250);
        addObject(new Enemies(), 250, 250);
        addObject(new Enemies(), 300, 250);
        addObject(new Enemies(), 350, 250);
        addObject(new Enemies(), 400, 250);
        addObject(new Enemies(), 450, 250);
        addObject(new Enemies(), 500, 250);
        addObject(new Enemies(), 550, 250);
        addObject(new Enemies(), 600, 250);
        addObject(new Enemies(), 650, 250);
        addObject(new Enemies(), 700, 250);
        
        //Fifth Row
        addObject(new Enemies(), 100, 300);
        addObject(new Enemies(), 150, 300);
        addObject(new Enemies(), 200, 300);
        addObject(new Enemies(), 250, 300);
        addObject(new Enemies(), 300, 300);
        addObject(new Enemies(), 350, 300);
        addObject(new Enemies(), 400, 300);
        addObject(new Enemies(), 450, 300);
        addObject(new Enemies(), 500, 300);
        addObject(new Enemies(), 550, 300);
        addObject(new Enemies(), 600, 300);
        addObject(new Enemies(), 650, 300);
        addObject(new Enemies(), 700, 300);
        
        setPaintOrder(Ship.class, Enemies.class, MyWorld.class);

    }
}
