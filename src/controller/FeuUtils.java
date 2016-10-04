package controller;

import exception.NombreNegatifException;

/**
 * Classe qui contient les fonctions utilitaires
 * @author caup2301
 * @version 1.0
 */
public class FeuUtils
{
    public static boolean estPremier(int  x) throws NombreNegatifException{
        if(x < 0){
            throw new NombreNegatifException("Le nombre " + x + " est negatif. Un nombre positif est attendu");
        } else if(x < 2){
            return false;
        }
        
        // Trouve la racine puis arrondi vers le bas.
        int racineX = (int) Math.sqrt((double)x);
        
        for(int i = 2; i <= racineX; i++) {
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }
}
