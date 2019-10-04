import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Man here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Man extends Characters{
    public Man(){
        super(100);
    }
    
    public void act(){        
        super.movement("left", "right", "up", "down");
        super.checkCollision();
    }
}
