package Examens_Tp.GestionPlateformeMusical;

public class Morceau extends Media implements Affichable {
    private String artiste;
    private GenreMusical genre;
    private int anneeSortie;

    public Morceau(int id, String titre, int duree, String artiste, GenreMusical genre, int anneeSortie) {
        super(id, titre, duree);
        this.artiste = artiste;
        this.genre = genre;
        this.anneeSortie = anneeSortie;
    }

    public String getArtiste() {
        return artiste;
    }

    public GenreMusical getGenre() {
        return genre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    @Override
    public void afficher() {
        System.out.println("ID : " + getId());
        System.out.println("Titre : " + getTitre());
        System.out.println("Durée : " + getDuree() + " secondes");
        System.out.println("Artiste : " + artiste);
        System.out.println("Genre : " + genre);
        System.out.println("Année de sortie : " + anneeSortie);
        System.out.println("---------------------------");
    }
}

