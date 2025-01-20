/*Votre tâche est de créer un système de commande de voiture. Un client doit pouvoir choisir différentes options pour sa voiture. 

Les options sont en Enum et non en String.

Créer au moins 2 exemples de voiture avec le Director, et un exemple libre. Afficher le contenu via un toString. */

public class Main {
    public static void main(String[] args) {
        Pizza marguerita = PizzaDirector.makeMargueritaFine();
        Pizza reine = PizzaDirector.makeReineEpaisse();

        Pizza custom = new Pizza.PizzaBuilder("Crème", 30).garnitures("Oignon").garnitures("lardons").build();

        System.out.println(marguerita.toString());
        System.out.println(reine.toString());
        System.out.println(custom.toString());

    }
}