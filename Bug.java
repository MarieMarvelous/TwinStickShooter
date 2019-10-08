import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Bug extends Entity{
    public abstract int giveDamage();
    public void act(){
    }    
    
    public void checkForArrowCollision() {
        if (isTouching(Arrow.class)) {
            getWorld().removeObjects(getIntersectingObjects(Arrow.class));
            getWorld().removeObject(this);
        }
    }
}
