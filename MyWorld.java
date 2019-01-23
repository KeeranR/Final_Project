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
    //Int variable for ask name
    private int askName;
    
    //Private boolean names baskName which is equal to false
    private boolean baskName = false;

    //private double named daskname
    private double daskName;

    //Privae int array named ASK_NAME
    private int[] ASK_NAME;

    //private String named playerAskName which is equal to one
    private String playerAskName = "1";

    //Private string named playerAskNament which is equal to one
    private String playerAskNament = "1";

    
    boolean pDown = false;

    
    private boolean spaceDown = false;

    
    private boolean spacePressed = false;

    
    private int actCycleCount;

    
    private boolean startAnimation;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 839, 1);    

        addObject( new Animation(), getWidth()/2, getHeight()/2 );  

        askName = 0;
        
        actCycleCount = 0;
    }

    public void act()
    {
        introToHypnotization();
        randumbLoop();
        if( askName == 0 )
        {
            playerAskName = JOptionPane.showInputDialog( "Please enter your name", null );

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

    public void introToHypnotization()
    {   
        if(spaceDown == false && askName == 1)
        {
            showText("Hello " + playerAskName, getWidth()/2, getHeight()/2); 
            playerAskNament = "2";

            showText("Press Space To Begin", getWidth()/2, getHeight()/2 + 20);

            if (!pDown &&Greenfoot.isKeyDown("space"))
            {
                spaceDown = true;
            }
        }
        else
        {
            showText("", getWidth()/2, getHeight()/2);

            showText("", getWidth()/2, getHeight()/2 + 20);
        }
    }  

    public void randumbLoop()
    {
        if(spaceDown == true)
        {
            showText("Piskel Skills Starts In", getWidth()/2, getHeight()/2);
            showText("3", getWidth()/2, getHeight()/2 + 30);
            
            actCycleCount++;
            
            if( actCycleCount >= 60 )
            {
                showText("2", getWidth()/2, getHeight()/2 + 30);
            }
            
            if( actCycleCount >= 120 )
            {
                showText("1", getWidth()/2, getHeight()/2 + 30);
            }
            
            if( actCycleCount >= 225 )
            {
                showText("", getWidth()/2, getHeight()/2);

                showText("", getWidth()/2, getHeight()/2 + 30);
                
                startAnimation = true;
            }
                        
        }
               
        }
        
    public boolean animationStarted()
    {
        return startAnimation;
    }
    }
