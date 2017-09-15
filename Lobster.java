import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here
        
        move(5);
        
        if( isAtEdge() )
        {
            turn(17);
        }
        
        if( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn( Greenfoot.getRandomNumber(90) - 45 );
        }
        
        if( isTouching( Crab.class ) )
        {
            removeTouching(Crab.class);
            //Greenfoot.playSound("slurp.wav");
            getWorld().showText("YOU LOSE!!", getWorld().getWidth()/2, getWorld().getHeight()/2 );
            Greenfoot.stop();
        }
        
        
        
        
        
        
        
        
        
    }
}
