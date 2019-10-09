import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.Point;

/**
 * Write a description of class Characters here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Characters extends Actor{
    public int health;
    public boolean canShootAgain;
    public int cooldown;
    public static int defaultCooldown;
    
    public Characters(int health){
        this.health=health;
        this.canShootAgain = true;
        this.defaultCooldown = 10;
        this.cooldown = this.defaultCooldown;
    }

    public void showColorText(String text, Color color){
        setImage(new GreenfootImage(text, 100, color, Color.BLACK));
    }

    public void act(){
        if (cooldown > 0) {
            cooldown--;
        } else {
            cooldown = this.defaultCooldown;
            canShootAgain = true;
        }
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

    /*public void shootArrow(Direction dir) { //For shooting in fixed directions
        if (canShootAgain) {
            getWorld().addObject(new Arrow(dir),this.getX(), this.getY());
            canShootAgain = false;
        }
    }*/
    
    public void shootArrow(int angle) {
        if (canShootAgain) {
            getWorld().addObject(new Arrow(angle), this.getX(), this.getY());
            canShootAgain = false;
        }
    }
    
    public void checkForShooting() {
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if (mouse != null && Greenfoot.getMouseInfo().getButton() == 1) {
            shootArrow(getMouseDirection(mouse));
        }
    }
    
    public int getMouseDirection(MouseInfo mouse) {
        double deltaX = mouse.getX() - this.getX();
        double deltaY = mouse.getY() - this.getY();
        
        return 90 - (int) (Math.atan2(deltaX, deltaY) * 57.3);
    }
    
    /**
     * Math magic incoming :)
     */
    public Direction getMouseDirectionRelativeToChar(MouseInfo mouse) {
        double atan2Value = Math.atan2(mouse.getX() - this.getX(), mouse.getY() - this.getY());
        if (atan2Value < 0) {
            if (atan2Value <= -2.3562) {
                return Direction.NORTH;
            } else {
                return Direction.WEST;
            }
        } else {
            if (atan2Value >= 0.7854) {
                return Direction.EAST;
            } else {
                return Direction.SOUTH;
            }
        }
    }
}

