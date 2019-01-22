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
    private int x;
    
    private GreenfootImage[] animation = new GreenfootImage[4];
    /**
     * Constructor for objects of class Animation
     */
    public Animation()
    {
        setupImages();
        
        setImage(animation[0]);
    }

    private void setupImages()
    {
        for( int i = 1; i <= animation.length; i++)
        {
            animation[i-1] = new GreenfootImage( i + ".PNG" );
        }
    }
}
