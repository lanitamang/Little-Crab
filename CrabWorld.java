import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,187,247);
        Worm worm = new Worm();
        addObject(worm,184,81);
        Worm worm2 = new Worm();
        addObject(worm2,418,71);
        Worm worm3 = new Worm();
        addObject(worm3,318,356);
        Worm worm4 = new Worm();
        addObject(worm4,502,247);
        Worm worm5 = new Worm();
        addObject(worm5,464,460);
        Worm worm6 = new Worm();
        addObject(worm6,97,440);
        Worm worm7 = new Worm();
        addObject(worm7,363,186);
        Worm worm8 = new Worm();
        addObject(worm8,288,497);
        Lobster lobster = new Lobster();
        addObject(lobster,105,66);
        Lobster lobster2 = new Lobster();
        addObject(lobster2,242,497);
    }
}