import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor{
    public int health;
    
    public Characters(int health){
        this.health=health;
    }

    public void showColorText(String text, Color color){
        setImage(new GreenfootImage(text, 100, color, Color.BLACK));
    }

    public void act(){

    }    

    public void movement(String left, String right, String up, String down, int speed){
        if(Greenfoot.isKeyDown(left)){
            move(-speed);
        }

        if(Greenfoot.isKeyDown(right)){
            move(speed);
        }
        if(Greenfoot.isKeyDown(up)){
            setLocation(getX(), getY()-speed);
        }
        if(Greenfoot.isKeyDown(down)){
            setLocation(getX(), getY()+speed);   
        }
        checkForShooting();
    }

    public void checkCollision(){
        if(isTouching(Bug.class)){
            List<Bug> listDamagingBugs=getIntersectingObjects(Bug.class);
            for(Bug bug : listDamagingBugs){
                health-=bug.giveDamage();
            }
        }
        String leben = String.valueOf(health);
        //showColorText(leben, Color.YELLOW);
        getWorld().showText(leben, 100, 100);
        if(health == 0){
            Greenfoot.stop();
            getWorld().showText("Game Over", 320, 180);
        }
    }
    
    public void shootArrow(Direction dir) {
        getWorld().addObject(new Arrow(),this.getX(), this.getY());
    }
    
    public void checkForShooting() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null && Greenfoot.getMouseInfo().getButton() == 1) {
            shootArrow(getMouseDirectionRelativeToChar());
        }
    }
    
    public Direction getMouseDirectionRelativeToChar() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        return Direction.NORTH;
    }
    
    private enum Direction {
        NORTH,
        EAST,
        SOUTH,
        WEST;
    }
}

