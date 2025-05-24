package Examens_Tp.GestionPlateformeMusical;

public abstract class Media {
    private int id;
    private String titre;
    private int duree; // en sec

    public Media(int id, String titre, int duree) {
        this.id = id;
        this.titre = titre;
        this.duree = duree;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public int getDuree() {
        return duree;
    }

    public abstract void afficher();
}

