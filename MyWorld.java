import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        
        super(800, 600, 1); 
        addObject(new Man(), 400, 300);
        //addObject(new Woman(), 200, 200);
        addObject(new Butterfly(), 10, 590);
    }
}
