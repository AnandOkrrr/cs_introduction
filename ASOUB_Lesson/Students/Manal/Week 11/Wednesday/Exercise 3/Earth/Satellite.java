import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Satellite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Satellite extends Actor
{
    /**
     * Act - do whatever the Satellite wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Satellite() 
    {        
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 20, image.getHeight() / 20);
        setImage(image);
    }    
}
