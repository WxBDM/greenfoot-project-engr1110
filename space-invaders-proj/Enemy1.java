import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemies here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy1 extends Actor
{
    /**
     * Act - do whatever the Enemies wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int dir = 1; //1 = left 2 = right
    
    public int movetimer = 0; //timer value to move at cetain intervals
    
    public int shouldMove = 0; //weather or not they should move
    
    public int shouldCar = 0;
    
    public GreenfootImage img1; //1st animation
    
    public GreenfootImage img2; //2nd animation
    
    public int shoot; //variable to determine if wea should shoot or not. starting chance is 2%
    
    public int chance = 1; //chance to shoot, starts at 2%
    public Enemy1() {
        GreenfootImage enemy1Image = new GreenfootImage("enemy1.gif");
    }
    
    public void act() {
       
    }

}