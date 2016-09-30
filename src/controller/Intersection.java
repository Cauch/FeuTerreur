package controller;

import java.util.Timer;

/**
 * Class qui manipule les quatres feux
 * @author caup2301
 * @version 1.0.0
 */
public class Intersection
{
    private static final int NB_FEUX = 4;
    private Feu[] feux;
    private Timer chrono;

    /**
     * Constructeur de l'intesection
     */
    public Intersection() 
    {
        // voir comment le chrono fonctionne peut-être en prendre un autre.
        this.chrono = new Timer();
        this.feux = new Feu[NB_FEUX];
    }
    
    /**
     * Constructeur de l'intesection
     */
    public Intersection(Feu[] feux) 
    {
        // voir comment le chrono fonctionne peut-être en prendre un autre.
        this.chrono = new Timer();
        this.feux = feux;
    }
    
    public Feu[] getFeux()
    {
        return this.feux;
    }

    public void setFeux(Feu[] feux)
    {
        this.feux = feux;
    }
    
    /**
     * Change la couleur des feux
     * @return retourne la nouvelle couleurs des feux
     */
    public Feu[] changeFeux(){
        return this.feux;
    }
    
    public boolean maintenance(){
        return false;
    }

}
