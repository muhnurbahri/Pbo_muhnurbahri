import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class semut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class semut extends Actor
{
    /**
     * Act - do whatever the semut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         {
        moveAndTrun();
        eat();
        }
    }
    
    public void moveAndTrun()
    {
        move(2);
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
    
    public void eat()
    {
        Actor roti;
        roti = getOneObjectAtOffset(0, 0, roti.class);
        if(roti != null)
        {
            World world;
            world = getWorld();
            world.removeObject(roti);
            addScore();
        }
    }
    
     public void addScore()
    {
        if(!getWorld().getObjects(Counter.class).isEmpty())
        {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).add(1);
        }
    }
}
