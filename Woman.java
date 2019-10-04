import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Woman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Woman extends Characters{
    public Woman(){
        super(100);
    }
    
    public void act(){
        super.movement("a", "d", "w", "s");   
        super.checkCollision();
    }
}
