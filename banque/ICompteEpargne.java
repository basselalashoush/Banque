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
public interface ICompteEpargne {
    
    public double CalculeInterets();
   public double CalculeInteretsAns(int annee);
    public double GetSolde();
}
