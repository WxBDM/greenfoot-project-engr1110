import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       GreenfootImage rocketImage= new GreenfootImage("rocket.png");
       rocketImage.scale(rocketImage.getWidth()/ 5, rocketImage.getHeight()/6);
       setImage(rocketImage);
       
       
       // Add your action code here.
    }    
}
