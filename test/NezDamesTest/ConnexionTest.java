/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NezDamesTest;

import junit.framework.TestCase;
import nezdames.baseDeDonnee.Connexion;

/**
 *
 * @author julien
 */

//classe de test pour la classe Connexion

public class ConnexionTest extends TestCase {
    private Connexion connexion;
    public ConnexionTest(String testName) {
        super(testName);
    }
    public void setUp(){
       connexion = new Connexion(); 
    }
    //test de la fonction authentification
    public void testAuthentification(){
    
        
        boolean result[] = new boolean [2];
        //test de connexion admin
        result = connexion.authentification("test", "test");
        assertTrue(result[0]);
        assertTrue(result[1]);
        //test identifiant vide/invalide
        result = connexion.authentification("","");
        assertFalse(result[0]);
        assertFalse(result[1]);
       
        
        //test utilisateur normal
        result = connexion.authentification("aaaa","0000");
        assertTrue(result[0]);
        assertFalse(result[1]);
    }
    //test de la fonction addUtilisateur
    public void testAddUtilisateur(){
        boolean result[] = new boolean [2];
        connexion.addUtilisateur(81, "toto", "tata");
        result = connexion.authentification("toto", "tata");
        assertTrue(result[0]);     
        assertFalse(result[1]);
    }
    //test de la fonction setMotDePasse
    public void testSetMotDePasse(){
        boolean result[] = new boolean [2];
        connexion.addUtilisateur(52, "titi", "tata");
        result = connexion.authentification("titi", "tata");
        assertTrue(result[0]);
        connexion.setMotDePasse("tutu",52);
        result = connexion.authentification("titi","tutu");
        assertTrue(result[0]);
        
    }
}
