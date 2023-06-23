public class Reservation {
    private Client client;
    private Seance seance;
    private String place;

    public Reservation(Client client, Seance seance, String place){
        this.client = client;
        this.seance = seance;
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Seance getSeance() {
        return seance;
    }

    public void setSeance(Seance seance) {
        this.seance = seance;
    }
}
