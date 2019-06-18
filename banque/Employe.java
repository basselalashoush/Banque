/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.*;
import utilitaire.Outils;

/**
 *
 * @author basse
 */
public abstract class Employe {

    private String nom;
    private String prenom;
    private double salaireBase;
    private Date dateEmbauche;
    private Service unService;
    //getter & setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaireBase() {
        return salaireBase;
    }

    public void setSalaireBase(double salaireBase) {
        this.salaireBase = salaireBase;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public Service getUnService() {
        return unService;
    }
    public void setUnService(Service unService) {
        this.unService = unService;
    }

    public Employe() {

    }

    public Employe(String nom, String prenom, double salaireBase,
            Date dateEmbauche,Service unService) {
        
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setSalaireBase(salaireBase);
        this.setDateEmbauche(dateEmbauche);
        this.setUnService(unService);
    }

    public abstract double CalculeSalaire();

    public int anciennete(){
         Date dateCalcul = new Date();
         int anciennete = Outils.getAnnee(dateCalcul) - Outils.getAnnee(getDateEmbauche());
         return anciennete;
    }
}
