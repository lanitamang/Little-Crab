import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    private GreenfootImage originalCrab;
    private GreenfootImage walkingCrab;
    private int animationDelay = 5;
    private final int MAX_WORMS = 8;
    private int numEaten;
    
    public Crab()
    {
        originalCrab = new GreenfootImage("crab.png");
        walkingCrab = new GreenfootImage("crab2.png");
        numEaten = 0;
    }
    
    public void act()
    {
        // Add your action code here 
        move(5);
        
        if( animationDelay >= 5 )
        {
            if( getImage() == originalCrab )
            {
                setImage( walkingCrab );
            }
            else
            {
                setImage( originalCrab );
            }
            animationDelay = 0;
        }
        
        if( Greenfoot.isKeyDown("left") )
        {
            turn(-4);
        }
        
        if( Greenfoot.isKeyDown("right") )
        {
            turn(4);
        }
        
        if( isTouching( Worm.class ) )
        {
            removeTouching(Worm.class);
            //Greenfoot.playSound("slurp.wav");
            numEaten++;
        }
        
        if( numEaten == MAX_WORMS )
        {
            getWorld().showText("YOU WIN!!", getWorld().getWidth()/2, getWorld().getHeight()/2 );
            Greenfoot.stop();
        }
        
        animationDelay++;
    }
    
    
    
    
    
    
    
}


