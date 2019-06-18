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
public class Commercial extends Employe {

    private int idCommercial;
    private double tauxCommission;
    private List<Compte> desComptes;

    public int getIdCommercial() {
        return idCommercial;
    }

    public void setIdCommercial(int idCommercial) {
        this.idCommercial = idCommercial;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    public List<Compte> getComptes() {
        return desComptes;
    }

    public void setComptes(List<Compte> desComptes) {
        this.desComptes = desComptes;
    }

    public Commercial() {

    }

    /**
     *
     * @param nom
     * @param prenom
     * @param salaireBase
     * @param unService
     * @param dateEmbauche
     * @param tauxCommission
     */
    public Commercial(int idCommercial, String nom, String prenom, double salaireBase,
            Service unService, Date dateEmbauche, double tauxCommission) {
        this.setIdCommercial(idCommercial);
        super.setNom(nom);
        super.setPrenom(prenom);
        super.setSalaireBase(salaireBase);
        super.setUnService(unService);
        super.setDateEmbauche(dateEmbauche);
        this.setTauxCommission(tauxCommission);
        this.setComptes(new ArrayList<Compte>());
     
        
    }

    /**
     * salaire de base + prime du service + commission.
     *
     * @param uneBanque
     * @return
     */
    @Override
    public double CalculeSalaire() {
      double salaireCommercial=0.0;
      salaireCommercial=this.getSalaireBase()+this.getUnService().getPrime()+CalculeComission();
      return salaireCommercial;
    }

    /**
     * montant des soldes des comptes gérés * taux de commission / 100.
     *
     * @param uneBanque
     * @return
     */
    public double CalculeComission() {
        double comission = 0;
        if (this.desComptes != null) {
            for (Compte unCompte : desComptes) {
                comission = unCompte.getSolde() * getTauxCommission() / 100;
            }
        }
        return comission;
    }

    public void AjouterComptes(Compte unCompte) {
        List<Compte> desComptes = getComptes();
        desComptes.add(unCompte);
    }

}
