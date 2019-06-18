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
public class Service {

    private String libelle;
    private double prime;
    
    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public double getPrime() {
        return prime;
    }
    public void setPrime(double prime) {
        this.prime = prime;
    }
    public Service(){
        
    }
      public Service(String libelle,double prime){
        this.setLibelle(libelle);
        this.setPrime(prime);
    }

    
}
