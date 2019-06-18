/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp.interfaces.et.classes.abstraites;

import banque.*;
import java.util.*;

import utilitaire.Clavier;
import utilitaire.Outils;

/**
 *
 * @author basse
 */
public class TPInterfacesEtClassesAbstraites {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banque uneBanque = new Banque("Lyon", new ArrayList<Client>(), new ArrayList<Commercial>(), new ArrayList<Adminstratif>());
        //creer un Adminstratif
        List<Adminstratif> desAdminstratifs = uneBanque.getAdminstratifs();
        Service Adminstratif = new Service("Adminstratif", 300.0);
        Date dateEmbaucheDYLAN = Outils.stringToDate("09/09/2012");
        Adminstratif DYLAN = new Adminstratif(1, "DYLAN", "Bob", 1700.0, Adminstratif, dateEmbaucheDYLAN);
        desAdminstratifs.add(DYLAN);
        for (Adminstratif unAdminstratif : desAdminstratifs) {
            System.out.println("nom employe: " + unAdminstratif.getNom() + " prenom employe: " + unAdminstratif.getPrenom()
                    + " salair de base: " + unAdminstratif.getSalaireBase() + " service: "
                    + unAdminstratif.getUnService().getLibelle() + " date d'embauche: " + unAdminstratif.getDateEmbauche());
        }
        // Creer 2 commerciaux
        List<Commercial> commerciaux = uneBanque.getCommerciaux();
        Service Commercial = new Service("Commercial", 100.0);
        Date dateEmbaucheADAMS = Outils.stringToDate("14/11/2014");
        Commercial ADAMS = new Commercial(2, "ADAMS", "Bryan", 1300.0, Commercial, dateEmbaucheADAMS, 3.0);
        Date dateEmbaucheMOORE = Outils.stringToDate("10/05/2013");
        Commercial MOORE = new Commercial(3, "MOORE", "Gary", 1500.0, Commercial, dateEmbaucheMOORE, 3.0);
        commerciaux.add(ADAMS);
        commerciaux.add(MOORE);
        for (Commercial unCommercial : commerciaux) {
            System.out.println("nom employe: " + unCommercial.getNom() + " prenom employe: " + unCommercial.getPrenom()
                    + " salaire de base: " + unCommercial.getSalaireBase() + " service: "
                    + unCommercial.getUnService().getLibelle() + " date d'embauche: "
                    + unCommercial.getDateEmbauche() + " taux commission: " + unCommercial.getTauxCommission());
        }
        // Creer 6 clients
        List<Client> desClients = uneBanque.getClients();
        Client DANIEL = new Client(10, "DANIEL", "Jack");
        Client MARLY = new Client(11, "MARLY", "Bob");
        Client BOIRE = new Client(12, "BOIRE", "Olivier");
        Client PETIT = new Client(13, "PETIT", "christine");
        Client SLIVAK = new Client(14, "SLIVAK", "Laure");
        Client MANGUIE = new Client(15, "MANGUIE", "Anne");
        desClients.add(DANIEL);
        desClients.add(MARLY);
        desClients.add(BOIRE);
        desClients.add(PETIT);
        desClients.add(SLIVAK);
        desClients.add(MANGUIE);
        for (Client unClient : desClients) {
            System.out.println("id  client: " + unClient.getIdClient() + " nom client: "
                    + unClient.getNom() + " prenom client: " + unClient.getPrenom());
        }
        // Creer 7 comptes courants

