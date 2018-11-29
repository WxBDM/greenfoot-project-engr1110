import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class MyWorld extends World {
   GameOver GameOver = new GameOver();
   private int dontRepopulateALot = 0;
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
   public MyWorld() {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        addObject(new Ship(), 400, 550);
        setPaintOrder(GameOver.class, Explosion.class, Ship.class, Enemy1.class, MyWorld.class);
        populate();
        displayLivesAndScore();
   }
   
   public void act() {
      displayLivesAndScore();
      addObject(new GameOver(), getWidth() / 2, getHeight() / 2);
      
      // dontRepopulateALot is the "failsafe" from populating multiple times.
      // without this variable, we would have MULTIPLE enemies stacked together, thus
      // slowing down the program and getting an out of memory error eventually.
      if (Ship.getScore() % 35 == 0 && Ship.getScore() != 0) {
          if (dontRepopulateALot == 0 && Ship.getScore() % 35 == 0) {
              populate();
              dontRepopulateALot++;
          }
      } else {
          dontRepopulateALot = 0;
      }
      
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
       showText("Score: " + Ship.getScoreMinusOne(), 60, 50); 
   }
   
   public GameOver getGameOver() {
       return GameOver;
    }
}
