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
public class Banque {

    //proprité
    private String raisonSocial;
    private List<Client> desClients;
    private List<Commercial> Commerciaux;
    private List<Adminstratif> desAdminstratifs;

    //getter & setter
    public String getRaisonSosial() {
        return raisonSocial;
    }

    public void setRaisonSosial(String raisonSosial) {
        this.raisonSocial = raisonSosial;
    }

    public List<Client> getClients() {
        return desClients;
    }

    public void setClients(List<Client> desClients) {
        this.desClients = desClients;
    }

    public List<Commercial> getCommerciaux() {
        return Commerciaux;
    }

    public void setCommercials(List<Commercial> desCommercials) {
        this.Commerciaux = desCommercials;
    }

    public List<Adminstratif> getAdminstratifs() {
        return desAdminstratifs;
    }

    public void setAdministratifs(List<Adminstratif> desAdminstratifs) {
        this.desAdminstratifs = desAdminstratifs;
    }

    //
    public Banque(String raisonSocial) {

    }

    public Banque(String raisonSocial, List<Client> desClients,
            List<Commercial> desCommercials, List<Adminstratif> desAdminstratifs) {
        this.setRaisonSosial(raisonSocial);
        this.setClients(desClients);
        this.setCommercials(desCommercials);
        this.setAdministratifs(desAdminstratifs);
    }

    public double CalculeCA() {
     List<Client>desClients = getClients();
     double chiffreDaffaire=0;
      for(int i=0;i<desClients.size();i++){
          chiffreDaffaire +=desClients.get(i).CalculePatrimoine();
      }
      return chiffreDaffaire;
    }

}