        List<CompteCourant> desCompteCourants = new ArrayList<CompteCourant>();
        CompteCourant CompteCourant1 = new CompteCourant("00001", 2000.0, 200.0);
        CompteCourant CompteCourant2 = new CompteCourant("00002", 3000.0, 200.0);
        CompteCourant CompteCourant3 = new CompteCourant("00003", 2500.0, 150.0);
        CompteCourant CompteCourant4 = new CompteCourant("00004", 6000.0, 300.0);
        CompteCourant CompteCourant5 = new CompteCourant("00005", 5400.0, 250.0);
        CompteCourant CompteCourant6 = new CompteCourant("00006", 2900.0, 200.0);
        CompteCourant CompteCourant7 = new CompteCourant("00007", 1750.0, 100.0);
        desCompteCourants.add(CompteCourant1);
        desCompteCourants.add(CompteCourant2);
        desCompteCourants.add(CompteCourant3);
        desCompteCourants.add(CompteCourant4);
        desCompteCourants.add(CompteCourant5);
        desCompteCourants.add(CompteCourant6);
        desCompteCourants.add(CompteCourant7);
        for (CompteCourant unCompteCourant : desCompteCourants) {
            System.out.println("numero de compte: " + unCompteCourant.getNumero()
                    + " solde: " + unCompteCourant.getSolde() + " decouvert: "
                    + unCompteCourant.getDecouvert());

        }
        // creer 5 comptes Epargnes
        List<CompteEpargne> desCompteEpargnes = new ArrayList<CompteEpargne>();
        Date dateCreation1 = Outils.stringToDate("04/10/2014");
        CompteEpargne CompteEpargne1 = new CompteEpargne("11111", 5300.0, dateCreation1, 6.0);
        Date dateCreation2 = Outils.stringToDate("12/11/2015");
        CompteEpargne CompteEpargne2 = new CompteEpargne("11112", 3900.0, dateCreation2, 5.0);
        Date dateCreation3 = Outils.stringToDate("09/05/2009");
        CompteEpargne CompteEpargne3 = new CompteEpargne("11113", 4200.0, dateCreation3, 3.0);
        Date dateCreation4 = Outils.stringToDate("11/03/2010");
        CompteEpargne CompteEpargne4 = new CompteEpargne("11114", 10250.0, dateCreation4, 4.0);
        Date dateCreation5 = Outils.stringToDate("02/12/2013");
        CompteEpargne CompteEpargne5 = new CompteEpargne("11115", 1700.0, dateCreation5, 6.0);
        desCompteEpargnes.add(CompteEpargne1);
        desCompteEpargnes.add(CompteEpargne2);
        desCompteEpargnes.add(CompteEpargne3);
        desCompteEpargnes.add(CompteEpargne4);
        desCompteEpargnes.add(CompteEpargne5);
        for (CompteEpargne unCompteEpargne : desCompteEpargnes) {
            System.out.println("numero de compte: " + unCompteEpargne.getNumero() + " solde: "
                    + unCompteEpargne.getSolde() + " Date de creation: " + unCompteEpargne.getDateCreation()
                    + " taux des interet: " + unCompteEpargne.getTauxInterets());
        }

        //effacter les compte par deu Comerciaux
        ADAMS.AjouterComptes(CompteCourant1);
        ADAMS.AjouterComptes(CompteCourant2);
        ADAMS.AjouterComptes(CompteCourant3);
        ADAMS.AjouterComptes(CompteCourant4);
        ADAMS.AjouterComptes(CompteEpargne1);
        ADAMS.AjouterComptes(CompteEpargne2);
        ADAMS.AjouterComptes(CompteEpargne3);
        MOORE.AjouterComptes(CompteCourant5);
        MOORE.AjouterComptes(CompteCourant6);
        MOORE.AjouterComptes(CompteCourant7);
        MOORE.AjouterComptes(CompteEpargne4);
        MOORE.AjouterComptes(CompteEpargne5);

        //effacter les comptes par 6 clients
        DANIEL.AjouterCompteCourant(CompteCourant1);
        DANIEL.AjouterCompteCourant(CompteCourant2);
        DANIEL.AjouterCompteEpargne(CompteEpargne1);
        MARLY.AjouterCompteCourant(CompteCourant3);
        MARLY.AjouterCompteEpargne(CompteEpargne2);
        BOIRE.AjouterCompteCourant(CompteCourant4);
        BOIRE.AjouterCompteEpargne(CompteEpargne3);
        PETIT.AjouterCompteCourant(CompteCourant5);
        PETIT.AjouterCompteEpargne(CompteEpargne4);
        SLIVAK.AjouterCompteCourant(CompteCourant6);
        SLIVAK.AjouterCompteEpargne(CompteEpargne5);
        MANGUIE.AjouterCompteCourant(CompteCourant7);

