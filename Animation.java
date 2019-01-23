import greenfoot.*;

/**
 * Write a description of class Animation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Animation extends Actor
{
    // instance variables - replace the example below with your own
    private int actCycleNum;
    private GreenfootImage[] animation = new GreenfootImage[40];
    /**
     * Constructor for objects of class Animation
     */
    public Animation()
    {
        //This is to call setupImages so it can work in the code.
        setupImages();
        
        //This makes actCycleNum equal to zero, so it can increase by 1 every act cycle
        actCycleNum = 0;
        
        //This makes the background the first image of the collection of images i have
        setImage(animation[0]);
    }

    private void setupImages()
    {
        //For loop that make i = 1, and if i is lesser or equal to animation.length, i increases by 1
        for( int i = 1; i <= animation.length; i++)
        {
            //animation i-1 is set to a new greenfoot image which is i .png
            animation[i-1] = new GreenfootImage( i + ".PNG" );
        }
    }
    
    public void act()
    {
        //Create a MyWorld variable that stores a reference to your MyWorld
        MyWorld theWorld = (MyWorld)getWorld();
        //If animation has started (use your MyWorld variable and a method from MyWorld)
        if(theWorld.animationStarted() == true)
        {
            //set the image to animation at actCycleNum mod 
            setImage( animation[ actCycleNum % 40 ]);
            actCycleNum++;
            Greenfoot.delay(10);
            //Increment actCycleNum by 1
        }
    }
}
