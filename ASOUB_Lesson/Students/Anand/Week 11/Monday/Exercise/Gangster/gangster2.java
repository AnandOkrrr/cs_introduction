import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gangster2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gangster2 extends Actor
{
    /**
     * Act - do whatever the gangster2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 10);
        }
        if (Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 10);
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX() -10, getY());
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX() +10, getY());
        }
    }    
}
