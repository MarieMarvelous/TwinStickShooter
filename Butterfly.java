import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Butterfly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Butterfly extends Bug{
    public int giveDamage(){
        return 2;
    }
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
