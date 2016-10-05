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
    private boolean estMaintenance;

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
        this.estMaintenance = false;
    }

    public Intersection(Feu[] feux, boolean estMaintenance) 
    {
        // voir comment le chrono fonctionne peut-être en prendre un autre.
        this.chrono = new Timer();
        this.feux = feux;
        this.estMaintenance = estMaintenance;
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
    public Feu[] changeFeuxAJaunes(){
        for(int i = 0; i < this.feux.length; i++){
            if(feux[i].equals(Feu.VERT)){
                feux[i] = Feu.JAUNE;
            }
        }
        return this.feux;
    }
    
    public Feu[] inverseFeux(){
        for(int i = 0; i < this.feux.length; i++){
            if(feux[i].equals(Feu.JAUNE)){
                feux[i] = Feu.ROUGE;
            }
            if(feux[i].equals(Feu.ROUGE)){
                feux[i] = Feu.VERT;
            }
        }
        return this.feux;
    }
    
    public Intersection maintenance(){
        for(int i = 0; i < this.feux.length; i++){
                feux[i] = Feu.ROUGE;
        }
        estMaintenance = true;
        return this;
    }
    
    public Intersection retourDeMaintenance(){
        feux[0] = Feu.VERT;
        feux[2] = Feu.VERT;
        estMaintenance = false;
        return this;
    }

}
