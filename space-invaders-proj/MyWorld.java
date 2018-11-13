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
        //displayLivesAndScore();
        setPaintOrder(Ship.class, Enemy1.class, MyWorld.class);
        populate();
   }
       public void act() {
           
   }
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
    public void populate() {
       //first row
       Enemy1[] enemies1 = new Enemy1[10];
       for ( int i = 0; i <10; i++ ) {
           enemies1[i] = new Enemy1();
           addObject(enemies1[i], (i*50)+150, 100);
       }
        //second row
       Enemy2[] enemies2 = new Enemy2[21];
       for ( int i = 0; i <10; i++ ) {
           enemies2[i] = new Enemy2();
           addObject(enemies2[i], (i*50)+150, 125);
       }
        //3rd row
        for ( int i = 11; i <21; i++ ) {
            enemies2[i] = new Enemy2();
            addObject(enemies2[i], ((i*50)-400), 150);
       } 
        //4th row
       Enemy3[] enemies3 = new Enemy3[21];
       for ( int i = 0; i <10; i++ ) {
           enemies3[i] = new Enemy3();
           addObject(enemies3[i], (i*50)+150, 175);
       } 
        //final row
       for ( int i = 11; i <21; i++ ) {
           enemies3[i] = new Enemy3();
           addObject(enemies3[i], ((i*50)-400), 200);
       }  
    }
    
    private void displayLivesAndScore() {
        showText("Lives: " + Ship.getLives(), 60, 20);
    }

}
