public class Main {

    public static void main(String[] args) {
        // Créer un cinéma
        Cinéma cinéma = new Cinéma("MonCinéma", "123 Rue du Cinéma");
        System.out.println("Un cinéma a été créé : " + cinéma.getNom());

        // Créer une salle
        Salle salle = new Salle(100);
        cinema.ajouterSalle(salle);
        System.out.println("Une salle a été ajoutée au cinéma avec une capacité de " + salle.getCapacité());

        // Créer un film
        Film film = new Film("MonFilm", "C'est un super film!", LocalDate.now());
        System.out.println("Un film a été créé : " + film.getNom());

        // Programmer une séance
        LocalDateTime heure = LocalDateTime.now().plusDays(1); // Demain à la même heure
        cinema.programmerSeance(film, heure, salle);
        System.out.println("Une séance a été programmée pour le film " + film.getNom());

        // Créer un client
        Client client = new Client("John Doe", "johndoe@example.com");
        System.out.println("Un client a été créé : " + client.getNom());

        // Récupérer la première séance programmée pour réserver une place
        Séance seance = cinema.getSéances().get(0);
        Réservation réservation = client.réserverSéance(séance);
        System.out.println("Le client " + client.getNom() + " a réservé une place pour la séance de " + séance.getFilm().getNom());
    }
}


