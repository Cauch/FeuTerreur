package test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import controller.FeuUtils;
import exception.NombreNegatifException;

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
    public void estPremierNonPremierTest() throws NombreNegatifException
    {
        assertEquals(FeuUtils.estPremier(6), false);
    }
    
    @Test
    public void estPremierNombre0Test() throws NombreNegatifException
    {
        assertEquals(FeuUtils.estPremier(0), false);
    }
    
    @Test
    public void estPremierNombre1Test() throws NombreNegatifException
    {
        assertEquals(FeuUtils.estPremier(1), false);
    }
    
    @Test
    public void estPremierTest() throws NombreNegatifException
    {
        assertEquals(FeuUtils.estPremier(73), true);
    }
    
    @Test
    public void estPremierTestTresGrand() throws NombreNegatifException
    {
        assertEquals(FeuUtils.estPremier(1000000087), true);
    }
    
    
    @Test(expected=NombreNegatifException.class)
    public void estPremierNombreNegatifExceptionTest() throws NombreNegatifException
    {
        FeuUtils.estPremier(-1);
    }
    
    @Test
    public void estPremierNombreDecimaleExceptionTest() throws NombreNegatifException
    {
        assertEquals(FeuUtils.estPremier(1), false);
    }
}
