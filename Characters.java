import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor
{
    private static final double WALKING_SPEED = 10.0;
    /**
     * Act - do whatever the Characters wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    /*public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x, y);
        
       
    }*/
    public void movement(){
        //move();
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        
        if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+1);   
        }
        
    }
}


