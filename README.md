# Système de réservation de cinéma

Le but de cet examen est de compléter un système de réservation de cinéma. Six classes principales sont fournies : `Client`, `Réservation`, `Place`, `Salle`, `Cinéma`, `Film`, et `Séance`. Certaines parties du code ont été retirées et c'est votre travail de les compléter.

## Client (45 minutes)

La classe `Client` contient des champs pour le nom (`String nom`), l'adresse email (`String email`), et une liste des réservations (`List<Réservation> réservations`).

### Tâche

1.1. Complétez la méthode `réserverSéance(Séance séance)` qui crée un nouvel objet `Réservation` (si la salle de la séance a des places disponibles), l'ajoute à la liste des réservations du client et le renvoie.

## Réservation (45 minutes)

La classe `Réservation` contient des champs pour le `Client` (`Client client`), la `Séance` (`Séance séance`), la `Salle` (`Salle salle`), et la `Place` (`Place place`).

## Film (30 minutes)

La classe `Film` contient des champs pour le nom (`String nom`), le synopsis (`String synopsis`), et la date de sortie (`LocalDate dateSortie`).

## Salle (30 minutes)

La classe `Salle` contient des champs pour la capacité (`int capacité`) et une liste des places (`List<Place> places`). Chaque `Salle` a un numéro unique et une capacité fixe déterminée lors de sa création. Lorsqu'une `Séance` est planifiée dans une `Salle`, une nouvelle liste de `Place` est créée, avec chaque `Place` marquée comme libre.

### Tâche

3.1. Ajoutez une méthode `créerPlaces()` qui génère la liste de `Place` pour la `Salle` en fonction de sa capacité. Chaque `Place` devrait avoir un numéro unique dans la `Salle`.

## Cinéma (45 minutes)

La classe `Cinéma` contient des champs pour le nom (`String nom`), son adresse (`String adresse`), et une liste des salles (`List<Salle> salles`). Chaque `Cinéma` a un nombre fixe de `Salle`, déterminé lors de sa création. Lorsqu'une `Séance` est programmée dans un `Cinéma`, elle est assignée à une `Salle` spécifique à un moment donné.

### Tâche

6.1. Ajoutez une méthode `programmerSéance(Film film, LocalDateTime heure, Salle salle)` qui crée une nouvelle `Séance` pour un `Film` donné, à une heure spécifique, dans une `Salle` donnée. Cette méthode devrait vérifier si la `Salle` est disponible à l'heure prévue avant de créer la `Séance`.

## Place (15 minutes)

La classe `Place` contient des champs pour le numéro (`int numéro`) et un booléen indiquant si la place est occupée (`boolean isOccupée`). Lorsqu'une `Place` est créée, elle est marquée comme libre. Lorsqu'un `Client` fait une

`Réservation`, la `Place` correspondante est marquée comme occupée.

### Tâche

1.1. Ajoutez une méthode `occuper()` qui marque la `Place` comme occupée. Cette méthode devrait vérifier si la `Place` est déjà occupée avant de la marquer.

---

Chaque question comprend des instructions détaillées sur ce qui doit être fait. Assurez-vous de bien lire chaque question avant de commencer à écrire votre code. Bonne chance!

---