        int choix = menu();
        while (choix != 0) {
            switch (choix) {
                case 1:
                    AffecherSalairCommerciaux(uneBanque);
                    break;
                case 2:
                    AffecherSalaireAdminstratifs(uneBanque);
                    break;
                case 3:
                    afficheAdminstratif(uneBanque);
                    break;
                case 4:
                    affichercommercial(uneBanque);
                    break;
                case 5:
                    afficherPatrimoineClints(uneBanque);
                    break;
                case 6:
                    afficherpatrimoinUnClient(uneBanque);
                    break;
                case 7:
                    Virer(uneBanque);
                    break;
                case 8:
                    RetirerCompteCourant(uneBanque);
                    break;
                case 9:
                    RetirerCompteEpargne(uneBanque);
                    break;
            }
            choix = menu();
        }
    }

    private static int menu() {

        System.out.println("Menu général");
        System.out.println();
        System.out.println("1..Affecher Salair de tous les Commerciaux");
        System.out.println("2..Afficher le salaire de tous les administratifs");
        System.out.println("3..afficher le salaire et le nom d'un Adminstratif ");
        System.out.println("4..afficher le salaire et le nom d'un commercial");
        System.out.println("5..Affecher le Patrimoine de tous les Clients");
        System.out.println("6..afficher le patrimoine d'un Client");
        System.out.println("7..virerement d'un compte à un autre et afficher le solde de chacun.");
        System.out.println("8..Retirer une somme d'un Compte Courant et afficher le solde.");
        System.out.println("9..Retirer une somme d'un Compte Epargne et afficher le solde");

        System.out.println("0..Quitter");
        return Clavier.saisie_int("Votre choix : ");
    }

    private static void AffecherSalairCommerciaux(Banque uneBanque) {
        List<Commercial> Commerciaux = uneBanque.getCommerciaux();
        for (Commercial unCommercial : Commerciaux) {
            System.out.println("nom comercial " + unCommercial.getNom() + " prenom commercial "
                    + unCommercial.getPrenom() + " salair " + unCommercial.CalculeSalaire());
        }
    }

    private static void AffecherSalaireAdminstratifs(Banque uneBanque) {

        List<Adminstratif> desAdminstratifs = uneBanque.getAdminstratifs();
        for (Adminstratif unAdminstratif : desAdminstratifs) {
            System.out.println("nom " + unAdminstratif.getNom() + " prenom "
                    + " Salaire " + unAdminstratif.CalculeSalaire());
        }
    }

    private static void afficheAdminstratif(Banque uneBanque) {
        List<Adminstratif> desAdminstratifs = uneBanque.getAdminstratifs();
        int id = Clavier.saisie_int("idAdminstratif : ");
        boolean adminstratif = false;
        for (Adminstratif unAdminstratif : desAdminstratifs) {
            if (unAdminstratif.getIdAdminstratif() == id) {
                adminstratif = true;
                System.out.println(unAdminstratif.getNom() + " son salaire "
                        + unAdminstratif.CalculeSalaire());
            }
        }
        if (!adminstratif) {
            System.out.println("adminstratif inexistant");
        }
    }

    private static void affichercommercial(Banque uneBanque) {
        List<Commercial> desCommercials = uneBanque.getCommerciaux();
        int id = Clavier.saisie_int("idCommercial : ");
        boolean commercial = false;
        for (Commercial unCommercial : desCommercials) {
            if (unCommercial.getIdCommercial() == id) {
                commercial = true;
                System.out.println(unCommercial.getNom() + " son salaire "
                        + unCommercial.CalculeSalaire());
            }
        }
        if (!commercial) {
            System.out.println("Comercial inexistant");
        }
    }

    private static void afficherPatrimoineClints(Banque uneBanque) {
        double patrimoine = 0;
        List<Client> desClients = uneBanque.getClients();
        for (Client unClient : desClients) {
            patrimoine = unClient.CalculePatrimoine();
            System.out.println("nom " + unClient.getNom() + " prenom " + unClient.getPrenom()
                    + " patrimoine " + patrimoine);
        }
    }

    private static void afficherpatrimoinUnClient(Banque uneBanque) {
        List<Client> desClients = uneBanque.getClients();
        boolean patrimoin = false;
        int id = Clavier.saisie_int("idClient : ");
        for (Client unClient : desClients) {
            if (unClient.getIdClient() == id) {
                patrimoin = true;
                System.out.println("le client: " + unClient.getNom()
                        + " le patrimoine : " + unClient.CalculePatrimoine());
            }

        }
        if (!patrimoin) {
            System.out.println("client inexistant");
        }
    }

    private static void Virer(Banque uneBanque) {

        String numero = Clavier.saisie_string("N°Compte (retirer) : ");
        String numero1 = Clavier.saisie_string("N°Compte (verser) : ");
        double virement = Clavier.saisie_double("montant à virer : ");
        CompteCourant fromCompte = null;
        CompteCourant toCompte = null;

        List<Client> desClients = uneBanque.getClients();
        for (Client unClient : desClients) {
            List<CompteCourant> desCompteCourants = unClient.getCompteCourants();
            for (CompteCourant unCompteCourant : desCompteCourants) {
                if (numero.contains(unCompteCourant.getNumero())) {
                    fromCompte = unCompteCourant;
                }
                if (numero1.contains(unCompteCourant.getNumero())) {
                    toCompte = unCompteCourant;
                }
            }
        }

        if (fromCompte != null && toCompte != null) {
            System.out.print("Virement (" + virement + " euros) de ");
            System.out.print(fromCompte.getNumero() + " (solde " + fromCompte.getSolde() + ") ");
            System.out.println("à " + toCompte.getNumero() + " (solde " + toCompte.getSolde() + ") ");
            fromCompte.Retirer(virement);
            toCompte.Verser(virement);
            System.out.println("Soldes apres le virement:");
            System.out.println(fromCompte.getNumero() + "(solde " + fromCompte.getSolde() + ") ");
            System.out.println(toCompte.getNumero() + "(solde " + toCompte.getSolde());
        } else {
            System.out.println("compte inexistant");
        }

    }

    private static void RetirerCompteCourant(Banque uneBanque) {
        String numero = Clavier.saisie_string("N°Compte : ");
        double retirait = Clavier.saisie_double("montant à retirer : ");
        CompteCourant retirerCompteCourant = null;
        List<Client> desClients = uneBanque.getClients();
        for (Client unClient : desClients) {
            List<CompteCourant> desCompteCourants = unClient.getCompteCourants();
            for (CompteCourant unCompteCourant : desCompteCourants) {
                if (numero.contains(unCompteCourant.getNumero())) {
                    retirerCompteCourant = unCompteCourant;
                }
            }
        }
        if (retirerCompteCourant != null) {
            System.out.print("retirer (" + retirait + "euros) de ");
            System.out.println(retirerCompteCourant.getNumero()
                    + " (solde " + retirerCompteCourant.getSolde() + ") ");
            retirerCompteCourant.Retirer(retirait);
            System.out.println("Soldes apres le retirer:");
            System.out.println(retirerCompteCourant.getNumero()
                    + "(solde " + retirerCompteCourant.getSolde() + ") ");
        } else {
            System.out.println("compte inexistant");
        }
    }

    private static void RetirerCompteEpargne(Banque uneBanque) {
        String numero = Clavier.saisie_string("N°Compte : ");
        double retirait = Clavier.saisie_double("montant à retirer : ");
        CompteEpargne retirerCompteEpargne = null;
        List<Client> desClients = uneBanque.getClients();
        for (Client unClient : desClients) {
            List<CompteEpargne> desCompteEpargnes = unClient.getCompteEpargnes();
            for (CompteEpargne unCompteEpargne : desCompteEpargnes) {
                if (numero.contains(unCompteEpargne.getNumero())) {
                    retirerCompteEpargne = unCompteEpargne;
                }
            }
        }
        if (retirerCompteEpargne != null) {
            System.out.print("retirer (" + retirait + "euros) de ");
            System.out.println(retirerCompteEpargne.getNumero()
                    + " (solde " + retirerCompteEpargne.getSolde() + ") ");
            retirerCompteEpargne.Retirer(retirait);
            System.out.println("Soldes apres le retirer:");
            System.out.println(retirerCompteEpargne.getNumero()
                    + "(solde " + retirerCompteEpargne.getSolde() + ") ");
        } else {
            System.out.println("compte inexistant");
        }
    }
}
