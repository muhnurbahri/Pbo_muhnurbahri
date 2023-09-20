import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,46,17);
        roti roti = new roti();
        addObject(roti,393,102);
        roti roti2 = new roti();
        addObject(roti2,127,120);
        roti roti3 = new roti();
        addObject(roti3,276,202);
        roti roti4 = new roti();
        addObject(roti4,413,268);
        roti roti5 = new roti();
        addObject(roti5,134,282);
        semut semut = new semut();
        addObject(semut,273,336);
    }
}
