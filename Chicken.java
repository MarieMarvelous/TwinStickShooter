import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Bug{
    public Chicken(){
        GreenfootImage image = getImage();
        image.scale(28, 32);
        setImage(image);
    }

    
    public int giveDamage(){
        return 2;
    }
    public void act(){
        super.act();
        move(Greenfoot.getRandomNumber(5));
        if(Greenfoot.getRandomNumber(10) <=4){
            turn(-10);
        }
        if(Greenfoot.getRandomNumber(10) >4){
            turn(10);
        }
    }    
}
