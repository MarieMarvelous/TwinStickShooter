import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Arrow extends Projectile
{
    private static final int SPEED = 15;
    
    public Arrow(Direction dir) {
        this.dir = dir;
        switch(dir) {
            case NORTH:
                setRotation(90);
                break;
            case EAST:
                setRotation(180);
                break;
            case SOUTH:
                setRotation(270);
                break;
            case WEST:
                break;
            default:
                break;
        }
    }
    
    public int getSpeed() {
        return SPEED;
    }
    
    public void act() 
    {
        super.act();
    }    
}
