# Checkpoint Java : Système de Réservation de Cinéma

## Durée: 4 heures

### Instructions générales

L'objectif de cet examen est de créer un système de réservation pour un cinéma. Le système doit gérer des films, des séances, des salles, des clients et des réservations. Vous devrez définir plusieurs classes, leurs attributs, et leurs méthodes selon les spécifications ci-dessous.

### Cinéma

Un `Cinema` a un nom, une adresse, une liste de `Film`s, une liste de `Seance`s, et une liste de `Salle`s.

Il doit y avoir des méthodes pour :

- Ajouter un film (`addFilm(Film film)`)
- Supprimer un film (`removeFilm(Film film)`)
- Programmer une séance (`scheduleSeance(Film film, Date date, Time heure, Salle salle)`)
- Récupérer toutes les séances d'un film à une date donnée (`getAllSeancesForFilmOnDate(Film film, Date date)`)

### Film

Un `Film` a un nom, un synopsis, et une date de sortie.

### Séance

Une `Seance` a un `Film`, une date, une heure, une `Salle`, et une liste de `Reservation`s.

Elle doit avoir des méthodes pour :

- Ajouter une réservation (`addReservation(Reservation reservation)`)
- Vérifier si la séance est complète (`isFull()`) qui renvoie `true` si toutes les places de la séance sont réservées, sinon `false`

### Salle

Une `Salle` a une capacité et une liste de places. Chaque place peut être représentée par une chaîne de caractères, par exemple : "A1", "B2", "C3", etc. La capacité d'une salle est égale à la taille de la liste de places.

### Client

Un `Client` a un nom, un email, et une liste de `Reservation`s.

Il doit y avoir une méthode pour :

- Faire une réservation (`reserve(Seance seance, Salle salle, String place)`) qui crée et retourne une `Reservation`. Avant de créer une réservation, cette méthode doit vérifier si la séance n'est pas complète. Si la séance est complète, la méthode retourne `null`.

### Réservation

Une `Reservation` a un `Client`, une `Seance`, une `Salle`, et une place.

### Bonus

Créez une classe `Place` avec un numéro (chaîne de caractères) et un `Map<Seance, Boolean> isOccupied`. Cette map indique si la place est occupée pour une séance donnée.

### Critères d'évaluation

- Bonne utilisation des concepts de la Programmation Orientée Objet (classes, objets, méthodes, encapsulation)
- Bonne utilisation des structures de données appropriées (Listes, Maps, etc.)
- Bonne gestion des cas d'erreur (par exemple, qu'est-ce qui se passe si on essaie de programmer une séance dans une salle qui n'existe pas ?)

Bonne chance !
