import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ship here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ship extends Actor
{
    /**
     * Act - do whatever the Ship wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Ship() {
        GreenfootImage shipImage = new GreenfootImage("Ship.png");
        shipImage.scale(shipImage.getWidth() / 7, shipImage.getHeight() / 7);
        setImage(shipImage);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
