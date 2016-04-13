/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nezdames.baseDeDonnee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author julien
 */
public class Connexion {
    private String url;
    private String user;
    private String passwd;
    Connection conn                 = null;
    public Connexion(){         
        this.url                            = "jdbc:mysql://localhost:3306/nezdames";;
        this.user                           = "root";
        this.passwd                         = "zouzou93";
        try {          
            Class.forName("com.mysql.jdbc.Driver");
            conn                            = DriverManager.getConnection(this.url, this.user, this.passwd);
            
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    //Fonction renvoyant si l'utilisateur existe et s'il est admin en fonction de son id et de son mdp
    public boolean[] authentification(String id, String mdp){
        boolean resultatAuthentification[]= new boolean[2];
        resultatAuthentification[0]=false;
        resultatAuthentification[1]=false;
        try {
            Statement state                 = conn.createStatement();
            ResultSet result                = state.executeQuery("SELECT * FROM utilisateurs");       
            while (result.next()){
                if(id.compareTo(result.getString("identifiant"))==0 && mdp.compareTo(result.getString("mot_de_passe"))==0) {
                    resultatAuthentification[0]=true;
                    if(result.getInt("admin") == 1 )
                    {
                        resultatAuthentification[1] = true;
                    }
                    break;
                }
            }
        result.close();
        state.close();
        }catch (Exception e) {
            e.printStackTrace();
        }            
        return resultatAuthentification;
    }
    public void addUtilisateur(int id,String login,String mdp){
        try {
            String query = "INSERT INTO utilisateurs (`id_intermittent`,`identifiant`,`mot_de_passe`,`admin`) VALUES ("+ id +",'"+ login +"','"+ mdp +"',0)";
            Statement state                 = conn.createStatement();
            state.executeUpdate(query);                 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void setMotDePasse(String mdp,int id){
        try {
            String query = "UPDATE `utilisateurs` SET `mot_de_passe` ='"+ mdp +"' WHERE `id_intermittent` ="+id;
            Statement state                 = conn.createStatement();
            state.executeUpdate(query);                 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}