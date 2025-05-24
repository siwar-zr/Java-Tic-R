package Examens_Tp.GestionCommandeResto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Commande commande = new Commande();
        Scanner scanner = new Scanner(System.in);
        int choix;

        do {
            System.out.println("\n--- Gestion des Commandes ---");
            System.out.println("1. Ajouter un plat");
            System.out.println("2. Supprimer un plat par ID");
            System.out.println("3. Afficher tous les plats");
            System.out.println("4. Afficher le montant total");
            System.out.println("5. Quitter");
            System.out.print("Choisissez une option : ");

            choix = scanner.nextInt();
            scanner.nextLine(); // Consommer la fin de ligne après nextInt()

            switch (choix) {
                case 1:
                    System.out.print("Entrez l'ID du plat : ");
                    int idPlat = Integer.parseInt(scanner.nextLine());

                    System.out.print("Entrez le nom du plat : ");
                    String nom = scanner.nextLine();

                    System.out.print("Entrez le prix du plat : ");
                    double prix = Double.parseDouble(scanner.nextLine());

                    System.out.println("Choisissez le type de plat :");
                    for (TypePlat type : TypePlat.values()) {
                        System.out.println(type.ordinal() + 1 + ". " + type);
                    }
                    System.out.print("Votre choix : ");
                    int typeChoix = Integer.parseInt(scanner.nextLine());
                    if (typeChoix < 1 || typeChoix > TypePlat.values().length) {
                        System.out.println("Type invalide, opération annulée.");
                        return;
                    }
                    TypePlat typePlat = TypePlat.values()[typeChoix - 1];

                    System.out.print("Entrez le nombre de calories : ");
                    int calories = Integer.parseInt(scanner.nextLine());

                    Plat plat = new Plat(idPlat, nom, prix, typePlat, calories);
                    commande.ajouterPlat(plat);
                    break;
                case 2:
                    System.out.print("Entrez l'ID du plat à supprimer : ");
                    try {
                        int id = Integer.parseInt(scanner.nextLine());
                        commande.supprimerPlatParId(id);
                    } catch (NumberFormatException e) {
                        System.out.println("ID invalide.");
                    }
                    break;
                case 3:
                    commande.afficherPlats();
                    break;
                case 4:
                    commande.afficherMontantTotal();
                    break;
                case 5:
                    System.out.println("Au revoir !");
                    break;
                default:
                    System.out.println("Option invalide, veuillez réessayer.");
            }
        } while (choix != 5);

        scanner.close();
    }
}