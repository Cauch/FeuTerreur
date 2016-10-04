package test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.FeuUtils;

/**
 * Classe qui teste les methodes de FeuUtils
 * @author caup2301
 * @version 1.0
 */
public class FeuUtilsTest
{
    @Before
    public void setup()
    {
        //Jeu de test
    }
    
    @Test
    public void estPremierNonPremierTest()
    {
        assertEquals(FeuUtils.estPremier(6), false);
    }
    
    @Test
    public void estPremierNombre1Test()
    {
        assertEquals(FeuUtils.estPremier(1), false);
    }
    
    @Test
    public void estPremierTest()
    {
        assertEquals(FeuUtils.estPremier(73), true);
    }
    
    @Test
    public void estPremierNombreNegatifExceptionTest()
    {
        assertEquals(FeuUtils.estPremier(1), false);
    }
    
    @Test
    public void estPremierNombreDecimaleExceptionTest()
    {
        assertEquals(FeuUtils.estPremier(1), false);
    }
}
