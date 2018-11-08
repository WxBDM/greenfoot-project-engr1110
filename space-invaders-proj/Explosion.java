import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private final static int IMAGE_COUNT = 8;
    private static GreenfootImage[] images;
    private int imageNum = 0;
    private int increment = 1;
    
    public Explosion() {
        initialiseImages();
        setImage(images[0]);
        Greenfoot.playSound("explosionSound.wav");
    }
    
    /**
     * Initializes the image.
     */
    public synchronized static void initialiseImages() {
        GreenfootImage baseImage = new GreenfootImage("explosion_test.png");
        int maxSize = baseImage.getWidth();
        int delta = maxSize / IMAGE_COUNT;
        int size = 0;
        images = new GreenfootImage[IMAGE_COUNT];
        for (int i = 0; i < IMAGE_COUNT; i++) {
            size = size + delta;
            images[i] = new GreenfootImage(baseImage);
            images[i].scale(size, size);
        }
    }
    /**
     * Grows the image and then dissapears once the image grows big enough.
     */
    public void act() 
    {
        setImage(images[imageNum]);
        imageNum += increment;
        if (imageNum >= IMAGE_COUNT) {
            increment = -increment;
            imageNum += increment;
        }
        if (imageNum < 0) {
            getWorld().removeObject(this);
        }
       
        
    }    
}
