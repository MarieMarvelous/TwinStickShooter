import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld(){
        super(1600, 900, 1);
        addObject(new Link(), 867, 707);
        addObject(new Chicken(), 17, 841);
        addObject(new Chicken(), 17, 817);
        addObject(new Chicken(), 17, 793);
    }
}
