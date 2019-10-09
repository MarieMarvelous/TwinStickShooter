import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Projectile extends Entity
{
    public abstract int getSpeed();
    
    public Direction dir;
    public int angle;
    /**
     * Act - do whatever the Projectile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(getSpeed());
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}
