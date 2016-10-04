package test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import controller.Feu;
import controller.FeuUtils;
import controller.Intersection;
/**
 * Classe qui teste les methodes la classe intersection
 * @author caup2301
 * @version 1.0
 */
public class IntersectionTest
{
    Intersection intersection;
    Feu[] feux;
    @Before
    public void setup()
    {
        //Jeu de test
    }
    
    @Test
    public void changeFeuxTest()
    {
        //Deprecate à changer
        assertEquals(intersection.changeFeux(), feux);
    }
    
    @Test
    public void maintenanceTest()
    {
        assertEquals(intersection.maintenance(), true);
    }

}
