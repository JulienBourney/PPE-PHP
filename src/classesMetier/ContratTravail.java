/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesMetier;

import java.util.ArrayList;

/**
 *
 * @author julien
 */
public class ContratTravail {
    private String numContratTravail;
    private String role;
    private int nombreHeures;
    private boolean edition;
    private ContratCession leContratCession;
    private Intermittent lIntermittent;
    private ArrayList<Representation> lesRepresentations;
    public ContratTravail(String numContratTravail, String role, int nombreHeures, ContratCession leContratCession, Intermittent lIntermittent) {
        this.numContratTravail = numContratTravail;
        this.role = role;
        this.nombreHeures = nombreHeures;
        this.edition = false;//l'indicateur d'édition est mis à FAUX
        this.leContratCession = leContratCession;
        this.lIntermittent = lIntermittent;
        lesRepresentations = new ArrayList<Representation>();
    }
    
    public void modifier(String numContratTravail,String role,int nombreHeures, Intermittent lIntermittent) {
        this.numContratTravail = numContratTravail;
        this.role = role;
        this.nombreHeures = nombreHeures;
        this.lIntermittent = lIntermittent;
        this.edition = false; //l'indicateur d'édition est mis à FAUX
    }
    
    public String getNumContratTravail() {
        return numContratTravail;
    }

    public void setNumContratTravail(String numContratTravail) {
        this.numContratTravail = numContratTravail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public boolean isEdition() {
        return edition;
    }

    public void setEdition(boolean edition) {
        this.edition = edition;
    }

    public ContratCession getLeContratCession() {
        return leContratCession;
    }

    public void setLeContratCession(ContratCession leContratCession) {
        this.leContratCession = leContratCession;
    }

    public Intermittent getlIntermittent() {
        return lIntermittent;
    }

    public void setlIntermittent(Intermittent lIntermitent) {
        this.lIntermittent = lIntermitent;
    }

    public ArrayList<Representation> getLesRepresentations() {
        return lesRepresentations;
    }

    public void setLesRepresentations(ArrayList<Representation> lesRepresentations) {
        this.lesRepresentations = lesRepresentations;
    }
    public void ajouterRepresentation(Representation representation){
        
    }
    
}
