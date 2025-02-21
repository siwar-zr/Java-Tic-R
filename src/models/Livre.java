package models;

public class Livre {

    private String titre;
    private String auteur;
    private boolean disponibilite;

    public Livre(String titre, String auteur, boolean disponibilite) {
        this.titre = titre;
        this.auteur = auteur;
        this.disponibilite = disponibilite;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public boolean isDisponibilite() {
        return disponibilite;
    }

    public void setDisponibilite(boolean disponibilite) {
        this.disponibilite = disponibilite;
    }

    public void emprunter(){
        if (disponibilite){
            disponibilite = false;
            System.out.println("Emprunt du livre "+ titre + " est effectue avec succes !");
        }else{
            System.out.println("Livre "+ titre + " est deja emprunte !");
        }
    }

    public void retourner(){
        if (!disponibilite){
            disponibilite = true;
            System.out.println("Livre "+ titre + " est retourne avec succes !");
        }else{
            System.out.println("Livre "+ titre + " est deja retourne !");
        }
    }

    public void showDetails(){

        System.out.println(titre + " : "+ auteur + " : "+disponibilite);
    }
}
