import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World {
   public int shot = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   public MyWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Ship(), 400, 550);
        displayLivesAndScore();
        setPaintOrder(Ship.class, Enemy1.class, MyWorld.class);
        populate();
   }
   
   public void act() {}
   
   public void ShootSet(int arg) {
       shot = arg;
   }
   
    /**
     * Scrolls the background to simulate the ship moving through space.
     */
   public void scrollBackground() {
       GreenfootImage background = getBackground();
       getBackground().drawImage(background, 0, 1);
       getBackground().drawImage(background, 0, background.getHeight() + 1);
   }
    
   /**
    * Populates the world with the enemies.
    */
   public void populate() {
      int colSpace = 100; // set initial y coordinate
      for (int row = 0; row < 5; row++) { // iterate through the rows
          for (int col = 0; col < 10; col++) { // iterate through the columns
              int xCoord = (col * 50) + 150; // determines x coordinate
              if (row == 0) {
                  addObject(new Enemy1(), xCoord, colSpace);
              } else if (row == 1) {
                  addObject(new Enemy2(), xCoord, colSpace);
              } else if (row == 2) {
                  addObject(new Enemy2(), xCoord, colSpace);
              } else if (row == 3) {
                  addObject(new Enemy3(), xCoord, colSpace);
              } else {
                  addObject(new Enemy3(), xCoord, colSpace);
              }
          }
          colSpace = colSpace + 25; // updates y coordinate
      }
   }
    
   /**
    * Displays the lives and the score upon start.
    */
   private void displayLivesAndScore() {
       showText("Lives: " + Ship.getLives(), 60, 20);
   }
}
