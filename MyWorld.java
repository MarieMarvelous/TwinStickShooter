import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public MyWorld() {
        super(640, 360, 1);
        //super.setBackground(new GreenfootImage("", 0, Color.YELLOW, Color.WHITE));
        //super.repaint();

        addObject(new Man(), 400, 300);
        //addObject(new Woman(), 200, 200);
        addObject(new Butterfly(), 10, 340);
    }
}
