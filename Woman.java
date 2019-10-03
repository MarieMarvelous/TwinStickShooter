import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Woman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Woman extends Characters
{
    /**
     * Act - do whatever the Woman wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
    super.movement("a", "d", "w", "s");   
    }
}
