import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        //checkCollision();

    }    

    public void movement(String left, String right, String up, String down){
        if(Greenfoot.isKeyDown(left)){
            move(-1);
        }

        if(Greenfoot.isKeyDown(right)){
            move(1);
        }
        if(Greenfoot.isKeyDown(up)){
            setLocation(getX(), getY()-1);
        }
        if(Greenfoot.isKeyDown(down)){
            setLocation(getX(), getY()+1);   
        }
    }

    public void checkCollision(){
        if(isTouching(Butterfly.class)) {
            this.health--;
        }
        String leben = String.valueOf(health);
        //showColorText(leben, Color.YELLOW);
        getWorld().showText(leben, 100, 100);
        if(health == 0){
            Greenfoot.stop();
            getWorld().showText("Game Over", 320, 180);
        }
    }
}

