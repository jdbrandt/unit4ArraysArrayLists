

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void test()
    {
        //Tests twice to avoid luck
        for (int a = 0; a < 2; a++)
        {
            //Sets monsters location in [row, col] format
            int[] monsterLocation = new int[] {(int)Math.random()*100, (int)Math.random()*100};
            
            //Radar initialization
            Radar r = new Radar(100, 100);
            r.setNoiseFraction(0.10);
            r.setMonsterLocation(monsterLocation[0], monsterLocation[1]);
            
            //Builds the accumulator
            for (int i = 0; i < 5; i++)
            {
                r.scan();
            }
            
            //Checks that the monster exists
            assertEquals(r.isDetected(monsterLocation[0], monsterLocation[1]), true);
            
            
            //Checks that accumulator correctly detects monster
            //Future proofs against added feature of false negatives by checking for the largest
            int largestAccumRow = 0;
            int largestAccumCol = 0;
            int largestAccumVal = 0;
            
            for (int i = 0; i < r.getNumRows(); i++)
            {
                for (int j = 0; j < r.getNumCols(); j++)
                {
                    if (r.getAccumulatedDetection(i,j)>largestAccumVal)
                    {
                        //Gets the largest row and col values in accumulator
                        largestAccumRow = i;
                        largestAccumCol = j;
                        largestAccumVal = r.getAccumulatedDetection(i,j);
                    }
                }
            }
            
            //Checks that accumulator matches up with monster location correctly
            assertEquals(monsterLocation[0], largestAccumRow);
            assertEquals(monsterLocation[1], largestAccumCol);
        }
        
    }
}

        
