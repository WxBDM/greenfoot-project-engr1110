import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy1
{
    private List<Integer> xCoords90;
    private List<Integer> yCoords180;
    private List<Integer> yCoords360;
    private int currentXPos;
    private int currentYPos;
    public static int moveDistance;
    
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy2() {
        GreenfootImage enemy2Image = new GreenfootImage("enemy2.gif");
    }

    public void act() {
        move(1);
        if (getX() == 650) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 125) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 100) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 150) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 651) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 175) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 99) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 200) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 652) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 225) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 98) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 250) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 653) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 275) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 97) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 300) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 654) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 325) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 96) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 350) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 655) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 375) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 95) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 400) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 656) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 425) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 94) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 450) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 657) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 475) {
            setLocation(getX(), getY());
            setRotation(180);
        }
        if (getX() == 93) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 500) {
            setLocation(getX(), getY());
            setRotation(360);
        }
        if (getX() == 658) {
            setLocation(getX(), getY());
            setRotation(90);
        }
        if (getY() == 525) {
            setLocation(getX(), getY());
            setRotation(180);
        }
    }
}
