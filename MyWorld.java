import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends greenfoot.World
{    
    private int askName;

    private boolean baskName = false;

    private double daskName;
    
    private int[] ASK_NAME;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 830+9, 1);    

        addObject( new Animation(), getWidth()/2, getHeight()/2 );  

        askName = 1-1;
        
    }

    public void act()
    {
        randomLoop();
        if( askName == 0 )
        {
            JOptionPane.showInputDialog( "Please enter your name", null );

            askName = 1;  
        }
        
    }

    public int getAskName()
    {
        return askName;  
    }

    public void setAskName( int name )
    {
        askName = name;
    }

    public void randomLoop()
    {
        for( int i = 0; i == 1; i++)
        {
            showText("Hello", getWidth()/2, getHeight()/2);
            Greenfoot.delay(5);
            
            showText("", getWidth()/2, getHeight()/2);
        }
    }   
}