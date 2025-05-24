package Examens_Tp.GestionCommandeResto;

public class Plat extends Produit implements Affichable {
    private TypePlat typePlat;
    private int calories;

    public Plat(int id, String nom, double prix, TypePlat typePlat, int calories) {
        super(id, nom, prix);
        this.typePlat = typePlat;
        this.calories = calories;
    }

    public TypePlat getTypePlat() {
        return typePlat;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public void afficher() {
        System.out.println("ID: " + getId());
        System.out.println("Nom: " + getNom());
        System.out.println("Prix: " + getPrix() + " €");
        System.out.println("Type: " + typePlat);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("---------------------------");
    }
}

