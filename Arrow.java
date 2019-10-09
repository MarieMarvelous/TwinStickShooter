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
    
    public Arrow(int angle) {
        int adaptedAngle = angle;
        this.angle = adaptedAngle;
        setRotation(adaptedAngle);
    }
    
    public Arrow(Direction dir) {
        this.dir = dir;
        switch(dir) {
            case NORTH:
                this.angle = 90;
                setRotation(90);
                break;
            case EAST:
                this.angle = 180;
                setRotation(180);
                break;
            case SOUTH:
                this.angle = 270;
                setRotation(270);
                break;
            case WEST:
                this.angle = 0;
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
