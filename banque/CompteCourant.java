/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

/**
 *
 * @author basse
 */
public class CompteCourant extends Compte implements ICompteCCEE, ICompteCourant {

    private double decouvert;

    public double getDecouvert() {
        return decouvert;
    }

    public void setDecouvert(double decouvert) {
        if (decouvert >= 0) {
            decouvert = decouvert * -1;
        }
        this.decouvert = decouvert;
    }

    public CompteCourant() {

    }

    public CompteCourant(String numero, double solde, double decouvert) {
        super(numero, solde);
        this.setDecouvert(decouvert);
    }

    /**
     * ne peut pas avoir un solde inférieur à son découvert
     *
     * @param montant
     * @return
     */
    @Override
    public boolean Retirer(double montant) {
        boolean retirer = false;
        double solde = getSolde();
        if ((solde - getDecouvert()) >= montant) {
            setSolde((solde - montant));
            retirer = true;
        } else {
            System.out.println("opearation impossible");
        }
        return retirer;
    }

    @Override
    public boolean virer(double montant) {
        Compte unCompte = new Compte();              
        boolean virement = Retirer(montant);
        if (virement) {
            unCompte.Verser(montant);
        }
        return virement;

    }

}
