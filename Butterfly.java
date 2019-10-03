import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butterfly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butterfly extends Bug
{
    /**
     * Act - do whatever the Butterfly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        move(Greenfoot.getRandomNumber(5));
        if(Greenfoot.getRandomNumber(10) <=4){
            turn(-10);
        }
        if(Greenfoot.getRandomNumber(10) >4){
            turn(10);
        }
        
    }    
}
