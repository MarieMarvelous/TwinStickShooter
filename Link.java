import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Link here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Link extends Characters{
    public Link(){
        super(100);
        GreenfootImage image =getImage();
        image.scale(30, 40);
        setImage(image);
    }
    
    public void act(){        
        super.movement("left", "right", "up", "down");
        super.checkCollision();
    }
}
