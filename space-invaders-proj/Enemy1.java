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
    
    public void move() //move function, called in step
    {
        if (dir == 1 && shouldCar == 1) {
            if (getX() + 5 >= getWorld().getWidth()) { //if the next move would put us out of the map
                carridgeRight(); //call the carride function
                carridgeAlliesRight(); //bring our buddies
                movetimer = 0; //reset timer
                shouldMove = 0; //dont move
            }
        } else if (dir == 2 && shouldCar == 1) {
            if (getX() - 5 <= 0) {
                carridgeLeft();
                carridgeAlliesLeft();
                movetimer = 0;
                shouldMove = 0;
            }
        }
        if (dir == 1 && shouldMove == 1) { //if we are moving left and we can move
            if (getImage() == img1) { //change animation
                setImage(img2); 
            } else {
                setImage(img1);
            }
            setLocation(getX()+5, getY()); //move
            shouldMove = 0; //we cant move again yet
        } else if (dir == 2 && shouldMove == 1) { //same stuff as before
            if (getImage() == img1) {
                setImage(img2);
            } else {
                setImage(img1);
            }
            setLocation(getX()-5, getY()); //move
            shouldMove = 0;
        } else if (shouldMove == 0) { //if we cant move
            movetimer++; //add one to the timer
            if (movetimer == 24) {//if its at 24 steps
                shouldCar = 1; //check for caridge returns
            } else if (movetimer == 25) {
                shouldMove = 1; //we can move again
                shouldCar = 0; //dont want to caridge return now.
                movetimer = 0;
            }
        }
    }
    
        private void carridgeAlliesRight()//executes the preceding function on the other enemies
    {
        List allies = getWorld().getObjects(Enemy1.class);//list of all the other enemies
        Iterator i = allies.iterator();//create an iterator in that list
        while(i.hasNext()) {//if theres more enemies to move
            Enemy1 a = (Enemy1) i.next();//put the enemy into a variable
            if ( a != this) {//if they arent us (cuz we all ready moved)
                a.carridgeRight();//move them down
                a.setLocation(a.getX(), a.getY());
                a.shouldMove = 0;
                a.movetimer = 0;
                if (getImage() != a.getImage()) {
                    setImage(a.getImage());
                }
            }
        }
    }
    
        private void carridgeAlliesLeft()//same as above
    {
        List allies = getWorld().getObjects(Enemy1.class);
        Iterator i = allies.iterator();
        while(i.hasNext()) {
            Enemy1 a = (Enemy1) i.next();
            if ( a != this) {
                a.carridgeLeft();
                a.setLocation(a.getX(), a.getY());
                a.shouldMove = 0;
                a.movetimer = 0;
                if (getImage() != a.getImage()) {
                    setImage(a.getImage());
                }
            }
        }
    }
    
        private void carridgeRight() //moving down and switching direction function
    {
        setLocation(getX(), getY() + 5); //move down
        dir = 2;//change direction
        chance = chance+1; //increases our chance to fire
        //if (getY() > 60) {
         //   ((MyWorld) getWorld()).gameOver();
       // }
    }
    
        private void carridgeLeft()//same as above
    {
        setLocation(getX(), getY() + 5);
        dir = 1;
        chance = chance+1;
    }
    
        public void gameOver() 
    {
       // addObject(new ScoreBoard(score.getValue()), getWidth()/2, getHeight()/2);
        //Greenfoot.stop();
    }

}