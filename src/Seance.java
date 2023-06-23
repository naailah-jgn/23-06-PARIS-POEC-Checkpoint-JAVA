    import java.sql.Time;
    import java.util.ArrayList;
    import java.util.Date;

    import java.util.List;

    public class Seance {
        private Film film;
        private Date seanceDate;
        private Time seanceHeure;
        private Salle salle;
        private List<Reservation> reservationsList = new ArrayList<>();

        public Seance(Film film, Date seanceDate, Time seanceHeure, Salle salle){
            this.film = film;
            this.seanceDate = seanceDate;
            this.seanceHeure = seanceHeure;
            this.salle = salle;
        }

        public Film getFilm() {
            return film;
        }

        public void setFilm(Film film) {
            this.film = film;
        }

        public Date getSeanceDate() {
            return seanceDate;
        }

        public void setSeanceDate(Date seanceDate) {
            this.seanceDate = seanceDate;
        }

        public Time getSeanceHeure() {
            return seanceHeure;
        }

        public void setSeanceHeure(Time seanceHeure) {
            this.seanceHeure = seanceHeure;
        }

        public Salle getSalle() {
            return salle;
        }

        public void setSalle(Salle salle) {
            this.salle = salle;
        }

        public List<Reservation> getReservationsList() {
            return reservationsList;
        }

        public void setReservationsList(List<Reservation> reservationsList) {
            this.reservationsList = reservationsList;
        }

        public void addReservation(Reservation reservation){
            int resaSize = reservationsList.size();
            int salleCapacity = salle.getCapacity();

            if(resaSize > salleCapacity) {
                reservationsList.add(reservation);
            }else{
                System.out.println("La séance est pleine");
            }
        }
    }
