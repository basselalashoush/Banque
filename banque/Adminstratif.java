/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banque;

import java.util.Date;
import java.util.List;

/**
 *
 * @author basse
 */
public class Adminstratif extends Employe {

    private int idAdminstratif;
    private String fonction;

    public int getIdAdminstratif() {
        return idAdminstratif;
    }
    public void setIdAdminstratif(int idAdminstratif) {
        this.idAdminstratif = idAdminstratif;
    }
    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public Adminstratif(int idAdminstratif,String nom, String prenom, double salaireBase,
            Service unService, Date dateEmbauche) {
        this.setIdAdminstratif(idAdminstratif);
        super.setNom(nom);
        super.setPrenom(prenom);
        super.setSalaireBase(salaireBase);
        super.setUnService(unService);
        super.setDateEmbauche(dateEmbauche);
        
    }

    public Adminstratif(String fonction) {
        this.setFonction(fonction);
    }
/**
 * salaire de base + prime du service.
 * @param uneBanque
 * @return 
 */
    @Override
    public double CalculeSalaire() {
     
        double salaireAdmin = 0;
     
            salaireAdmin = this.getSalaireBase() + this.getUnService().getPrime();
      
        return salaireAdmin;
    }

}
