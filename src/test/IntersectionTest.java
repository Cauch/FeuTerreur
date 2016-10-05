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
    Intersection intersectionNordSud;
    Intersection intersectionEstOuest;
    Intersection intersectionNordSudJaunes;
    Intersection intersectionEstOuestJaunes;
    Intersection intersectionMaintenance;
    
    Feu[] feux;
    @Before
    public void setup()
    {
        //Jeu de test
        Feu feux[] = new Feu[4];
        
        feux[0] = Feu.VERT;
        feux[1] = Feu.ROUGE;
        feux[2] = Feu.VERT;
        feux[3] = Feu.ROUGE;
        
        intersectionNordSud = new Intersection(feux);
        
        feux[0] = Feu.ROUGE;
        feux[1] = Feu.VERT;
        feux[2] = Feu.ROUGE;
        feux[3] = Feu.VERT;
        intersectionEstOuest = new Intersection(feux);
        
        feux[0] = Feu.JAUNE;
        feux[1] = Feu.ROUGE;
        feux[2] = Feu.JAUNE;
        feux[3] = Feu.ROUGE;
        intersectionNordSudJaunes = new Intersection(feux);
        
        feux[0] = Feu.ROUGE;
        feux[1] = Feu.JAUNE;
        feux[2] = Feu.ROUGE;
        feux[3] = Feu.JAUNE;
        intersectionEstOuestJaunes = new Intersection(feux);
        
        feux[0] = Feu.ROUGE;
        feux[1] = Feu.ROUGE;
        feux[2] = Feu.ROUGE;
        feux[3] = Feu.ROUGE;
        intersectionMaintenance = new Intersection(feux);  
    }
    
    @Test
    public void changeFeuxTest()
    {
    }
    
    @Test
    public void maintenanceTest()
    {
    }

}
