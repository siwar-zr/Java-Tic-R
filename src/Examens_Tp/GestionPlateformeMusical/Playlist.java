package Examens_Tp.GestionPlateformeMusical;
import java.util.ArrayList;
import java.util.Iterator;

public class Playlist {
    private ArrayList<Morceau> morceaux;

    public Playlist() {
        morceaux = new ArrayList<>();
    }

    public void ajouterMorceau(Morceau morceau) {
        morceaux.add(morceau);
        System.out.println("Morceau ajouté avec succès.");
    }

    public boolean supprimerMorceauParId(int id) {
        Iterator<Morceau> iterator = morceaux.iterator();
        while (iterator.hasNext()) {
            Morceau m = iterator.next();
            if (m.getId() == id) {
                iterator.remove();
                System.out.println("Morceau supprimé avec succès.");
                return true;
            }
        }
        System.out.println("Aucun morceau trouvé avec l'ID " + id);
        return false;
    }


    public void rechercherParArtiste(String artiste) {
        boolean trouve = false;
        for (Morceau m : morceaux) {
            if (m.getArtiste().equalsIgnoreCase(artiste)) {
                m.afficher();
                trouve = true;
            }
        }
        if (!trouve) {
            System.out.println("Aucun morceau trouvé pour l'artiste : " + artiste);
        }
    }

    public int calculerDureeTotale() {
        int total = 0;
        for (Morceau m : morceaux) {
            total += m.getDuree();
        }
        return total;
    }

    public void afficherMorceaux() {
        if (morceaux.isEmpty()) {
            System.out.println("La playlist est vide.");
        } else {
            System.out.println("Liste des morceaux dans la playlist :");
            for (Morceau m : morceaux) {
                m.afficher();
            }
        }
    }
}

