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

    //Private boolean named pDown which is equal to false
    private boolean pDown = false;

    //Private boolean named spaceDown whihc is equal to fase
    private boolean spaceDown = false;

    //Private boolean named spacePressed which is equal to false
    private boolean spacePressed = false;

    //Private int named actCycleCount
    private int actCycleCount;

    //Private boolean named startAnimation
    private boolean startAnimation;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {   
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(840, 839, 1);    

        //The World adds a object which is a new animation at the width of the world divided by 2 and the height of the world divided by 2
        addObject( new Animation(), getWidth()/2, getHeight()/2 );  

        //askName is equal to zero
        askName = 0;

        //actCycleCount is equal to zero
        actCycleCount = 0;
    }

    public void act()
    {
        //introToHypnotization is called
        introToHypnotization();

        //randumbLoop is called
        randumbLoop();
        /**
         * If askName is equal to zero
         *   playerAskName is equal to JOptionPane.showInputDialog which will ask you your name on the starting screen
         *   askname will equal to one
         */

        if( askName == 0 )
        {
            playerAskName = JOptionPane.showInputDialog( "Please enter your name", null );

            askName = 1;  
        }
    } 

    public int getAskName()
    {
        // it returns askName
        return askName;   
    }

    public void setAskName( int name )
    {   
        //askName is equals to int name
        askName = name;
    }  

    public void introToHypnotization()
    {   
        /**
         * if spaceDown == false && askName == 1
         *  it will show text saying hello with playerAskName beside it at the location of the width of the world divided by 2 and the height of the world divided by 2
         *  playerAskNament is equal to 2
         *  It will say Press Space To Begin at the location of the width of the world divided by 2 and the height of the workd divided by 2
         *  if !pDown && Greenfoot.isKeyDown("space")
         *      space down is equal to 2     
         *   else
         *      showText to hide the hello and press space
         */

        if(spaceDown == false && askName == 1)
        {
            showText("Hello " + playerAskName, getWidth()/2, getHeight()/2); 
            playerAskNament = "2";

            showText("Press Space To Begin", getWidth()/2, getHeight()/2 + 20);

            if (!pDown && Greenfoot.isKeyDown("space"))
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
        /**
         * if spaceDown == true
         *  showText will say Piskel Skills Starts In at the width of the world divided by 2 and at the
         *   height of the world divided by 2
         *  showText will say 3 at the width of the world divided by 2 and at the height of the world 
         *   divided by 2 plus 30
         *  actCycleCount increase by 1 increment
         * 
         *  if actCycle count is greater or equal to 60
         *   showText will say 2 at the width of the world divided by 2 and at the height of the world
         *    divided by 2 plus 30
         *    
         *  if actCycleCount is greater or equal to 120
         *   showText will say 2 at the width of the world divided by 2 and at the height of the world 
         *    divided by 2 plus 30
         *  
         *  if actCycleCount is greater or equal to 225
         *   showText will be blank at the width of the world divided by 2 and at the height of the 
         *    world divided by 2
         *   showText will be blank at the width of the world divided by 2 and at the height of the 
         *    world divided by 2 plus 30
         *   startAnimation = true 
         * 
         */
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
        //returns startAnimation
        return startAnimation;
    }
}
