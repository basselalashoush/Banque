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
public class Compte implements ICompte{

   private String numero;
    private double solde;
    
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }
    public Compte(){
        
    }
    public Compte(String numero,double solde){
        this.setNumero(numero);
        this.setSolde(solde);
    }
    @Override
    public void Verser(double montant){
              if(montant>0)
    setSolde(getSolde()+montant); 
    }
}
