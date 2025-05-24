package Examens_Tp.GestionPlateformeMusical;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Gestion de la Playlist ---");
            System.out.println("1. Ajouter un morceau");
            System.out.println("2. Supprimer un morceau par ID");
            System.out.println("3. Rechercher les morceaux par artiste");
            System.out.println("4. Afficher tous les morceaux");
            System.out.println("5. Afficher la durée totale de la playlist");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la fin de ligne apres nextint

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du morceau : ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Entrez le titre du morceau : ");
                    String titre = scanner.nextLine();

                    System.out.print("Entrez la durée (en secondes) : ");
                    int duree = Integer.parseInt(scanner.nextLine());

                    System.out.print("Entrez le nom de l'artiste : ");
                    String artiste = scanner.nextLine();

                    System.out.println("Choisissez le genre musical :");
                    for (GenreMusical genre : GenreMusical.values()) {
                        System.out.println((genre.ordinal() + 1) + ". " + genre);
                    }
                    System.out.print("Votre choix : ");
                    int genreChoix = Integer.parseInt(scanner.nextLine());
                    if (genreChoix < 1 || genreChoix > GenreMusical.values().length) {
                        System.out.println("Genre invalide, opération annulée.");
                        return;
                    }
                    GenreMusical genre = GenreMusical.values()[genreChoix - 1];

                    System.out.print("Entrez l'année de sortie : ");
                    int anneeSortie = Integer.parseInt(scanner.nextLine());

                    Morceau morceau = new Morceau(id, titre, duree, artiste, genre, anneeSortie);
                    playlist.ajouterMorceau(morceau);
                    break;
                case 2:
                    System.out.print("Entrez l'ID du morceau à supprimer : ");
                    try {
                        int idMorceau = Integer.parseInt(scanner.nextLine());
                        playlist.supprimerMorceauParId(idMorceau);
                    } catch (NumberFormatException e) {
                        System.out.println("ID invalide.");
                    }
                    break;
                case 3:
                    System.out.print("Entrez le nom de l'artiste à rechercher : ");
                    String artisteRech = scanner.nextLine();
                    playlist.rechercherParArtiste(artisteRech);
                    break;
                case 4:
                    playlist.afficherMorceaux();
                    break;
                case 5:
                    int dureeTotale = playlist.calculerDureeTotale();
                    System.out.println("Durée totale de la playlist : " + dureeTotale + " secondes");
                    break;
                case 6:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        } while (choix != 6);

        scanner.close();
    }
    
}

