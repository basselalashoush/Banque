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
public class CompteEpargne extends Compte implements ICompteEpargne, ICompteCCEE {

    private Date dateCreation;
    private double tauxInterets;

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public double getTauxInterets() {
        return tauxInterets;
    }

    public void setTauxInterets(double tauxInterts) {
        this.tauxInterets = tauxInterts;
    }

    public CompteEpargne() {

    }

    public CompteEpargne(String numero, double solde, Date dateCreation, double tauxInterets) {
        super(numero, solde);
        this.setDateCreation(dateCreation);
        this.setTauxInterets(tauxInterets);
    }

    /**
     * ne peut pas avoir un solde inférieur au dépôt + les intérêts à la date du
     * jour.
     *
     * @param montant
     * @return
     */
    @Override
       public boolean Retirer(double montant) {
        boolean retirer = false;
        double solde = GetSolde();
        if ((solde ) >= montant) {
            setSolde((solde - montant));
            retirer = true;
        } else {
            System.out.println("opearation impossible");
        }
        return retirer;
    }

    /**
     * duree = l'instante du calcule - la date de criation.
     *
     * @return
     */
    @Override
    public double CalculeInterets() {
        double interets = 0.0;
        Date dateCalcul = new Date();
        int duree = Outils.getAnnee(dateCalcul) - Outils.getAnnee(getDateCreation());
        interets = super.getSolde() * getTauxInterets() * duree / 100;
        return interets;
    }

    /**
     * Calcule les intérêts
     *
     * @param annee Int : Année de départ des intérêts
     * @return
     */
    @Override
    public double CalculeInteretsAns(int annee) {
        double interets = 0;
        int duree = annee - Outils.getAnnee(getDateCreation());
        interets = super.getSolde() * getTauxInterets() * duree / 100;
        return interets;
    }

    /**
     * Le solde d'un compte épargne est égal au montant déposé + les intérêts à
     * la date du jour.
     *
     * @return
     */
    @Override
    public double GetSolde() {
        double solde = 0.0;
        solde = super.getSolde() + CalculeInterets();
        setSolde(solde);
        return solde;
    }
}
