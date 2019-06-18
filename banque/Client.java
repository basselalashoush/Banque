/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.*;

/**
 *
 * @author basse
 */
public class Client {

    //proprité
    private int idClient;
    private String nom;
    private String prenom;
    private List<CompteCourant> desCompteCourants;
    private List<CompteEpargne> desCompteEpargnes;

    //getter & setter
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

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

    public List<CompteCourant> getCompteCourants() {
        return desCompteCourants;
    }

    public void setCompteCourants(List<CompteCourant> desCompteCourants) {
        this.desCompteCourants = desCompteCourants;
    }

    public List<CompteEpargne> getCompteEpargnes() {
        return desCompteEpargnes;
    }

    public void setCompteEpargnes(List<CompteEpargne> desCompteEpargnes) {
        this.desCompteEpargnes = desCompteEpargnes;
    }
    //

    public Client(int idClient, String nom, String prenom) {
        this.setIdClient(idClient);
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setCompteCourants(new ArrayList<CompteCourant>());
        this.desCompteEpargnes = new ArrayList<CompteEpargne>();
    }

    public Client(String nom, String prenom, List<CompteCourant> desCompteCourants,
            List<CompteEpargne> desCompteEpargnes) {
        this.setNom(nom);
        this.setPrenom(prenom);
        this.setCompteCourants(desCompteCourants);
        this.setCompteEpargnes(desCompteEpargnes);
    }

    /**
     * Le patrimoine d'un client est égal à la somme de tous les soldes de ses
     * comptes
     *
     * @return
     */
    public double CalculePatrimoine() {
        double parimoineEpargne = 0.0, patrimoineCourant = 0.0, patrimoine = 0.0;
        List<CompteEpargne> desCompteEpargnes = getCompteEpargnes();
        for (CompteEpargne unCompteEpargne : desCompteEpargnes) {
            parimoineEpargne += unCompteEpargne.getSolde();
        }
        List<CompteCourant> desCompteCourants = getCompteCourants();
        for (CompteCourant unCompteCourant : desCompteCourants) {

            patrimoineCourant += unCompteCourant.getSolde();
        }
        patrimoine = patrimoineCourant + parimoineEpargne;
        return patrimoine;
    }
    public void AjouterCompteCourant(CompteCourant unCompteCourant) {
        if (this.desCompteCourants == null)
            this.desCompteCourants = new ArrayList<CompteCourant>();
        this.desCompteCourants.add(unCompteCourant);
    }

    public void AjouterCompteEpargne(CompteEpargne unCompteEpargne) {
        if(this.desCompteEpargnes==null)
            this.desCompteEpargnes=new ArrayList<CompteEpargne>();
        this.desCompteEpargnes.add(unCompteEpargne);
    }
    
}
