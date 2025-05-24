package Examens_Tp.GestionCommandeResto;
import java.util.ArrayList;
import java.util.Iterator;

public class Commande {
    private ArrayList<Plat> plats;

    public Commande() {
        plats = new ArrayList<>();
    }

    public void ajouterPlat(Plat plat) {
        plats.add(plat);
        System.out.println("Plat ajouté avec succès.");
    }

    public boolean supprimerPlatParId(int id) {
        Iterator<Plat> iterator = plats.iterator();
        while (iterator.hasNext()) {
            Plat p = iterator.next();
            if (p.getId() == id) {
                iterator.remove();
                System.out.println("Plat supprimé avec succès.");
                return true;
            }
        }
        System.out.println("Aucun plat trouvé avec l'ID " + id);
        return false;
    }

    public void afficherPlats() {
        if (plats.isEmpty()) {
            System.out.println("La commande est vide.");
        } else {
            System.out.println("Détails des plats dans la commande :");
            for (Plat p : plats) {
                p.afficher();
            }
        }
    }

    public double calculerMontantTotal() {
        double total = 0;
        for (Plat p : plats) {
            total += p.getPrix();
        }
        return total;
    }

    public void afficherMontantTotal() {
        System.out.printf("Montant total de la commande : %.2f €%n", calculerMontantTotal());
    }
}

