import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {
    private String name;
    private String address;
    private List<Film> films = new ArrayList<>();
    private List<Seance>  seancesList = new ArrayList<>();
    private List<Salle> sallesList = new ArrayList<>();

    public Cinema(String name, String address ){ this.name = name; this.address = address; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    public List<Seance> getSeancesList() {
        return seancesList;
    }

    public void setSeancesList(List<Seance> seancesList) {
        this.seancesList = seancesList;
    }

    public List<Salle> getSallesList() {
        return sallesList;
    }

    public void setSallesList(List<Salle> sallesList) {
        this.sallesList = sallesList;
    }

    public void addSalle(Salle salle) {
        sallesList.add(salle);
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void removeFilm(Film film) { films.remove(film); }

    public void scheduleSeance(Film film, Date date, Time time, Salle salle) {
       Seance seance = new Seance(film, date, time, salle);
        seancesList.add(seance);
    }

    public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date) {
        List<Seance> seancesOnDate = new ArrayList<>();

        for (Seance seance : seancesList) {
            if (seance.getFilm().equals(film) && seance.getSeanceDate().equals(date)) {
                seancesOnDate.add(seance);
            }
        }
        return seancesOnDate;
    }

}
